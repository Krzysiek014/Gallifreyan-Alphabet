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
public class FullCircleOnLine extends Path{

    private Point2D startPoint, endPoint;
    private double angle;

    public FullCircleOnLine(Circle word, double radiusInner, double i){
        MathOperations oper = new MathOperations();

        startPoint = oper.getPoint(i-(radiusInner*30),word.getCenterX(),word.getCenterY(),word.getRadius());
        endPoint = oper.getPoint(i+(radiusInner*30),word.getCenterX(),word.getCenterY(),word.getRadius());

        MoveTo start = new MoveTo(startPoint.getX(),startPoint.getY());
        this.angle = i;

        ArcTo arcTo = new ArcTo();
        arcTo.setRadiusX(1);
        arcTo.setRadiusY(1);
        arcTo.setX(endPoint.getX());
        arcTo.setY(endPoint.getY());

        ArcTo arcToEnd = new ArcTo();
        arcToEnd.setRadiusX(1);
        arcToEnd.setRadiusY(1);
        arcToEnd.setX(startPoint.getX());
        arcToEnd.setY(startPoint.getY());

        this.getElements().addAll(start,arcTo,arcToEnd);
    }

    public double[] getInfo(){
        double centerX = Math.abs((startPoint.getX()+endPoint.getX())/2);
        double centerY = Math.abs((startPoint.getY()+endPoint.getY())/2);
        double diffX =(centerX-startPoint.getX())*(centerX-startPoint.getX());
        double diffY =(centerY-startPoint.getY())*(centerY-startPoint.getY());
        return new double[]{centerX,centerY,diffX,diffY,angle};
    }
}
