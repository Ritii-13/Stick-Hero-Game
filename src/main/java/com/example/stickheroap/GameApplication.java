package com.example.stickheroap;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class GameApplication extends Application {
    private Stage stage;
    private Scene scene;
    @FXML
    private Rectangle stick;
    @FXML
    private ImageView cherry;
    @FXML
    private ImageView hero;
    @FXML
    private Rectangle center;
    @FXML
    private Rectangle platform;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GameApplication.class.getResource("MainScreen.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root, 335, 600);
//        String css = Objects.requireNonNull(this.getClass().getResource("Application.css")).toExternalForm();
//        scene.getStylesheets().add(css);
        stage.setTitle("Stick Hero");
        stage.setScene(scene);
        stage.show();
    }
    public Stage getStage() {
        return this.stage;
    }

    public static void main(String[] args) {
        launch();
    }
}

