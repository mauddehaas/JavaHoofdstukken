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
            g.drawString("Rechthoek", 185,240);

            //Ronde Rechtehoek
            g.drawRoundRect(100,250,200,100,30,30);
            g.drawString("Afgeronde rechthoek",155,370);

            //gevulde rechthoek met ovaal
            g.setColor(Color.magenta);
            g.fillRect(350,120,200,100);
            g.setColor(Color.black);
            g.drawOval(350,120,200,100);
            g.drawString("Gevulde rechthoek met ovaal",385,240);

            //gevulde ovaal;
            g.setColor(Color.magenta);
            g.fillOval(350,250,200,100);
            g.setColor(Color.black);
            g.drawString("Gevulde ovaal",415,370);

            //taartpunt met ovaal er om heen
            g.setColor(Color.black);
            g.drawOval(600,120,200,100);
            g.setColor(Color.magenta);
            g.fillArc(600, 120, 200, 100, 360, 45);
            g.setColor(Color.black);
            g.drawString("Taartpunt met ovaal eromheen",600,240);


            //cirkel
            g.setColor(Color.black);
            g.drawArc(650,250,100,100,400,400);
            g.drawString("Cirkel", 680, 370);

        }
}
