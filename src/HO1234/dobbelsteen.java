package HO1234;



    import java.awt.*;
import java.applet.*;

    public class dobbelsteen extends Applet {


        public void init() {
        }

        public void paint(Graphics g) {

            g.setColor(Color.black);

            //het vierkant
            g.drawRoundRect(100,100,400,400,100,100);

            //de stippen
            g.drawOval(175,175,100,100);
            g.fillOval(175,175,100,100);

            g.drawOval(325,325,100,100);
            g.fillOval(325,325,100,100);

            g.drawOval(325,175,100,100);
            g.fillOval(325,175,100,100);

            g.drawOval(175,325,100,100);
            g.fillOval(175,325,100,100);






        }
    }
