package HO1234;

import java.awt.*;
import java.applet.*;



    public class Staafdiagram extends Applet{


        public void init() {
        }
        public void paint(Graphics g) {

            //het vak
            g.setColor(Color.black);
            g.drawRect(50,50,200,200);

            //de verdeling
            g.drawString("0",40,260);
            g.drawString("20",30,220);
            g.drawString("40",30,180);
            g.drawString("60",30,140);
            g.drawString("80",30,100);
            g.drawString("100",25,60);

            //valerie 40
            g.setColor(Color.black);
            g.drawString("Valerie",50,270);
            g.setColor(Color.blue);
            g.drawRect(50,170,50,80);
            g.fillRect(50,170,50,80);

            //Hans 80
            g.setColor(Color.black);
            g.drawString("Hans",110,270);
            g.setColor(Color.red);
            g.drawRect(100,100,50,150);
            g.fillRect(100,100,50,150);

            //jeroen 100
            g.setColor(Color.black);
            g.drawString("jeroen",170,270);
            g.setColor(Color.yellow);
            g.drawRect(150,50,50,200);
            g.fillRect(150,50,50,200);

            //x- en y-as
            g.setColor(Color.black);
            g.drawString("persoon",220,300);

            g.drawString("aantal in kg",20,20);







        }
        }




