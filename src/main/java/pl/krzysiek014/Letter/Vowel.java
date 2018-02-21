package pl.krzysiek014.Letter;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Created by Krzysiek014 on 21.02.2018.
 */
public class Vowel extends Circle{

    public Vowel(double centerX, double centerY, double radius){
        this.setCenterX(centerX);
        this.setCenterY(centerY);
        this.setRadius(radius);

        this.setFill(Color.TRANSPARENT);
        this.setStroke(Color.BLACK);
    }
}