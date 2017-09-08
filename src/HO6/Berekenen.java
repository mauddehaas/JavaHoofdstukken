package HO6;


import java.applet.Applet;
import java.awt.*;


public class Berekenen extends Applet {

     double prijsjan,prijsali, prijsjeannette,prijsmaud,prijsontvangst;


    public void init (){
        prijsontvangst=113.0/4;
        prijsali= prijsontvangst;
        prijsjan= prijsontvangst;
        prijsjeannette= prijsontvangst;
        prijsmaud= prijsontvangst;





    }
    public void paint(Graphics g) {

        g.setColor(Color.blue);

        g.drawString("Jan krijgt:" + prijsjan,20,20);
        g.drawString("Ali krijgt:" + prijsali,20,35);
        g.drawString("Jeannette krijgt:" + prijsjeannette,20,50);
        g.drawString("Maud krijgt:" + prijsmaud,20,65);






    }

}



