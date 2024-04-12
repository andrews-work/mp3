package com.example.Views.Albums;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class AlbumsMainView extends VBox {

    public AlbumsMainView() {
        Text text = new Text("Albums View");
        getChildren().add(text);
    }
}
