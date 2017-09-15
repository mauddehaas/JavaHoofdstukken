package HO10;


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class SchrikkelJaar extends Applet {
    TextField tekstvak;
    Label label;
    int jaartal;
    String s, tekst;

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new Teksvaklistener());
        label = new Label("type een jaartal en druk op enter");
        tekst = "";
        add(tekstvak);
        add(label);

    }

    public void paint(Graphics g) {
        g.drawString("" + tekst, 50, 60);
    }

    class Teksvaklistener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            jaartal = Integer.parseInt(s);

            if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) || (jaartal % 400 ==0 ) ){
                tekst = "dit jaar is een schrikkeljaar";
            } else {
                tekst = "dit jaar is geen schrikkeljaar";
            }
            repaint();
        }
    }
}


