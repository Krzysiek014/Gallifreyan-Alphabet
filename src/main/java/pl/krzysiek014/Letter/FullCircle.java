package pl.krzysiek014.Letter;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import pl.krzysiek014.Math.MathOperations;

/**
 * Created by Krzysiek014 on 21.02.2018.
 */
public class FullCircle extends Circle {

    Point2D p;
    private double angle;

    public FullCircle(Circle word, double radiusInner, double i){
        MathOperations oper = new MathOperations();
        p  = oper.getPoint(i,word.getCenterX(),word.getCenterY(),200-(100*radiusInner));
        this.angle = i;
        this.setCenterX(p.getX());
        this.setCenterY(p.getY());
        this.setRadius(radiusInner*90);

        this.setFill(Color.TRANSPARENT);
        this.setStroke(Color.BLACK);
    }

    public double[] getInfo() {
        return new double[]{p.getX(),p.getY(),this.getRadius(),0.0,angle};
    }
}
