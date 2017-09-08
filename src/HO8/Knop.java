package HO8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Knop extends Applet {
    TextField tekstvak;
    Button knop;
    Label label;

    public void init() {
        tekstvak = new TextField("", 30);
        label = new Label("Type iets in het  tekstvakje");
        knop = new Button("Ok");
        KnopListener kl = new KnopListener();
        knop.addActionListener(kl);
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
        add(label);
    }

    public void paint(Graphics g) {}


    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            repaint();
        }
    }
}

