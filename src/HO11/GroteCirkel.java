package HO11;



import java.applet.Applet;
import java.awt.*;

public class GroteCirkel extends Applet{

    public void init(){}

    public void paint (Graphics g){
        int y,x,w,h;
        y=500;
        x=500;
        w=30;
        h=30;

        for (int i = 0; i < 50 ; i++) {
            y -=10;
            x -=10;
            w +=20;
            h +=20;
            g.drawOval(x, y, w, h);
        }

    }
}
