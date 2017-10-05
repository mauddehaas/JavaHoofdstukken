package HO13;

import java.awt.*;
import java.applet.*;

public class muur extends Applet {

    public void paint(Graphics g){ tekenMuur (g,50,40,40,30);}

    void tekenMuur(Graphics g, int x1,int x2,int y1,int y2){


        for (int i = 0; i < 4; i++) {
            y1+=40;
            g.fillRect(x1,y1,x2,y2);

            for (int a = 0; a < 10; a++) {
                g.setColor(Color.red);
                g.fillRect(x1,y1,x2,y2);
                g.drawRect(x1, y1, x2, y2);
                x1 += 50;

            }
            x1=50;
        }
    }
}
