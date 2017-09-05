package HO1234;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet{


    public void init() {
    }
    public void paint(Graphics g) {
g.setColor(Color. black);
        g.drawRoundRect(100,100,100,210,100,100);
        g.fillRoundRect(100,100,100,210,100,100);

        //lichten
        //rood
        g.setColor(Color. red);
        g.fillOval(125, 120,50,50);
        g.drawOval(125, 120,50,50);

        //oranje
        g.setColor(Color. orange);
        g.fillOval(125, 180,50,50);
        g.drawOval(125, 180,50,50);

        //groen
        g.setColor(Color. green);
        g.fillOval(125, 240,50,50);
        g.drawOval(125, 240,50,50);

        //paal
        g.setColor(Color. black);
        g.fillRect(140,310,13,170);
        g.drawRect(140,310,13,170);

    }
}
