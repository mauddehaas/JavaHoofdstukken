package HO8;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Knop extends Applet {
    TextField tekstvak;
    Label label;
    Button knop1;
    Button knop2;
    String s;


    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type iets in het  tekstvakje");
        add(label);
        add(tekstvak);
        knop1 = new Button();
        knop1.addActionListener(new Knop1Listener());
        knop1.setLabel("OK");
        add(knop1);
        s = "";

        knop2 = new Button("Reset");
        add(knop2);
        knop2.addActionListener(new Knop2Listener());

    }

    public void paint(Graphics g) {

        g.drawString(s, 50, 80);

    }


    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           s = tekstvak.getText();
           repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
        }
    }
}
