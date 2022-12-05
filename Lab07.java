import java.awt.*;
import java.applet.*;

// the class that draws my project
public class Lab07 extends Applet{
    public void paint(Graphics g){
        Background.drawGround(g);
        Background.drawSky(g);

        Tree.drawTreeTrunk(g);
        Tree.drawTreeGreen(g);
        Tree.drawDrawTreeApples(g);

        Flower.drawPetals(g);
        Flower.drawStem(g);
        Flower.drawLeaves(g);
        Flower.drawCenter(g);


    }
}
