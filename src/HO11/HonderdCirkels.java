package HO11;

import java.applet.Applet;
import java.awt.*;

public class HonderdCirkels extends Applet{

    public void init(){}

    public void paint (Graphics g){
        int y,x,w,h;
        y=0;
        x=0;
        w=10;
        h=10;

        for (int i = 0; i < 101 ; i++) {
            y =0;
            x =0;
            w +=20;
            h +=20;
            g.drawOval(x, y, w, h);
        }

    }
}
