package com.example.Panels;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class LeftPanel extends VBox {

    private Button artistsButton;
    private Button albumsButton;
    private Button downloadsButton;
    private Button songsButton;
    private RightPanel rightPanel;

    public LeftPanel(RightPanel rightPanel) {
        this.rightPanel = rightPanel;
        this.setSpacing(10);
        this.setPadding(new Insets(10));

        artistsButton = new Button("Artists");
        albumsButton = new Button("Albums");
        downloadsButton = new Button("Downloads");
        songsButton = new Button("Songs");

        artistsButton.setOnAction(e -> switchToArtistsView());
        albumsButton.setOnAction(e -> switchToAlbumsView());
        downloadsButton.setOnAction(e -> switchToDownloadsView());
        songsButton.setOnAction(e -> switchToSongsView());

        this.getChildren().addAll(artistsButton, albumsButton, downloadsButton, songsButton);
        this.getStyleClass().add("left-panel");
    }

    private void switchToArtistsView() {
        rightPanel.switchToView("Artists");
    }

    private void switchToAlbumsView() {
        rightPanel.switchToView("Albums");
    }

    private void switchToDownloadsView() {
        rightPanel.switchToView("Downloads");
    }

    private void switchToSongsView() {
        rightPanel.switchToView("Songs");
    }
}
