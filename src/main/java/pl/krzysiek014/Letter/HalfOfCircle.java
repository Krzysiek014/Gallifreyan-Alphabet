package pl.krzysiek014.Letter;

import javafx.geometry.Point2D;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.Circle;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import pl.krzysiek014.Math.MathOperations;

/**
 * Created by Krzysiek014 on 21.02.2018.
 */
public class HalfOfCircle extends Path{

    private ArcTo arcTo;
    private MoveTo start;
    private Point2D startPoint,endPoint;
    private double angle;

    public HalfOfCircle(Circle word, double radiusInner, double i){
        MathOperations oper = new MathOperations();

        startPoint = oper.getPoint(i-(radiusInner*30),word.getCenterX(),word.getCenterY(),word.getRadius());
        endPoint = oper.getPoint(i+(radiusInner*30),word.getCenterX(),word.getCenterY(),word.getRadius());

        start = new MoveTo(startPoint.getX(),startPoint.getY());
        this.angle = i;
        arcTo = new ArcTo();
        arcTo.setRadiusX(1);
        arcTo.setRadiusY(1);
        arcTo.setX(endPoint.getX());
        arcTo.setY(endPoint.getY());
        arcTo.setSweepFlag(true);

        this.getElements().addAll(start,arcTo);
    }

    public double[] getInfo(){
        double centerX = Math.abs((start.getX()+arcTo.getX())/2);
        double centerY = Math.abs((start.getY()+arcTo.getY())/2);
        double diffX =(centerX-start.getX())*(centerX-start.getX());
        double diffY =(centerY-start.getY())*(centerY-start.getY());
        return new double[]{centerX,centerY,diffX,diffY,angle};
    }
}
