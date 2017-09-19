package HO11;

import java.awt.*;
import java.applet.*;

public class TafelDrie extends Applet {

    public void init(){

    }

    public void paint (Graphics g){
        int getal1,getal2,som,teller;
        getal1=1;
        getal2=3;
        som=getal1*getal2;
        int y =10;

        for(teller= 1; teller < 11; teller++){
            y += 20;
            g.drawString("3 x "+teller,50,y);
        }

        y=27;
        for (int i = 0; i < 10; i++) {
            som=getal1*getal2;
            getal1++;
            g.drawString("= "+som,100,y);
            y+=20;
        }
    }
}
