import java.awt.*;

public class Tree {

        public static void drawTreeTrunk(Graphics g){
                g.setColor(new Color(126,73,20));
                g.fillRect(775, 275, 50, 300);

        }
        public static void drawTreeGreen(Graphics g){
                g.setColor(Color.GREEN);
                g.fillOval(700,125,200,175);


        }
        public static void drawDrawTreeApples(Graphics g){
                g.setColor(Color.red);
                g.fillOval(735,155,30,30);
                g.fillOval(785,200,30,30);
                g.fillOval(725,210,30,30);
                g.fillOval(790,145,30,30);
                g.fillOval(750,250,30,30);
                g.fillOval(798,250,30,30);
                g.fillOval(840,225,30,30);
                g.fillOval(840,175,30,30);



        }

    }
