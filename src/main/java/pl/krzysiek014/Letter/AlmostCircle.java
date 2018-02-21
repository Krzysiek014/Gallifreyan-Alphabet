package pl.krzysiek014.Letter;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import pl.krzysiek014.Math.MathOperations;

/**
 * Created by Krzysiek014 on 21.02.2018.
 */
public class AlmostCircle extends Arc {

    private double angle;
    private Point2D p;
    public AlmostCircle(double angle, Circle word,double factor){
        MathOperations oper = new MathOperations();

        this.setRadiusX(100*factor);
        this.setRadiusY(100*factor);
        this.angle = angle;

        p = oper.getPoint(angle,word.getCenterX(),word.getCenterY(),oper.calculateRadius(word.getRadius(),this));
        this.setCenterX(p.getX());
        this.setCenterY(p.getY());

        this.setLength(300f);
        this.setStartAngle(angle-60f);
        this.setFill(Color.TRANSPARENT);
        this.setStroke(Color.BLACK);
    }

    public double[] getInfo() {
        return new double[]{p.getX(),p.getY(),this.getRadiusX(),0.0,angle};
    }
}
