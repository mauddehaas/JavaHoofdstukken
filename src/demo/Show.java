
/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
        import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Show extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        //int i = 60;
        //setBackground(Color.lightGray);
       // g.setColor(Color.black);
      /*  for (i=60 ; i< 300; i=i+10) {
            g.drawString("Maud!!", 50, 60);
        g.drawString("de Haas!", 50, 71 );
      */
      
        g.setColor(Color.red);
        int[] xPoints = {100,40,150};
        int[] yPoints = {150,200,200};
        g.drawPolygon(xPoints, yPoints, 3);
        g.fillPolygon(xPoints, yPoints, 3);

        g.setColor(Color.pink);
        g.fillRect(40,200, 110, 100);
        g.drawRect(40,200, 110, 100);

        g.setColor(Color.blue);
        g.fillRect(80,230,50,30);
        g.drawRect(80,230,50,30);

        g.setColor(Color.yellow);
        g.fillRect(50,250,20,60);
        g.drawRect(50,250,20,60);


    }


}

