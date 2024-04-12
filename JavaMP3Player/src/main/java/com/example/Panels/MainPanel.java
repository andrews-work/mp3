package com.example.Panels;

import javafx.scene.layout.BorderPane;

public class MainPanel extends BorderPane {

    public MainPanel() {
        getStylesheets().add(getClass().getResource("css/main.css").toExternalForm());

        TopPanel topPanel = new TopPanel();
        RightPanel rightPanel = new RightPanel();
        LeftPanel leftPanel = new LeftPanel(rightPanel);

        // Set percentage sizes for children
        setTop(topPanel);
        setLeft(leftPanel);
        setRight(rightPanel);

        // Make children resize with the parent
        topPanel.prefWidthProperty().bind(widthProperty());
        leftPanel.prefHeightProperty().bind(heightProperty().subtract(topPanel.heightProperty()));
        rightPanel.prefHeightProperty().bind(heightProperty().subtract(topPanel.heightProperty()));
        rightPanel.prefWidthProperty().bind(widthProperty().subtract(leftPanel.widthProperty()));
    }
}

