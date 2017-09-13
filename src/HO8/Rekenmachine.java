package HO8;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Rekenmachine extends Applet {
    TextField Tekstvak1, reslutaat,Tekstvak2;
    Button keer, delen,min,plus;
    double uitkomst, c1, c2;





    public void init () {


        //tekstvakken
        Tekstvak1=new TextField("",12);
        add(Tekstvak1);
        Tekstvak2=new TextField("",12);
        add(Tekstvak2);


        //knop keer, delen, plus, min
        keer=new Button("*");
        add(keer);
        keer.addActionListener(new KnopkeerListener());

        delen=new Button("/");
        add(delen);
        delen.addActionListener(new KnopdelenListener());

        plus=new Button("+");
        add(plus);
        plus.addActionListener(new KnopplusListener());

        min=new Button("-");
        add(min);
        min.addActionListener(new KnopminListener());



    }
    public void paint(Graphics g) {
        g.drawString("uitkomst is"+uitkomst,100,80);
    }

    class KnopkeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s =Tekstvak1.getText();
            c1=Double.parseDouble(s);

            String a=Tekstvak2.getText();
            c2=Double.parseDouble(a);
            uitkomst= c1*c2;
            repaint();

        }
    }
    class KnopdelenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s =Tekstvak1.getText();
            c1=Double.parseDouble(s);

            String a=Tekstvak2.getText();
            c2=Double.parseDouble(a);


            uitkomst=c1/c2;
            repaint();
        }
    }
    class KnopplusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s =Tekstvak1.getText();
            c1=Double.parseDouble(s);

            String a=Tekstvak2.getText();
            c2=Double.parseDouble(a);

            uitkomst=c1+c2;
            repaint();
        }
    }
    class KnopminListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {String s =Tekstvak1.getText();
            c1=Double.parseDouble(s);

            String a=Tekstvak2.getText();
            c2=Double.parseDouble(a);

            uitkomst=c1-c2;
            repaint();
        }
    }

}

