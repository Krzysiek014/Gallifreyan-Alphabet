package pl.krzysiek014.Controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Created by Krzysiek014 on 21.02.2018.
 */
public class WindowController {
    @FXML
    AnchorPane window;
    public void initialize(){
        Circle word = new Circle(300,300,200, Color.WHITE);
        word.setStroke(Color.BLACK);
        window.getChildren().addAll(word);
    }
}
