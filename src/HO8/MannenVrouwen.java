package HO8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;



public class MannenVrouwen extends Applet {
    int Aantalmannen, Aantalvrouwen, Aantalpotentiëlemannen,Aantalpotentiëlevrouwen;
    Button Knoppm;
    Button Knoppv;
    Button Knopm;
    Button Knopv;

    public void init (){

        //knop voor de potenciele mannelijke leerlingen
        Knoppm = new Button("Aantalpotentiëlemannen");
        Knoppm.addActionListener(new KnoppmListener());
        add(Knoppm);

        //knop voor de potenciele vrouwelijke leerlingen
        Knoppv = new Button("Aantalpotentiëlevrouwen");
        Knoppv.addActionListener(new KnoppvListener());
        add(Knoppv);

        //knop voor de vrouwen
        Knopv = new Button("Aantalvrouwen");
        Knopv.addActionListener(new KnopvListener());
        add(Knopv);

        //knop voor de mannen
        Knopm = new Button("Aantalmannen");
        Knopm.addActionListener(new KnopmListener());
        add(Knopm);



    }

    public void paint(Graphics g) {


        g.drawString("Aantal mannen:"+Aantalmannen,20,200);
        g.drawString("Aantal vrouwen: "+Aantalvrouwen,20,220);
        g.drawString("Aantal potentiëlemannelijke leerlingen:"+Aantalpotentiëlemannen,20,240);
        g.drawString("Aantal potentiëlevrouwelijke leerlingen:"+Aantalpotentiëlevrouwen,20,260);


    }

    class KnoppmListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Aantalpotentiëlemannen++;
            repaint();
        }
    }
    class KnoppvListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Aantalpotentiëlevrouwen++;
            repaint();
        }
    }
    class KnopmListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Aantalmannen++;
            repaint();
        }
    }
    class KnopvListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Aantalvrouwen++;
            repaint();
        }
    }
}
