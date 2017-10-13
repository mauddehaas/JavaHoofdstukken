package Javachallege;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Wereldtijden extends Applet {
    private TextField tekstvak;
    private int tijdbagdad,tijdhermosillo,tijdsalvador,tijdnuuk,tijd;
    //tijd nuuk is -4uur
    //tijd salvador is -5uur
    //tijd bagdad is +1
    // tijd in Hermosillo is -9


    public void init(){
        Label label = new Label("Voer een uur in");
        tekstvak=new TextField(15);
        Button knop = new Button("Toon");
        knop.addActionListener(new KnopListener());
        add(label);
        add(tekstvak);
        add(knop);
    }
    public void paint(Graphics g){

        if (tijd <= 23) {
        g.drawString("in Bagdad   "+tijdbagdad+":00",50,100);
        g.drawString("in Hermosillo   "+tijdhermosillo+":00",50,120);
        g.drawString("in Bagdad   "+tijdsalvador+":00",50,140);
        g.drawString("in Nuuk   "+tijdnuuk+":00",50,160);

            tijdbagdad = tijd + 1;
            tijdhermosillo = tijd - 9;
            tijdnuuk = tijd - 4;
            tijdsalvador = tijd - 5;
        }

        else{
            g.drawString("Ongeldige invoer",50,70);

        }
    }
    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            tijd=Integer.parseInt(s);


                repaint();

        }
    }
}

