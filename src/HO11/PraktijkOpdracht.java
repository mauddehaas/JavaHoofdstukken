package HO11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdracht extends Applet{
    TextField tekstvak;
    Label label;
    String s;
    int getal,tafel,uitkomst;

    public void init(){
        tekstvak=new TextField("",20);
        tekstvak.addActionListener(new tekstvakListener());
        add (tekstvak);
        label=new Label("typ een cijfer tussen de 1 en 10");
        add (label);

    }



    public void paint(Graphics g){
        int y=20;

        for (int getal = 1; getal < 11; getal++) {
            y += 40;
            uitkomst = getal * tafel;
            g.drawString(getal + "X" + tafel + "=" +uitkomst , 50 , y);

        }
    }
    class tekstvakListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            s=tekstvak.getText();
            tafel=Integer.parseInt(s);
            repaint();
        }
    }
}
