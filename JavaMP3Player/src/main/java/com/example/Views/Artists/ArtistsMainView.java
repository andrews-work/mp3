package com.example.Views.Artists;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class ArtistsMainView extends VBox {

    public ArtistsMainView() {
        Text text = new Text("Artists View");
        getChildren().add(text);
    }
}
