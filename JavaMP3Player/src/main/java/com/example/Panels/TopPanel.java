package com.example.Panels;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class TopPanel extends BorderPane {

    public TopPanel() {
        // Create a label with the text "top panel here"
        Label label = new Label("top panel here");

        // Add padding to the label for better appearance
        label.setPadding(new Insets(5));

        // Add a style class to the label for styling in CSS
        label.getStyleClass().add("top-label");

        // Set the label to the center of the top panel
        this.setCenter(label);

        // Apply styles from top.css
        String css = this.getClass().getResource("css/top.css").toExternalForm();
        this.getStylesheets().add(css);

        // main.css style
        this.getStyleClass().add("top-panel");
    }
}
