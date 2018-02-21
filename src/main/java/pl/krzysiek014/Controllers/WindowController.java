package pl.krzysiek014.Controllers;

import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import pl.krzysiek014.Letter.AlmostCircle;
import pl.krzysiek014.Letter.FullCircle;
import pl.krzysiek014.Letter.HalfOfCircle;
import pl.krzysiek014.Math.MathOperations;

/**
 * Created by Krzysiek014 on 21.02.2018.
 */
public class WindowController {
    @FXML
    AnchorPane window;
    @FXML
    Button checkButton;
    @FXML
    TextField textField;
    public void initialize(){
        MathOperations oper = new MathOperations();
        Circle word = new Circle(300,300,200, Color.WHITE);
        word.setStroke(Color.BLACK);
        window.getChildren().addAll(word);

        checkButton.setOnAction(e->{
            window.getChildren().remove(3,window.getChildren().size());
            String[] list = textField.getText().split("");
            double radiusInner = Math.pow(0.9,list.length-1);
            for(int i =0, count = 0;i<360;i+=360/list.length,count++){
                switch (list[count].toUpperCase()){
                    case "B":
                        window.getChildren().add(new AlmostCircle(i,word,radiusInner));
                        break;
                    case "J":
                        Point2D p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),200-(100*radiusInner));
                        window.getChildren().add(new FullCircle(p.getX(),p.getY(),radiusInner*90));
                        break;
                    case "T":
                        Point2D start = oper.getPoint(i-(radiusInner*30),word.getCenterX(),word.getCenterY(),word.getRadius());
                        Point2D end = oper.getPoint(i+(radiusInner*30),word.getCenterX(),word.getCenterY(),word.getRadius());
                        window.getChildren().add(new HalfOfCircle(start.getX(),start.getY(),end.getX(),end.getY()));
                        break;
                    default:
                        break;
                }
            }
        });

    }

}
