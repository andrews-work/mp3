package com.example;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
import com.example.Panels.MainPanel;

public class Entry extends Application {

    @Override
    public void start(Stage primaryStage) {
        MainPanel mainPanel = new MainPanel();
        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();
        Scene scene = new Scene(mainPanel, bounds.getWidth(), bounds.getHeight());

        primaryStage.setScene(scene);
        primaryStage.setTitle("Big Party");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
