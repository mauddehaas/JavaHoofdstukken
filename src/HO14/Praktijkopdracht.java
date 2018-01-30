package HO14;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

public class Praktijkopdracht extends Applet {
    // variabelen
    private TextField tekstvak;
    private Button knop;
    private int aantalsmileys = 23;
    private int aantalsmileys_comp = 0; // aantal smiley's berekend door computer
    private Graphics teken;
    private String SmileyFile = "smiley1.jpg"; // standaard sad smiley
    private String Bericht =""; // bericht voor foute invoer of als iemand verloren heeft

    //de vormen die weggehaald gaan worden
    private Image Afbeelding;
    private URL pad;
    //private String img [] = new String [23];

    public void init(){
        tekstvak();
        knop();
    }

    public void tekstvak(){
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new TekstvakListener());
        add(tekstvak);
    }

    public void knop(){
        knop = new Button("Speel");
        knop.addActionListener(new TekstvakListener());
        add(knop);
    }

    class TekstvakListener implements ActionListener{
        public void actionPerformed (ActionEvent e){
            String s = tekstvak.getText();
            // check of 1,2 of 3 is ingevoerd
           if (("1".equals(s)) || ("2".equals(s)) || ("3".equals(s)))
           {
               Bericht = "";
               int input = Integer.parseInt(s);
               aantalsmileys = aantalsmileys - input;

               if (aantalsmileys == 1) // we hebben verloren
                   Bericht = " Je hebt gewonnen!!";
               else {
                   // vindt dichbijzijnde getal (factor 4 + 1) door er eerst 1 af te halen zodat je niet een factor te hoog komt
                   // daarna delen door 4 en vermenigvuldigen met 4 zodat je op het dichstbijzijnde getal met factor 4 komt
                   // daarna 1 erbij (factor 4 + 1)
                   // dat aftrekken van het aantal resterende smileys geeft het aantal dat de computer moet aftrekken
                   int getal = ((aantalsmileys - 1) / 4) * 4 + 1;
                   aantalsmileys_comp = aantalsmileys - getal;
                   if (aantalsmileys_comp == 0) {
                       // we kunnen niet op een goed getal uitkomen (factor 4 +1)
                       SmileyFile = "smiley1.jpg"; // sad omdat we niet op het juiste getal uitkomen
                       aantalsmileys_comp = new Random().nextInt(4); // genereer een random getal voor aantal smiley's
                       if (aantalsmileys_comp == 0) // als het 0 is maken we er 1 van
                           aantalsmileys_comp = 1;
                   } else
                       SmileyFile = "smiley2.jpg"; // happy omdat we op het juiste getal uitkomen
                   aantalsmileys = aantalsmileys - aantalsmileys_comp;
                   if (aantalsmileys == 1) // we hebben gewonnen
                       Bericht = " Je hebt verloren!!";
               }
           }
           else {
               // fout getal ingevoerd
               Bericht = " Vul een getal tussen de 1 en 3 in!!";
           }
           // teken alles weer
            tekensmileys(teken);
            tekstvak.setText("");
            repaint();

        }
    }


    public void tekensmileys(Graphics g){
        g.drawString(" Vul een getal tussen de 1 en 3 in", 250, 50);
        g.drawString(" De computer heeft er " + aantalsmileys_comp + " weggehaald", 250, 65);
        g.drawString(" Er zijn nog " + aantalsmileys + "  smiley's over", 250, 80);
        g.setColor(Color.red);
        g.drawString(Bericht, 250, 105);
        g.setColor(Color.black);
        // teken de smiley's
        // start op 0,0
        int y = 0;
        int x = 0;
        for (int i = 0; i < aantalsmileys; i++) {
            g.drawImage(GetImage(SmileyFile), x, y, 50, 50, this);
            x += 60;
            // als er 4 op een rij staan ga naar de volgende regel en start op x=0
            if (x/60 > 3) {
                x = 0;
                y += 60;
            }
        }

    }

    public void paint (Graphics g){
        teken = g;
        tekensmileys(g);
    }

    public Image GetImage(String file)
    {
        // laad de smiley en geef het als image terug
        URL url = getClass().getResource("../resources/" + file);
        return new ImageIcon(url).getImage();
    }
}
