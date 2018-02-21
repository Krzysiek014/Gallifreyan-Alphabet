package pl.krzysiek014.Controllers;

import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.Circle;
import javafx.scene.shape.MoveTo;
import pl.krzysiek014.Letter.*;
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
            String[] list = textField.getText().toUpperCase().split("");
            double radiusInner = Math.pow(0.9,list.length-1);
            for(int i =0, count = 0;i<360;i+=360/list.length,count++){
                LinesAndDots ld;
                Point2D p, start, end;
                double centerX, centerY, diffX, diffY;
                double[] info;
                HalfOfCircle halfOfCircle;
                switch (list[count]){
                    case "B":
                        window.getChildren().add(new AlmostCircle(i,word,radiusInner));
                        break;
                    case "D":
                        ld = new LinesAndDots("dots",3,new AlmostCircle(i,word,radiusInner),i);
                        window.getChildren().add(new AlmostCircle(i,word,radiusInner));
                        window.getChildren().addAll(ld.getDots());
                        break;
                    case "F":
                        ld = new LinesAndDots("lines",3,new AlmostCircle(i,word,radiusInner),i);
                        window.getChildren().add(new AlmostCircle(i,word,radiusInner));
                        window.getChildren().addAll(ld.getLines());
                        break;
                    case "G":
                        ld = new LinesAndDots("lines",1,new AlmostCircle(i,word,radiusInner),i);
                        window.getChildren().add(new AlmostCircle(i,word,radiusInner));
                        window.getChildren().addAll(ld.getLines());
                        break;
                    case "H":
                        ld = new LinesAndDots("lines",2,new AlmostCircle(i,word,radiusInner),i);
                        window.getChildren().add(new AlmostCircle(i,word,radiusInner));
                        window.getChildren().addAll(ld.getLines());
                        break;
                    case "J":
                        p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),200-(100*radiusInner));
                        window.getChildren().add(new FullCircle(p.getX(),p.getY(),radiusInner*90));
                        break;
                    case "K":
                        p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),200-(100*radiusInner));
                        ld = new LinesAndDots("dots",2,new FullCircle(p.getX(),p.getY(),radiusInner*90),i);
                        window.getChildren().add(new FullCircle(p.getX(),p.getY(),radiusInner*90));
                        window.getChildren().addAll(ld.getDots());
                        break;
                    case "L":
                        p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),200-(100*radiusInner));
                        ld = new LinesAndDots("dots",3,new FullCircle(p.getX(),p.getY(),radiusInner*90),i);
                        window.getChildren().add(new FullCircle(p.getX(),p.getY(),radiusInner*90));
                        window.getChildren().addAll(ld.getDots());
                        break;
                    case "M":
                        p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),200-(100*radiusInner));
                        ld = new LinesAndDots("lines",3,new FullCircle(p.getX(),p.getY(),radiusInner*90),i);
                        window.getChildren().add(new FullCircle(p.getX(),p.getY(),radiusInner*90));
                        window.getChildren().addAll(ld.getLines());
                        break;
                    case "N":
                        p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),200-(100*radiusInner));
                        ld = new LinesAndDots("lines",1,new FullCircle(p.getX(),p.getY(),radiusInner*90),i);
                        window.getChildren().add(new FullCircle(p.getX(),p.getY(),radiusInner*90));
                        window.getChildren().addAll(ld.getLines());
                        break;
                    case "P":
                        p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),200-(100*radiusInner));
                        ld = new LinesAndDots("lines",2,new FullCircle(p.getX(),p.getY(),radiusInner*90),i);
                        window.getChildren().add(new FullCircle(p.getX(),p.getY(),radiusInner*90));
                        window.getChildren().addAll(ld.getLines());
                        break;
                    case "T":
                        halfOfCircle = new HalfOfCircle(word,radiusInner,i);
                        window.getChildren().add(halfOfCircle);
                        break;
                    case "R":
                        halfOfCircle = new HalfOfCircle(word,radiusInner,i);
                        info = halfOfCircle.getInfo();
                        ld = new LinesAndDots("dots",3,info[0],info[1],Math.sqrt(info[2]+info[3]),i);
                        window.getChildren().add(halfOfCircle);
                        window.getChildren().addAll(ld.getDots());
                        break;
                    case "S":
                        halfOfCircle = new HalfOfCircle(word,radiusInner,i);
                        info = halfOfCircle.getInfo();
                        ld = new LinesAndDots("lines",3,info[0],info[1],Math.sqrt(info[2]+info[3]),i);
                        window.getChildren().add(halfOfCircle);
                        window.getChildren().addAll(ld.getLines());
                        break;
                    case "V":
                        halfOfCircle = new HalfOfCircle(word,radiusInner,i);
                        info = halfOfCircle.getInfo();
                        ld = new LinesAndDots("lines",1,info[0],info[1],Math.sqrt(info[2]+info[3]),i);
                        window.getChildren().add(halfOfCircle);
                        window.getChildren().addAll(ld.getLines());
                        break;
                    case "W":
                        halfOfCircle = new HalfOfCircle(word,radiusInner,i);
                        info = halfOfCircle.getInfo();
                        ld = new LinesAndDots("lines",2,info[0],info[1],Math.sqrt(info[2]+info[3]),i);
                        window.getChildren().add(halfOfCircle);
                        window.getChildren().addAll(ld.getLines());
                        break;
                    case "Y":
                        start = oper.getPoint(i-(radiusInner*30),word.getCenterX(),word.getCenterY(),word.getRadius());
                        end = oper.getPoint(i+(radiusInner*30),word.getCenterX(),word.getCenterY(),word.getRadius());

                        centerX = Math.abs((start.getX()+end.getX())/2);
                        centerY = Math.abs((start.getY()+end.getY())/2);
                        diffX =(centerX-start.getX())*(centerX-start.getX());
                        diffY =(centerY-start.getY())*(centerY-start.getY());
                        ld = new LinesAndDots("dots",2,centerX,centerY,Math.sqrt(diffX+diffY),i);

                        window.getChildren().add(new FullCircleOnLine(start.getX(),start.getY(),end.getX(),end.getY()));
                        window.getChildren().addAll(ld.getDots());
                        break;
                    case "Z":
                        start = oper.getPoint(i-(radiusInner*30),word.getCenterX(),word.getCenterY(),word.getRadius());
                        end = oper.getPoint(i+(radiusInner*30),word.getCenterX(),word.getCenterY(),word.getRadius());

                        centerX = Math.abs((start.getX()+end.getX())/2);
                        centerY = Math.abs((start.getY()+end.getY())/2);
                        diffX =(centerX-start.getX())*(centerX-start.getX());
                        diffY =(centerY-start.getY())*(centerY-start.getY());
                        ld = new LinesAndDots("dots",3,centerX,centerY,Math.sqrt(diffX+diffY),i);

                        window.getChildren().add(new FullCircleOnLine(start.getX(),start.getY(),end.getX(),end.getY()));
                        window.getChildren().addAll(ld.getDots());
                        break;
                    case "X":
                        start = oper.getPoint(i-(radiusInner*30),word.getCenterX(),word.getCenterY(),word.getRadius());
                        end = oper.getPoint(i+(radiusInner*30),word.getCenterX(),word.getCenterY(),word.getRadius());

                        centerX = Math.abs((start.getX()+end.getX())/2);
                        centerY = Math.abs((start.getY()+end.getY())/2);
                        diffX =(centerX-start.getX())*(centerX-start.getX());
                        diffY =(centerY-start.getY())*(centerY-start.getY());
                        ld = new LinesAndDots("lines",2,centerX,centerY,Math.sqrt(diffX+diffY),i);

                        window.getChildren().add(new FullCircleOnLine(start.getX(),start.getY(),end.getX(),end.getY()));
                        window.getChildren().addAll(ld.getLines());
                        break;
                    default:
                        break;
                }
            }
        });

    }

}
