package HO5;

import java.applet.Applet;
import java.awt.*;


    public class Staafdiagram extends Applet {
        int hoogtejeroen;
        int hoogteValerie;
        int hoogteHans;
        int nulpunt, yas_Valerie, yas_Hans, yas_jeroen;



        public void init() {

            //valerie
            hoogteValerie= 500;
            yas_Valerie=nulpunt-hoogteValerie;

            //jeroen
            hoogtejeroen= 100;
            yas_jeroen=nulpunt-hoogtejeroen;

            //hans
            hoogteHans=100;
            yas_Hans=nulpunt-hoogteHans;


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
            g.drawRect(50, yas_Valerie, 50, hoogteValerie);
            g.fillRect(50, yas_Valerie, 50, hoogteValerie);

            //Hans 80
            g.setColor(Color.black);
            g.drawString("Hans", 110, 270);
            g.setColor(Color.red);
            g.drawRect(100, yas_Hans, 50, hoogteHans);
            g.fillRect(100, yas_Hans, 50, hoogteHans);

            //jeroen 100
            g.setColor(Color.black);
            g.drawString("jeroen", 170, 270);
            g.setColor(Color.yellow);
            g.drawRect(150, yas_jeroen, 50, hoogtejeroen);
            g.fillRect(150, yas_jeroen, 50, hoogtejeroen);

            //x- en y-as
            g.setColor(Color.black);
            g.drawString("persoon", 220, 300);

            g.drawString("aantal in kg", 20, 20);


        }
    }
