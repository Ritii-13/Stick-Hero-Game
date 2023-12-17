package com.example.stickheroap;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public abstract class Position {
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
    private double x_coordinate;
    private double y_coordinate;

    public Position(double x_coordinate, double y_coordinate) {
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    public abstract double getX_coordinate();

    public abstract double getY_coordinate();

    public abstract void setX_coordinate(double x_coordinate);

    public abstract void setY_coordinate(double y_coordinate);
}
