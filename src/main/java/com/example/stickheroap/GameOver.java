package com.example.stickheroap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameOver extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(GameApplication.class.getResource("GameOver.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 335, 600);
        stage.setTitle("Stick Hero");
        stage.setScene(scene);
        stage.show();
    }
}
