package com.example.Panels;

import javafx.scene.layout.StackPane;
import com.example.Views.Artists.ArtistsMainView;
import com.example.Views.Albums.AlbumsMainView;
import com.example.Views.Downloads.DownloadsMainView;
import com.example.Views.Songs.SongsMainView;

public class RightPanel extends StackPane {

    public RightPanel() {
        switchToView("Albums"); 

        // main.css style
        this.getStyleClass().add("right-panel");
    }

    public void switchToView(String viewName) {
        // Remove the current view if it exists
        getChildren().clear();

        switch (viewName) {
            case "Artists":
                getChildren().add(new ArtistsMainView());
                break;
            case "Albums":
                getChildren().add(new AlbumsMainView());
                break;
            case "Downloads":
                getChildren().add(new DownloadsMainView());
                break;
            case "Songs":
                getChildren().add(new SongsMainView());
                break;
            default:
                System.out.println("Invalid view name.");
        }
    }
}
