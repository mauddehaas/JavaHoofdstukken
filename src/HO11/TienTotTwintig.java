package HO11;

import java.awt.*;
import java.applet.*;

public class TienTotTwintig extends Applet {

    public void init(){}

    public void paint (Graphics g){

        int teller;
        int y = 0;

        for(teller= 10; teller < 20; teller++){
            y += 20;
            g.drawString(""+teller,350,y);
        }
    }
}
