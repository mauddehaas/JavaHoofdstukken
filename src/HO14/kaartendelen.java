package HO14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;



public class kaartendelen extends Applet{
    String deck[] = new String[52];

   //spelers
   String speler1[] = new String [13];
   String speler2[] = new String [13];
   String speler3[] = new String [13];
   String speler4[] = new String [13];

   int speler1y = 60;
   int speler1x = 50;
   int speler2x = 180;
   int speler2y = 60;
   int speler3x = 300;
   int speler3y = 50;
   int speler4x = 400;
   int speler4y = 50;

   //kaarten
   String [] kaarten = new String[13];
   String [] kleuren = new String[4];

   Button knop;
   boolean naeloob;

   boolean muziek;


    private URL pad;
    private AudioClip sound;

public void init(){

   // pad = LoadAndPlay.class.getResource("/resources/");
    sound = getAudioClip(pad, "applaus.wav");




   naeloob = false;


   kaarten[0] = "aas";
   kaarten[1] = "twee";
   kaarten[2] = "drie";
   kaarten[3] = "vier";
   kaarten[4] = "vijf";
   kaarten[5] = "zes";
   kaarten[6] = "zeven";
   kaarten[7] = "acht";
   kaarten[8] = "negen";
   kaarten[9] = "tien";
   kaarten[10] = "boer";
   kaarten[11] = "vrouw";
   kaarten[12] = "heer";

   kleuren[0]= "harte";
   kleuren[1]= "ruite";
   kleuren[2]= "klaver";
   kleuren[3]= "schoppen";

   //knop
   knop = new Button("deel kaarten");
   knop.addActionListener(new KnopListener());
   add(knop);
  }



  class KnopListener implements ActionListener{
        public void actionPerformed (ActionEvent e) {
            deelKaarten();
            deelKleuren();

            repaint();

            naeloob = true;
            muziek = true;
        }
    }

    private String deelKaarten() {
        int random = new Random().nextInt(kaarten.length);
        String kaart = kaarten[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[kaarten.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < kaarten.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = kaarten[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }


    private String deelKleuren() {
        int random = new Random().nextInt(kleuren.length);
        String kaart = kleuren[random];

        //vervang de inhoud van deck
        String[] hulpLijst = new String[kleuren.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < kleuren.length; i++) {
            if (i != random) {
                hulpLijst[hulpindex] = kleuren[i];
                hulpindex++;
            }
        }
        deck = hulpLijst;
        return kaart;
    }

  public void paint (Graphics g) {

//    if (muziek == true){
//        sound.play();
//    }


      if (naeloob) {

          for (int i = 0; i < speler1.length; i++) {
              speler1y += 30;
              g.drawString(deelKleuren() + " " + deelKaarten(), speler1x, speler1y);
          }

          for (int i = 0; i < speler2.length; i++) {
              speler2y += 30;
              g.drawString(deelKleuren() + " " + deelKaarten(), speler2x, speler2y);
          }

          for (int i = 0; i < speler3.length; i++) {
              speler3y += 30;
              g.drawString(deelKleuren() + " " + deelKaarten(), speler3x, speler3y);
          }

          for (int i = 0; i < speler4.length; i++) {
              speler4y += 30;
              g.drawString(deelKleuren() + " " + deelKaarten(), speler4x, speler4y);
          }

          speler1y = 60;
          speler2y = 60;
          speler3y = 60;
          speler4y = 60;


      }

      g.drawString("speler 1", 50,40);
      g.drawString("speler 2", speler2x,40);
      g.drawString("speler 3", speler3x,40);
      g.drawString("speler 4", speler4x,40);

  }

}
