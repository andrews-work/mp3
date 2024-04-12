package com.example.model;

public class Song {
    private int id;
    private String artist;
    private String songName;
    private String album;
    private int year;
    private String path;

    public Song(int id, String artist, String songName, String album, int year, String path) {
        this.id = id;
        this.artist = artist;
        this.songName = songName;
        this.album = album;
        this.year = year;
        this.path = path;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
