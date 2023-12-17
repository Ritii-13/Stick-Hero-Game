package com.example.stickheroap;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class GameController {
    public static Stage stage;
    private Scene scene;
    private Parent root;
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
//    @FXML
//    private Label welcomeText;

//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");

    public void playGame(ActionEvent event) throws IOException {
        System.out.println("Play game");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        Player player1 = new Player(0,0);
//        Player.Stick stick = player.new Stick();
        PlayController playController = loader.getController();
//        playController = loader.getController();
        scene = new Scene(root);
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if(keyEvent.getCode().toString().equals("SPACE")){
                    System.out.println("Space pressed");
                    playController.extendStick(player1);
                }
            }
        });
        scene.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if(keyEvent.getCode().toString().equals("SPACE")){
                    System.out.println("Space released");
                    playController.translateStick(player1);
                    //playController.rotateStick(player1);
                    //playController.flipHero(player1);
                    //playController.fall(player1);
                }
            }

        });

        stage.setScene(scene);
        stage.show();
    }
    public void home(ActionEvent event) throws IOException {
        System.out.println("Home");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainScreen.fxml")));
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void soundOff(ActionEvent event) throws IOException{
        System.out.println("Sound off");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainScreen2.fxml")));
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void soundOn(ActionEvent event) throws IOException{
        System.out.println("Sound off");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("MainScreen.fxml")));
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void leaderboard(ActionEvent event) throws IOException{
        System.out.println("Leaderboard");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Leaderboard.fxml")));
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void savedGame(ActionEvent event) throws IOException{
        System.out.println("Saved game");
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("SavedGames.fxml")));
        stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

