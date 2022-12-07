import java.awt.*;

public class Lake {

        public static void drawBody(Graphics g){
            g.setColor(new Color(66,68,250));
            g.drawOval(180,350,480,280);
            g.setColor(new Color(43,125,250));
            g.fillOval(180,350,480,280);

        }
        public static void drawLilyPads(Graphics g){
            g.setColor(new Color(9,113,35));
            g.fillOval(260,380,50,50);
            g.fillOval(220,420,50,50);
            g.fillOval(260,420,50,50);
            g.fillOval(220,480,50,50);
            g.fillOval(230,530,50,50);
            g.fillOval(185,460,50,50);
            g.fillOval(255,470,50,50);
            g.fillOval(265,510,50,50);
            g.fillOval(275,550,50,50);

            g.fillOval(550,400,50,50);
            g.fillOval(580,435,50,50);



        }
    public static void drawCatTails(Graphics g){
            g.setColor(new Color(217,173,15));
            g.fillRect(200,370,6,40);
            g.fillRect(185,395,6,40);
            g.fillRect(170,415,6,40);

            g.setColor(new Color(126,73,20));
            g.fillOval(194,350,18,30);
            g.fillOval(178,372,18,30);
            g.fillOval(162,394,18,30);


    }


}


