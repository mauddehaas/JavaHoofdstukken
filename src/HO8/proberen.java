package HO8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class proberen extends Applet {
        Button knop;
        String schermtekst;


        public void init() {
            schermtekst= "doet deze knop wel iets";
            knop = new Button("klik op mij");
            KnopListener kl = new KnopListener();
            knop.addActionListener( kl );
            add(knop);
        }

        public void paint(Graphics g) {
            g.drawString(schermtekst, 50, 60 );
        }
        class KnopListener implements ActionListener {
            public void actionPerformed( ActionEvent e ) {
                schermtekst = "";
                repaint();
        }
    }
    }



