package pl.krzysiek014.Letter;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Created by Krzysiek014 on 21.02.2018.
 */
public class FullCircle extends Circle {
    public FullCircle(double x, double y, double r){
        this.setCenterX(x);
        this.setCenterY(y);
        this.setRadius(r);

        this.setFill(Color.WHITE);
        this.setStroke(Color.BLACK);
    }
}
