package com.example.Views.Downloads;

import java.io.File;
import java.sql.SQLException;

import com.example.database.SongDao;
import com.example.model.Song;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public class DownloadsMainView extends VBox {
    private Button addFileButton;
    private Button webButton;
    private WebView webView;
    private Label selectedFileLabel;

    public DownloadsMainView() {
        Label titleLabel = new Label("Downloads View");
        getChildren().add(titleLabel);

        addFileButton = new Button("Add File");
        addFileButton.setOnAction(event -> handleAddFileButtonClick());
        addFileButton.getStyleClass().add("add-file-button");

        selectedFileLabel = new Label("");

        webButton = new Button("Web");
        webButton.setOnAction(event -> switchToWebView());
        webButton.getStyleClass().add("web-button");

        getChildren().addAll(addFileButton, selectedFileLabel, webButton);
        getStyleClass().add("downloads-main-view");

        webView = new WebView();
        webView.setVisible(false);
        getChildren().add(webView);

        getStylesheets().add(getClass().getResource("/com/example/Views/Downloads/css/downloads.css").toExternalForm());
    }

    private void handleAddFileButtonClick() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Choose an MP3 File");
        fileChooser.getExtensionFilters().add(new ExtensionFilter("MP3 Files", "*.mp3"));

        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            // Here, you should extract the metadata (artist, songName, album, year) from the selectedFile.
            // For simplicity, let's assume you have already extracted the metadata.
            String artist = "Example Artist";
            String songName = "Example Song";
            String album = "Example Album";
            int year = 2022;
            String path = selectedFile.getAbsolutePath();

            Song song = new Song(0, artist, songName, album, year, path);
            SongDao songDao = new SongDao();

            try {
                songDao.addSong(song);
                selectedFileLabel.setText("Selected file: " + selectedFile.getAbsolutePath() + " (Saved to database)");
            } catch (SQLException e) {
                Alert alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Failed to save the song to the database.");
                alert.setContentText("Please check the console for more details.");
                alert.showAndWait();

                e.printStackTrace();
            }
        } else {
            selectedFileLabel.setText("");
        }
    }

    private void switchToWebView() {
        webView.setVisible(true);
        addFileButton.setVisible(false);
        selectedFileLabel.setVisible(false);
    }
}
