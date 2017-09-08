package HO1234;

import java.awt.*;
import java.applet.*;

public class RechthoekHuisVlag extends Applet{

    public void init() {

    }
    public void paint(Graphics g) {

        //dak
        g.setColor(Color.red);
        int[] xPoints = {100,40,150};
        int[] yPoints = {150,200,200};
        g.drawPolygon(xPoints, yPoints, 3);
        g.fillPolygon(xPoints, yPoints, 3);
        //house
        g.setColor(Color.pink);
        g.fillRect(40,200, 110, 100);
        g.drawRect(40,200, 110, 100);
        //window
        g.setColor(Color.blue);
        g.fillRect(80,230,50,30);
        g.drawRect(80,230,50,30);
        //door
        g.setColor(Color.yellow);
        g.fillRect(50,250,20,50);
        g.drawRect(50,250,20,50);

        //vlag
        g.setColor(Color.black);
        g.fillRect(170,100,10,200);
        g.drawRect(170,100,10,200);

        //rood
        g.setColor(Color.red);
        g.fillRect(180,100,100,25);
        g.drawRect(180,100,100,25);
        //wit
        g.setColor(Color.white);
        g.drawRect(180,125,100,25);
        g.fillRect(180,125,100,25);
        //blauw
        g.setColor(Color.blue);
        g.drawRect(180,150,100,25);
        g.fillRect(180,150,100,25);













    }


}

