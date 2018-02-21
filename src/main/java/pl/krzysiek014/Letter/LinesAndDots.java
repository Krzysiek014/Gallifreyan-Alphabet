package pl.krzysiek014.Letter;

import javafx.geometry.Point2D;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Path;
import pl.krzysiek014.Math.MathOperations;

/**
 * Created by Krzysiek014 on 21.02.2018.
 */
public class LinesAndDots{

    Line[] lines;

    public LinesAndDots(String what, int howMany, Circle c, double angle){
        switch (what){
            case "lines":
                lines = makeLines(c.getCenterX(),c.getCenterY(),c.getRadius(),howMany, angle);
                break;
            case "dots":
                break;
        }
    }
    public LinesAndDots(int howMany, Arc c){

    }
    public LinesAndDots(int howMany, Path c){

    }

    private Line[] makeLines(double centerX, double centerY, double radius, double howMany, double angle){
        MathOperations oper = new MathOperations();
        if(howMany==1){
            Point2D start = oper.getPoint(180+angle,centerX,centerY,radius);
            Point2D end = oper.getPoint(180+angle,centerX,centerY,radius+20);
            Line l = new Line(start.getX(),start.getY(),end.getX(),end.getY());
            return new Line[]{l};
        }else if(howMany==2){
            Point2D start1 = oper.getPoint(150+angle,centerX,centerY,radius);
            Point2D start2 = oper.getPoint(210+angle,centerX,centerY,radius);
            Point2D end1 = oper.getPoint(150+angle,centerX,centerY,radius+20);
            Point2D end2 = oper.getPoint(210+angle,centerX,centerY,radius+20);
            Line l1 = new Line(start1.getX(),start1.getY(),end1.getX(),end1.getY());
            Line l2 = new Line(start2.getX(),start2.getY(),end2.getX(),end2.getY());
            return new Line[]{l1,l2};
        }else if(howMany==3){
            Point2D start1 = oper.getPoint(180+angle,centerX,centerY,radius);
            Point2D start2 = oper.getPoint(210+angle,centerX,centerY,radius);
            Point2D start3 = oper.getPoint(150+angle,centerX,centerY,radius);
            Point2D end1 = oper.getPoint(180+angle,centerX,centerY,radius+20);
            Point2D end2 = oper.getPoint(210+angle,centerX,centerY,radius+20);
            Point2D end3 = oper.getPoint(150+angle,centerX,centerY,radius+20);
            Line l1 = new Line(start1.getX(),start1.getY(),end1.getX(),end1.getY());
            Line l2 = new Line(start2.getX(),start2.getY(),end2.getX(),end2.getY());
            Line l3 = new Line(start3.getX(),start3.getY(),end3.getX(),end3.getY());
            return new Line[]{l1,l2,l3};
        }
        return new Line[0];
    }

    private void makeDots(double centerX, double centerY, double radius, double howMany){
//        if(howMany==1){
//
//        }
    }

    public Line[] getLines() {
        return lines;
    }
}
