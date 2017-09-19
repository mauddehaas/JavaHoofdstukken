package HO11;

import java.awt.*;
import java.applet.Applet;

public class Vierkant extends Applet{

    public void init(){}


    public void paint (Graphics g){
         int y;
         int x;
         y=50;
         x=50;

        for (int i = 0; i < 5; i++) {
            x +=50;
            y+=50;
            g.drawRect(x,y,50,50);

        }

    }
}
