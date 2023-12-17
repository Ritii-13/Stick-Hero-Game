package com.example.stickheroap;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Game {
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
    private Player player;
    private int score = 0;

    public Game(Player player) {
        this.player = player;
    }

    public int getID(Player player) {
        return player.getPlayerID();
    }

//    public void setID(Player player, int PlayerID) {
//        player.setPlayerID(PlayerID);
//    }

    public void updateScore() {
        score++;
    }

    public int getScore() {
        return score;
    }

    public void resumeGame() {
    }

}

