package HO6;

import java.applet.Applet;
import java.awt.*;


public class IntPsitiefNegatief extends Applet {
    int uitkomst;


    public void init (){
        uitkomst=2147483647+4;


    }
    public void paint(Graphics g) {

        g.drawString("DE uitkomst:  "+ uitkomst,20,20);



    }

}


