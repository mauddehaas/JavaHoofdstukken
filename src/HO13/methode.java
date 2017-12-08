package HO13;

import java.awt.*;
import java.applet.*;

public class methode extends Applet {

    public void paint(Graphics g){
       tekenDriehoek(g, 0,  0, 50, 0 ,  0, 0);
   }

    void tekenDriehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, 50);
        g.drawLine(x2, y2, x2, 50);
        g.drawLine(x3, y3, x2, 0);
    }

    }

