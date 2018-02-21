package pl.krzysiek014.Letter;

import javafx.scene.shape.ArcTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

/**
 * Created by Krzysiek014 on 21.02.2018.
 */
public class HalfOfCircle extends Path{
    public HalfOfCircle(double startX, double startY, double encX, double endY){
        MoveTo start = new MoveTo(startX,startY);

        ArcTo arcTo = new ArcTo();
        arcTo.setRadiusX(1);
        arcTo.setRadiusY(1);
        arcTo.setX(encX);
        arcTo.setY(endY);
        arcTo.setSweepFlag(true);

        this.getElements().addAll(start,arcTo);
    }
}
