package pl.krzysiek014.Letter;

import javafx.scene.shape.ArcTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

/**
 * Created by Krzysiek014 on 21.02.2018.
 */
public class HalfOfCircle extends Path{

    private ArcTo arcTo;
    MoveTo start;

    public HalfOfCircle(double startX, double startY, double encX, double endY){
        start = new MoveTo(startX,startY);

        arcTo = new ArcTo();
        arcTo.setRadiusX(1);
        arcTo.setRadiusY(1);
        arcTo.setX(encX);
        arcTo.setY(endY);
        arcTo.setSweepFlag(true);

        this.getElements().addAll(start,arcTo);
    }

    public double[] getInfo(){
        double centerX = Math.abs((start.getX()+arcTo.getX())/2);
        double centerY = Math.abs((start.getY()+arcTo.getY())/2);
        double diffX =(centerX-start.getX())*(centerX-start.getX());
        double diffY =(centerY-start.getY())*(centerY-start.getY());
        return new double[]{centerX,centerY,diffX,diffY};
    }
}
