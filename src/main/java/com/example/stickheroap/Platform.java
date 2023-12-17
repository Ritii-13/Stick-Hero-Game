package com.example.stickheroap;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Platform {
//    private double x_coordinate;
//    private double y_coordinate = 50;
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
    private double width;

    public Platform(double width) {

        this.width = width;
    }

//    @Override
//    public double getX_coordinate() {
//        return x_coordinate;
//    }
//
//    @Override
//    public double getY_coordinate() {
//        return y_coordinate;
//    }
//
//    @Override
//    public void setX_coordinate(double x_coordinate) {
//        this.x_coordinate = x_coordinate;
//    }
//
//    @Override
//    public void setY_coordinate(double y_coordinate) {
//        this.y_coordinate = y_coordinate;
//    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
