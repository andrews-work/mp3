package com.example.Views.Songs;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.database.SongDao;
import com.example.model.Song;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

public class SongsMainView extends VBox {

    private TableView<Song> tableView;
    private ObservableList<Song> songs;

    public SongsMainView() {
        // Create the table view and columns
        TableColumn<Song, String> artistColumn = new TableColumn<>("Artist");
        artistColumn.setCellValueFactory(new PropertyValueFactory<>("artist"));

        TableColumn<Song, String> songNameColumn = new TableColumn<>("Song Name");
        songNameColumn.setCellValueFactory(new PropertyValueFactory<>("songName"));

        TableColumn<Song, String> albumColumn = new TableColumn<>("Album");
        albumColumn.setCellValueFactory(new PropertyValueFactory<>("album"));

        TableColumn<Song, Integer> yearColumn = new TableColumn<>("Year");
        yearColumn.setCellValueFactory(new PropertyValueFactory<>("year"));

        TableColumn<Song, String> pathColumn = new TableColumn<>("Path");
        pathColumn.setCellValueFactory(new PropertyValueFactory<>("path"));

        // Create a list of TableColumn
        List<TableColumn<Song, ?>> columns = new ArrayList<>();
        columns.add(artistColumn);
        columns.add(songNameColumn);
        columns.add(albumColumn);
        columns.add(yearColumn);
        columns.add(pathColumn);

        // Add the columns to the table view
        tableView.getColumns().addAll(columns);

        // Load the songs from the database
        try {
            SongDao songDao = new SongDao();
            songs = FXCollections.observableArrayList(songDao.getAllSongs());
            tableView.setItems(songs);
        } catch (SQLException e) {
            System.out.println("Error loading songs: " + e.getMessage());
        }
        // Add the table view to the layout
        this.getChildren().add(tableView);
    }
}
