import java.awt.*;

public class Background {

        public static void drawSky(Graphics g){
        g.setColor(new Color(13,175,230));
        g.fillRect(0,0,1000,325);


        }
        public static void drawGround(Graphics g){
        g.setColor(new Color(29,240,85));
        g.fillRect(0,325,1000,325);
        }


}
