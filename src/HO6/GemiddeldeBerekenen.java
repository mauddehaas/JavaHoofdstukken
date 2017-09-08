package HO6;

import java.applet.Applet;
import java.awt.*;

public class GemiddeldeBerekenen extends Applet {
    double cijfer1,cijfer2,cijfer3,cijfer5,cijfer6,cijfer7, uitkomst,totaleuitkomst;

        public void init (){
            //cijfers behaald
        cijfer1=5.9;
        cijfer2=6.3;
        cijfer3=6.9;

        //gemiddelde
        uitkomst= (cijfer1+cijfer2+cijfer3)/3;

            cijfer5=uitkomst*10;
            //int
            cijfer6=(int)cijfer5;

            cijfer7=cijfer6/10;













        }

        public void paint(Graphics g) {

            g.drawString("Het gemiddelde is  "+cijfer7,20,20);



        }

    }





