package HO8;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MetBtw extends Applet {
    TextField tekstvak;
    Label Label;
    Button knop;
    double uitkomst1, invoercijfer, uitkomst2;
    String s;

    public void init() {

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
        Label = new Label("");
        add(Label);
        knop = new Button("OK");
        knop.addActionListener(new TekstvakListener());
        add(knop);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString("="+uitkomst2 , 100, 100);
    }


    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            invoercijfer = Double.parseDouble(s);
            uitkomst1 = invoercijfer / 100 *21;
            uitkomst2 = uitkomst1 + invoercijfer;
            repaint();
        }
    }
}

