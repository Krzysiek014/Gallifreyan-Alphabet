package pl.krzysiek014.Math;

import javafx.geometry.Point2D;

/**
 * Created by Krzysiek014 on 21.02.2018.
 */
public class MathOperations {
    public Point2D getPoint(double angle, double x, double y, double r){
        x = (r * Math.sin(angle*Math.PI/180.0))+ x;
        y = (r * Math.cos(angle*Math.PI/180.0))+ y;
        return new Point2D(x,y);
    }
}
