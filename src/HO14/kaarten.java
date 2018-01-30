package HO14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kaarten extends Applet {
    //Arrays
    private String soort[];
    private String getal [];

    private boolean naeloob;

    private int kaart;
    private int soortkaart;

    public void init(){

        naeloob=false;

        //kaarten
        getal = new String[13];
        getal[0] = "aas";
        getal[1] = "twee";
        getal[2] = "drie";
        getal[3] = "vier";
        getal[4] = "vijf";
        getal[5] = "zes";
        getal[6] = "zeven";
        getal[7] = "acht";
        getal[8] = "negen";
        getal[9] = "tien";
        getal[10] = "boer";
        getal[11] = "vrouw";
        getal[12] = "heer";


        //soorten kaarten
        soort = new String[4];
        soort[0]= "harte";
        soort[1]= "ruite";
        soort[2]= "klaver";
        soort[3]= "schoppen";


        Button knop = new Button("Deel kaart");
        add(knop);
        knop.addActionListener(new KnopListener());

    }

    private void random() {
        kaart= (int) (Math.random() * getal.length);
        soortkaart= (int) (Math.random() * soort.length);
    }


    public void paint (Graphics g) {
        if (naeloob) {
            g.drawString( soort[soortkaart]+ " " + getal[kaart],20,200 );

        }
    }

    class KnopListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            naeloob = true;
            random();
            repaint();

        }
    }





}

