package pl.krzysiek014.Controllers;

import javafx.fxml.FXML;
import javafx.geometry.Point2D;
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

    private Point2D getPoint(double angle, double x, double y, double r){
        x = (r * Math.sin(angle*Math.PI/180.0))+ x;
        y = (r * Math.cos(angle*Math.PI/180.0))+ y;
        return new Point2D(x,y);
    }
}
