package com.example.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.example.model.Song;

public class SongDao {
    public List<Song> getAllSongs() throws SQLException {
        List<Song> songs = new ArrayList<>();
        String query = "SELECT * FROM info";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String artist = resultSet.getString("artist");
                String songName = resultSet.getString("songName");
                String album = resultSet.getString("album");
                int year = resultSet.getInt("year");
                String path = resultSet.getString("path");

                Song song = new Song(id, artist, songName, album, year, path);
                songs.add(song);
            }
        }

        return songs;
    }

    public boolean addSong(Song song) throws SQLException {
        String query = "SELECT * FROM info WHERE artist = ? AND songName = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement selectStatement = connection.prepareStatement(query)) {

            selectStatement.setString(1, song.getArtist());
            selectStatement.setString(2, song.getSongName());

            ResultSet resultSet = selectStatement.executeQuery();
            if (resultSet.next()) {
                return false;
            } else {
                query = "INSERT INTO info (artist, songName, album, year, path) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement insertStatement = connection.prepareStatement(query);

                insertStatement.setString(1, song.getArtist());
                insertStatement.setString(2, song.getSongName());
                insertStatement.setString(3, song.getAlbum());
                insertStatement.setInt(4, song.getYear());
                insertStatement.setString(5, song.getPath());

                insertStatement.executeUpdate();
                return true;
            }
        }
    }    
}
