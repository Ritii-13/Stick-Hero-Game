package com.example.stickheroap;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

public class MainMenu {
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
    private Game currentGame;
    private ArrayList<Game> savedGames;

    public MainMenu() {
        savedGames = new ArrayList<Game>();
    }

    public void startGame() {
    }

    public ArrayList<Game> getSavedGames() {
        return savedGames;
    }

    public void setSavedGames(ArrayList<Game> savedGames) {
    }

    public void saveGame(Game currentGame) {
    }

    public Game loadGame(Game currentGame) {
        return currentGame;
    }

    public void Leaderboard() {
    }

}

