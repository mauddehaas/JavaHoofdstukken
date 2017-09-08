package HO6;

import java.applet.Applet;
import java.awt.*;

public class UurDagJaar extends Applet{

    int uur;
    int dag;
    int jaar;
    int uitkomst;

    public void init () {

        uitkomst=60;
        uur=uitkomst*60;
        dag=uitkomst*60*24;
        jaar=uitkomst*365*24*60;


    }

    public void paint(Graphics g) {

        g.drawString("in 1 uur zitten"+uur,20,20);
        g.drawString("in 1 dag zitten"+dag,20,40);
        g.drawString("in 1 jaar zitten"+jaar,20,60);
        g.drawString("seconden",160,20);
        g.drawString("seconden",160,40);
        g.drawString("seconden",160,60);

    }
}







