package HO11;

import java.applet.Applet;
import java.awt.*;

public class Cirkel extends Applet{

    public void init(){}

    public void paint (Graphics g){
        int y,x,w,h;
        y=100;
        x=100;
        w=10;
        h=10;

        for (int i = 0; i < 5 ; i++) {
            y -= 10;
            x -=10;
            w +=20;
            h +=20;
            g.drawOval(x, y, w, h);
        }

    }
}
