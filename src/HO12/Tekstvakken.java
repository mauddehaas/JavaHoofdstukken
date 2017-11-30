package HO12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class Tekstvakken extends Applet {
    TextField tekstvak[];
    int [] getal;
    Button knop;

    public void init() {
        knop=new Button("OK");
        tekstvak = new TextField[5];
        getal=new int [5];

        for (int i = 0; i < tekstvak.length; i++) {
            TextField tekstvakken = new TextField();
            tekstvak[i] = new TextField();
            add(tekstvak[i]);

        }
        knop.addActionListener(new KnopListener());
        add(knop);
    }

    class KnopListener implements ActionListener{
        public void actionPerformed(ActionEvent e){

            for (int i = 0; i < tekstvak.length; i++) {
                getal[i]=Integer.parseInt((tekstvak[i].getText()));
            }
            Arrays.sort(getal);

            for (int i = 0; i <getal.length ; i++) {
                tekstvak[i].setText(String.valueOf(getal[i]));

            }

        }
    }

}
