package pl.krzysiek014.Main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by Krzysiek014 on 21.02.2018.
 */
public class Main extends Application {
    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        //TODO word class
        Circle word = new Circle(300,300,200, Color.WHITE);
        word.setStroke(Color.BLACK);
        AnchorPane ap = new AnchorPane(word);
        Scene scene = new Scene(ap,600,600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
