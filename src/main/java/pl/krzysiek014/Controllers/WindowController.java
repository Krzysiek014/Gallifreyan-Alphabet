package pl.krzysiek014.Controllers;

import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.Circle;
import javafx.scene.shape.MoveTo;
import pl.krzysiek014.Letter.*;
import pl.krzysiek014.Math.MathOperations;

import java.util.LinkedList;
import java.util.List;

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
            List<Node> listOfLetters = new LinkedList<>();
            window.getChildren().remove(3,window.getChildren().size());
            String[] list = textField.getText().toUpperCase().split("");
            double radiusInner = Math.pow(0.9,list.length-1);
            for(int i =0, count = 0;i<360;i+=360/list.length,count++){
                LinesAndDots ld;
                double[] info;
                HalfOfCircle halfOfCircle;
                FullCircleOnLine fullCircleOnLine;
                FullCircle fullCircle;
                AlmostCircle almostCircle;
                switch (list[count]){
                    case "B":
                        almostCircle = new AlmostCircle(i,word,radiusInner);
                        listOfLetters.add(almostCircle);
                        break;
                    case "D":
                        almostCircle = new AlmostCircle(i,word,radiusInner);
                        ld = new LinesAndDots("dots",3,almostCircle,i);
                        window.getChildren().addAll(ld.getDots());
                        listOfLetters.add(almostCircle);
                        break;
                    case "F":
                        almostCircle = new AlmostCircle(i,word,radiusInner);
                        ld = new LinesAndDots("lines",3,almostCircle,i);
                        window.getChildren().addAll(ld.getLines());
                        listOfLetters.add(almostCircle);
                        break;
                    case "G":
                        almostCircle = new AlmostCircle(i,word,radiusInner);
                        ld = new LinesAndDots("lines",1,almostCircle,i);
                        window.getChildren().addAll(ld.getLines());
                        listOfLetters.add(almostCircle);
                        break;
                    case "H":
                        almostCircle = new AlmostCircle(i,word,radiusInner);
                        ld = new LinesAndDots("lines",2,almostCircle,i);
                        window.getChildren().addAll(ld.getLines());
                        listOfLetters.add(almostCircle);
                        break;
                    case "J":
                        fullCircle = new FullCircle(word,radiusInner,i);
                        listOfLetters.add(fullCircle);
                        break;
                    case "K":
                        fullCircle = new FullCircle(word,radiusInner,i);
                        ld = new LinesAndDots("dots",2,fullCircle,i);
                        window.getChildren().addAll(ld.getDots());
                        listOfLetters.add(fullCircle);
                        break;
                    case "L":
                        fullCircle = new FullCircle(word,radiusInner,i);
                        ld = new LinesAndDots("dots",3,fullCircle,i);
                        window.getChildren().addAll(ld.getDots());
                        listOfLetters.add(fullCircle);
                        break;
                    case "M":
                        fullCircle = new FullCircle(word,radiusInner,i);
                        ld = new LinesAndDots("lines",3,fullCircle,i);
                        window.getChildren().addAll(ld.getLines());
                        listOfLetters.add(fullCircle);
                        break;
                    case "N":
                        fullCircle = new FullCircle(word,radiusInner,i);
                        ld = new LinesAndDots("lines",1,fullCircle,i);
                        window.getChildren().addAll(ld.getLines());
                        listOfLetters.add(fullCircle);
                        break;
                    case "P":
                        fullCircle = new FullCircle(word,radiusInner,i);
                        ld = new LinesAndDots("lines",2,fullCircle,i);
                        window.getChildren().addAll(ld.getLines());
                        listOfLetters.add(fullCircle);
                        break;
                    case "T":
                        halfOfCircle = new HalfOfCircle(word,radiusInner,i);
                        listOfLetters.add(halfOfCircle);
                        break;
                    case "R":
                        halfOfCircle = new HalfOfCircle(word,radiusInner,i);
                        info = halfOfCircle.getInfo();
                        ld = new LinesAndDots("dots",3,info[0],info[1],Math.sqrt(info[2]+info[3]),i);
                        window.getChildren().addAll(ld.getDots());
                        listOfLetters.add(halfOfCircle);
                        break;
                    case "S":
                        halfOfCircle = new HalfOfCircle(word,radiusInner,i);
                        info = halfOfCircle.getInfo();
                        ld = new LinesAndDots("lines",3,info[0],info[1],Math.sqrt(info[2]+info[3]),i);
                        window.getChildren().addAll(ld.getLines());
                        listOfLetters.add(halfOfCircle);
                        break;
                    case "V":
                        halfOfCircle = new HalfOfCircle(word,radiusInner,i);
                        info = halfOfCircle.getInfo();
                        ld = new LinesAndDots("lines",1,info[0],info[1],Math.sqrt(info[2]+info[3]),i);
                        window.getChildren().addAll(ld.getLines());
                        listOfLetters.add(halfOfCircle);
                        break;
                    case "W":
                        halfOfCircle = new HalfOfCircle(word,radiusInner,i);
                        info = halfOfCircle.getInfo();
                        ld = new LinesAndDots("lines",2,info[0],info[1],Math.sqrt(info[2]+info[3]),i);
                        window.getChildren().addAll(ld.getLines());
                        listOfLetters.add(halfOfCircle);
                        break;
                    case "Y":
                        fullCircleOnLine = new FullCircleOnLine(word,radiusInner,i);
                        info = fullCircleOnLine.getInfo();
                        ld = new LinesAndDots("dots",2,info[0],info[1],Math.sqrt(info[2]+info[3]),i);
                        window.getChildren().addAll(ld.getDots());
                        listOfLetters.add(fullCircleOnLine);
                        break;
                    case "Z":
                        fullCircleOnLine = new FullCircleOnLine(word,radiusInner,i);
                        info = fullCircleOnLine.getInfo();
                        ld = new LinesAndDots("dots",3,info[0],info[1],Math.sqrt(info[2]+info[3]),i);
                        window.getChildren().addAll(ld.getDots());
                        listOfLetters.add(fullCircleOnLine);
                        break;
                    case "X":
                        fullCircleOnLine = new FullCircleOnLine(word,radiusInner,i);
                        info = fullCircleOnLine.getInfo();
                        ld = new LinesAndDots("lines",2,info[0],info[1],Math.sqrt(info[2]+info[3]),i);
                        window.getChildren().addAll(ld.getLines());
                        listOfLetters.add(fullCircleOnLine);
                        break;
                    case "O":
                        if(count==0) {
                            Point2D p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),word.getRadius()-(40*radiusInner));
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }else if(list[count-1].matches("[TRSVW]")){
                            info = ((HalfOfCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4]+130,info[0],info[1],Math.sqrt(info[2]+info[3]));
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }else if(list[count-1].matches("[YZX]")){
                            info = ((FullCircleOnLine)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4]+130,info[0],info[1],Math.sqrt(info[2]+info[3]));
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }else if(list[count-1].matches("[JKLMNP]")){
                            info = ((FullCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4]+130,info[0],info[1],info[2]);
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }else if(list[count-1].matches("[BDFGH]")){
                            info = ((AlmostCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4]+130,info[0],info[1],info[2]);
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }else{
                            Point2D p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),word.getRadius()-(40*radiusInner));
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }
                        break;
                    case "A":
                        if(count==0) {
                            Point2D p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),word.getRadius()+(40*radiusInner));
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }else if(list[count-1].matches("[TRSVW]")){
                            info = ((HalfOfCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4],info[0],info[1],Math.sqrt(info[2]+info[3])-(40*radiusInner));
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }else if(list[count-1].matches("[YZX]")){
                            info = ((FullCircleOnLine)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4],info[0],info[1],Math.sqrt(info[2]+info[3])-(40*radiusInner));
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }else if(list[count-1].matches("[JKLMNP]")){
                            info = ((FullCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4],info[0],info[1],info[2]+(40*radiusInner));
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }else if(list[count-1].matches("[BDFGH]")){
                            info = ((AlmostCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4],info[0],info[1],info[2]+(20*radiusInner));
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }else{
                            Point2D p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),word.getRadius()+(40*radiusInner));
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }
                        break;
                    case "E":
                        if(count==0) {
                            Point2D p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),word.getRadius());
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }else if(list[count-1].matches("[TRSVW]")){
                            info = ((HalfOfCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4],word.getCenterX(),word.getCenterY(),word.getRadius());
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }else if(list[count-1].matches("[YZX]")){
                            info = ((FullCircleOnLine)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4],word.getCenterX(),word.getCenterY(),word.getRadius());
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }else if(list[count-1].matches("[JKLMNP]")){
                            info = ((FullCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            window.getChildren().addAll(new Vowel(info[0],info[1],radiusInner*20));
                        }else if(list[count-1].matches("[BDFGH]")){
                            info = ((AlmostCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            window.getChildren().addAll(new Vowel(info[0],info[1],radiusInner*20));
                        }else{
                            Point2D p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),word.getRadius());
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                        }
                        break;
                    case "I":
                        if(count==0) {
                            Point2D p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),word.getRadius());
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                            ld = new LinesAndDots("lines",1,new Vowel(p.getX(),p.getY(),radiusInner*20),i);
                            window.getChildren().addAll(ld.getLines());
                        }else if(list[count-1].matches("[TRSVW]")){
                            info = ((HalfOfCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4],word.getCenterX(),word.getCenterY(),word.getRadius());
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                            ld = new LinesAndDots("lines",1,new Vowel(p.getX(),p.getY(),radiusInner*20),info[4]);
                            window.getChildren().addAll(ld.getLines());
                        }else if(list[count-1].matches("[YZX]")){
                            info = ((FullCircleOnLine)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4],word.getCenterX(),word.getCenterY(),word.getRadius());
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                            ld = new LinesAndDots("lines",1,new Vowel(p.getX(),p.getY(),radiusInner*20),info[4]);
                            window.getChildren().addAll(ld.getLines());
                        }else if(list[count-1].matches("[JKLMNP]")){
                            info = ((FullCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            window.getChildren().addAll(new Vowel(info[0],info[1],radiusInner*20));
                            ld = new LinesAndDots("lines",1,info[0],info[1],radiusInner*20,info[4]);
                            window.getChildren().addAll(ld.getLines());
                        }else if(list[count-1].matches("[BDFGH]")){
                            info = ((AlmostCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            window.getChildren().addAll(new Vowel(info[0],info[1],radiusInner*20));
                            ld = new LinesAndDots("lines",1,info[0],info[1],radiusInner*20,info[4]);
                            window.getChildren().addAll(ld.getLines());
                        }else{
                            Point2D p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),word.getRadius());
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                            ld = new LinesAndDots("lines",1,new Vowel(p.getX(),p.getY(),radiusInner*20),i);
                            window.getChildren().addAll(ld.getLines());
                        }
                        break;
                    case "U":
                        if(count==0){
                            Point2D p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),word.getRadius());
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                            ld = new LinesAndDots("lines",1,new Vowel(p.getX(),p.getY(),radiusInner*20),i-180);
                            window.getChildren().addAll(ld.getLines());
                        }else if(list[count-1].matches("[TRSVW]")){
                            info = ((HalfOfCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4],word.getCenterX(),word.getCenterY(),word.getRadius());
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                            ld = new LinesAndDots("lines",1,new Vowel(p.getX(),p.getY(),radiusInner*20),info[4]-180);
                            window.getChildren().addAll(ld.getLines());
                        }else if(list[count-1].matches("[YZX]")){
                            info = ((FullCircleOnLine)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            Point2D p = oper.getPoint(info[4],word.getCenterX(),word.getCenterY(),word.getRadius());
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                            ld = new LinesAndDots("lines",1,new Vowel(p.getX(),p.getY(),radiusInner*20),info[4]-180);
                            window.getChildren().addAll(ld.getLines());
                        }else if(list[count-1].matches("[JKLMNP]")){
                            info = ((FullCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            window.getChildren().addAll(new Vowel(info[0],info[1],radiusInner*20));
                            ld = new LinesAndDots("lines",1,info[0],info[1],radiusInner*20,info[4]-180);
                            window.getChildren().addAll(ld.getLines());
                        }else if(list[count-1].matches("[BDFGH]")){
                            info = ((AlmostCircle)listOfLetters.get(listOfLetters.size()-1)).getInfo();
                            window.getChildren().addAll(new Vowel(info[0],info[1],radiusInner*20));
                            ld = new LinesAndDots("lines",1,info[0],info[1],radiusInner*20,info[4]-180);
                            window.getChildren().addAll(ld.getLines());
                        }else{
                            Point2D p = oper.getPoint(i,word.getCenterX(),word.getCenterY(),word.getRadius());
                            window.getChildren().addAll(new Vowel(p.getX(),p.getY(),radiusInner*20));
                            ld = new LinesAndDots("lines",1,new Vowel(p.getX(),p.getY(),radiusInner*20),i-180);
                            window.getChildren().addAll(ld.getLines());
                        }
                        break;
                    default:
                        break;
                }
            }
            window.getChildren().addAll(listOfLetters);
        });

    }

}
