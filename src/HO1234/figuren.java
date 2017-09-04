package HO1234;

import java.applet.Applet;
import java.awt.*;

public class figuren extends Applet {


        public void init() {
        }

        public void paint(Graphics g) {


            //Lijn
            g.setColor(Color.black);
            g.drawLine(100,100,300,100);
            g.drawString("Lijn",200,112);

            //Rechthoek
            g.drawRect(100,120,200,100);
            g.drawString("Rechthoek", 185,230);


        }
}
