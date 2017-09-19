package HO11;

import java.awt.*;
import java.applet.*;

public class RijVoorgangers extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        int getal1,getal2,som;
        getal1=0;
        getal2=1;
        som=getal1+getal2;
        int y = 50;


        g.drawString(""+som,20,y);

        for (int i = 0; i < 100 ; i++) {
            y +=50;
            getal1 = getal2;
            getal2 = som;
            som = getal1 + getal2;
            g.drawString(""+som,20,y);


        }

    }
}






   /* int gt1, gt2, gt3;
    int y = 0;
        gt2 = 1;
                gt1 = 1;
                gt3 = gt2 + gt1;


                for (gt3 = 0; gt3 < 1000; gt3++) ;{
        gt1=gt2;
        gt2=gt3;
        y=+20;
        g.drawString(""+gt3,100,100);
        }*/