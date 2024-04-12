package com.example.Views.Downloads;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class WebView extends VBox {
    public WebView() {
        Label label = new Label("Web View");
        getChildren().add(label);
    }
}
