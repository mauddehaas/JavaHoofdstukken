package Javachallege;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class staafdiagram2 extends Applet {
    int hoogtejeroen,hoogtevalerie,hoogtehans,nulpunt, yas_valerie, yas_hans, yas_jeroen;
    int invoerv,invoerj,invoerh;
    Button knop;
    TextField tekstvakv,tekstvakj,tekstvakh;
    String j,v,h;

    int valerie;
    int jeroen;
    int hans;

    public void init() {
        knop=new Button("Toon");
        knop.addActionListener(new KnopListener());
        add(knop);
        tekstvakh=new TextField("hoogte Hans");
        tekstvakj=new TextField("hoogte Jeroen");
        tekstvakv=new TextField("hoogte Valerie");
        add(tekstvakh);
        add(tekstvakj);
        add(tekstvakv);
        valerie = 40;
        jeroen = 60;
        hans = 80;

        nulpunt=250;


    }

    public void paint(Graphics g) {

        //het vak
        g.setColor(Color.black);
        g.drawRect(50, 50, 200, 200);

        //de verdeling
        g.drawString("0", 40, 260);
        g.drawString("20", 30, 220);
        g.drawString("40", 30, 180);
        g.drawString("60", 30, 140);
        g.drawString("80", 30, 100);
        g.drawString("100", 25, 60);

        //valerie 40
        g.setColor(Color.black);
        g.drawString("Valerie", 50, 270);
        g.setColor(Color.blue);
        g.fillRect(50, nulpunt - valerie*2, 50, valerie*2);

        //Hans 80
        g.setColor(Color.black);
        g.drawString("Hans", 110, 270);
        g.setColor(Color.red);
        g.fillRect(100, nulpunt - hans*2, 50, hans*2);

        //jeroen 100
        g.setColor(Color.black);
        g.drawString("jeroen", 170, 270);
        g.setColor(Color.yellow);
        g.fillRect(150, nulpunt - jeroen*2, 50, jeroen*2);

        //x- en y-as
        g.setColor(Color.black);
        g.drawString("persoon", 220, 300);

        g.drawString("aantal in kg", 20, 20);


    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            j= tekstvakj.getText();
            invoerj= Integer.parseInt(j);
            jeroen=invoerj;

            v=tekstvakv.getText();
            invoerv= Integer.parseInt(v);
            valerie=invoerv;

            h=tekstvakh.getText();
            invoerh= Integer.parseInt(h);
            hans=invoerh;


            repaint();
        }
    }
}
