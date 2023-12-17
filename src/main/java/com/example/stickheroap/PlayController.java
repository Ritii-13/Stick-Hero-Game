package com.example.stickheroap;

import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Objects;

import static com.example.stickheroap.GameController.stage;

public class PlayController {
//    private Stage stage;
    private Scene scene;

    @FXML
    Rectangle stick;
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
    @FXML
    private Rectangle platform2_inner;
    @FXML
    private Rectangle platform2_outer;
    @FXML
    private Text score;
    double i = 1.0;

    // Variables for stick extension
    public void extendStick(Player player) {
//        stick.setHeight(10.0);
        if(this.stick.getHeight() == 1.0) {
            i = 1.0;
        }
        i += 5;
        this.stick.setHeight(i);
        double height = this.stick.getHeight();
        this.stick.setY(-height);

    }
    public void translateStick(Player player) {
        //this.stick.setY(this.stick.getY() + this.stick.getHeight()+25);
        this.stick.setTranslateY(-this.stick.getHeight());
        PauseTransition pt = new PauseTransition(Duration.millis(500));
        pt.setOnFinished(e -> {
            this.rotateStick(player);
        });
        pt.play();
        PauseTransition pt2 = new PauseTransition(Duration.millis(1500));
        pt2.setOnFinished(e -> {
            this.fall(player);
        });
        pt2.play();
    }
    public void rotateStick(Player player) {
        double x = this.hero.getLayoutX() + this.hero.getFitWidth() + this.stick.getHeight() + this.hero.getTranslateX();
        System.out.println(x);
        Rotate rotate = new Rotate();
        rotate.setPivotX(this.stick.getX());
        rotate.setPivotY(0);
        rotate.setAngle(90);
        this.stick.getTransforms().add(rotate);
        PauseTransition pt = new PauseTransition(Duration.millis(500));
        pt.setOnFinished(e -> {
            this.hero.setTranslateX(this.stick.getHeight()+ 20);
        });
        pt.play();
//        boolean result = hero.moveForward(this.hero, pi1, p2, this.stick, anchorPane);
    }

    public void flipHero(Player player) {
        TranslateTransition tt = new TranslateTransition(Duration.millis(500), this.hero);
        tt.setByY(1000);
        tt.play();
    }
    public void fall(Player player) {
        if (this.platform2_inner.getWidth() - this.platform1.getWidth() > this.stick.getHeight() + 20 || this.platform2_outer.getWidth() - this.platform1.getWidth() < this.stick.getHeight() + 20) {
            this.flipHero(player);
            GameOver gameover = new GameOver();
            PauseTransition pt2 = new PauseTransition(Duration.millis(500));
            pt2.setOnFinished(e1 -> {
                try {
                    gameover.start(stage);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            });
            pt2.play();

        }
        else{
            score.setText("1");
        }
//        System.out.println(platform1.getLayoutX());
//        System.out.println(platform2.getLayoutX());
    }

    public boolean isGameOver() {
        if (this.platform2_inner.getWidth() - this.platform1.getWidth() > this.stick.getHeight() + 20 || this.platform2_outer.getWidth() - this.platform1.getWidth() < this.stick.getHeight() + 20) {
            return true;
        }
        return false;
    }
}
