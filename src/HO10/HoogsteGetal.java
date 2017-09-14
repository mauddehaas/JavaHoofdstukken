package HO10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class HoogsteGetal extends Applet{
     TextField tekstvak1,tekstvak2;
     Label label;
     double uitkomst,a,b,uitkomst2, antwoord;
     String s,d;


    public void init (){

        tekstvak1=new TextField("");
        tekstvak2=new TextField("");
        tekstvak1.addActionListener( new TekstvakListener());
        tekstvak2.addActionListener(new TekstvakListener());
        label=new Label("typ 2 cijfers en druk op enter");
        add(label);
        add(tekstvak1);
        add(tekstvak2);

    }

    public void paint(Graphics g){
        g.drawString("het hoogste getal is:  "+antwoord,100,100);

    }

    class TekstvakListener implements  ActionListener{
        public void actionPerformed(ActionEvent e){
            s= tekstvak1.getText();
            d= tekstvak2.getText();
            uitkomst = Integer.parseInt(s);
            uitkomst2 = Integer.parseInt(d);

                if (uitkomst > uitkomst2){
                    antwoord = uitkomst;
                }
                else  {
                    antwoord = uitkomst2;
                }
                repaint();







        }

    }
    class TekstvakListener2 implements  ActionListener{
        public void actionPerformed(ActionEvent e) {
        }

    }
}
