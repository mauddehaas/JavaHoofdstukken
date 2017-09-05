package HO5;

import java.applet.Applet;
import java.awt.*;

        public class Figuren2 extends Applet {
        Color opvulkleur;
        Color lijnkleur;
        int breedte;
        int hoogte;


        public void init() {
            opvulkleur = Color.MAGENTA;
            lijnkleur = Color.BLACK;
            breedte = 200;
            hoogte = 100;

        }
        public void paint(Graphics g) {


            //Lijn
            g.setColor(lijnkleur);
            g.drawLine(100,100,300,100);
            g.drawString("Lijn",200,112);

            //Rechthoek
            g.drawRect(100,120,breedte,hoogte);
            g.drawString("Rechthoek", 185,240);

            //Ronde Rechtehoek
            g.drawRoundRect(100,250,breedte,hoogte,30,30);
            g.drawString("Afgeronde rechthoek",155,370);

            //gevulde rechthoek met ovaal
            g.setColor(opvulkleur);
            g.fillRect(350,120,breedte,hoogte);
            g.setColor(lijnkleur);
            g.drawOval(350,120,200,100);
            g.drawString("Gevulde rechthoek met ovaal",385,240);

            //gevulde ovaal;
            g.setColor(opvulkleur);
            g.fillOval(350,250,breedte,hoogte);
            g.setColor(lijnkleur);
            g.drawString("Gevulde ovaal",415,370);

            //taartpunt met ovaal er om heen
            g.setColor(lijnkleur);
            g.drawOval(600,120,breedte,hoogte);
            g.setColor(opvulkleur);
            g.fillArc(600, 120, breedte, hoogte, 360, 45);
            g.setColor(lijnkleur);
            g.drawString("Taartpunt met ovaal eromheen",600,240);


            //cirkel
            g.setColor(lijnkleur);
            g.drawArc(650,250,100,hoogte,400,400);
            g.drawString("Cirkel", 680, 370);






        }
    }



