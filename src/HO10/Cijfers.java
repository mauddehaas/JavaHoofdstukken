package HO10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Cijfers extends Applet{
    TextField tekstvak1,tekstvak2;
    Label label;
    double gemiddelde,c1,c2;
    Button knop;
    String s,tekst,b;

    public void init(){
        setSize(800, 800);
        tekstvak1=new TextField("",20);
        tekstvak2=new TextField("",20);
        label=new Label("typ je cijfers");
        tekstvak2.addActionListener(new Tekstvaklistener());
        tekstvak1.addActionListener(new Tekstvaklistener());
        add(label);
        add(tekstvak1);
        add(tekstvak2);
        tekst="";
        gemiddelde=(c1+c2)/2;
    }

    public void paint (Graphics g){
        g.drawString("  "+tekst,50,140);
        g.drawString("je gemiddelde is:  "+ gemiddelde,50,100);
    }
     class Tekstvaklistener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            s=tekstvak1.getText();
            s=tekstvak2.getText();
            gemiddelde=Double.parseDouble(s);

            if (gemiddelde > 5.5){
                tekst= "je bent geslaagd";
            }
            else{
                tekst="helaas je bent gezakt";
            }
            repaint();
        }
     }
}
