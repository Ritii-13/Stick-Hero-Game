package com.example.stickheroap;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Player extends Position implements cherry {
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
    private Rectangle platform1;
    @FXML
    private Rectangle platform2;

    public static int cherries = 0;
    private static int PlayerID = 0;
    private double x_coordinate = 0;
    private double y_coordinate = 0;

    public Player(double x_coordinate, double y_coordinate) {
        super(x_coordinate, y_coordinate);
        PlayerID++;
    }

    public class Stick {
//        private double x_coordinate;
//        private double y_coordinate;
        private double length = 0;

        public Stick() {
//            this.x_coordinate = x_coordinate;
//            this.y_coordinate = y_coordinate;
            this.length = 0;
        }

//        public double getX_coordinate() {
//            return x_coordinate;
//        }
//
//        public double getY_coordinate() {
//            return y_coordinate;
//        }

//        public void set_coordinate(double x_coordinate, double y_coordinate) {
//            length = Math.sqrt(Math.pow(x_coordinate - this.x_coordinate, 2) + Math.pow(y_coordinate - this.y_coordinate, 2));
//            this.x_coordinate = x_coordinate;
//            this.y_coordinate = y_coordinate;
//        }

        public double getLength() {
            return length;
        }

        public void extendStick() {
            length ++;
        }
//        public void rotateStick(){
//            Timeline timeline = new Timeline();
//            timeline.getKeyFrames().addAll(
//                    new KeyFrame(Duration.ZERO, new KeyValue(stick.endXProperty(), stick.getStartX())),
//                    new KeyFrame(Duration.seconds(1), new KeyValue(stick.endXProperty(), stick.getStartX() + length))
//            );
//            timeline.play();
//        }

    }

    public int getPlayerID() {
        return PlayerID;
    }

//    public void setPlayerID(int PlayerID) {
//        this.PlayerID = PlayerID;
//    }

    public void move_horizontal() {
    }

    public void move_down() {
    }

    public void move_up() {
    }

    public void fall() {
    }

    @Override
    public double getX_coordinate() {
        return x_coordinate;
    }

    @Override
    public double getY_coordinate() {
        return y_coordinate;
    }

    @Override
    public void setX_coordinate(double x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    @Override
    public void setY_coordinate(double y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    @Override
    public void cherry_count() {
        cherries++;
    }

    @Override
    public int getCherry_count() {
        return cherries;
    }

    @Override
    public void disappearCherry() {
    }
    public double getPlatformDist() {
        System.out.println("platform2" + platform2.getX());
        System.out.println("platform1" + platform1.getX());
        return platform2.getX() - platform1.getX();
    }

}

