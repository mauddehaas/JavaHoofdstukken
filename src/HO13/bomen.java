package HO13;

import java.applet.Applet;
import java.awt.*;

public class bomen extends Applet{
    int bladx = 5;
    int blady = 5;
    int stamx = 35;
    int stamy = 60;


    public void boom (Graphics g) {
        for (int i = 0; i < 10; i++) {
            stamx += 50;
            bladx += 50;
            g.setColor(Color.blue);
            g.fillRect(stamx, stamy, 20, 50);
            g.setColor(Color.GREEN);
            g.fillOval(bladx, blady, 80, 80);
            if (i == 9) {
                stamy += 150;
                blady += 150;
                stamx = 35;
                bladx = 10;

                for (int j = 0; j < 10; j++) {
                    stamx += 55;
                    bladx += 55;
                    g.setColor(Color.blue);
                    g.fillRect(stamx, stamy, 20, 50);
                    g.setColor(Color.green);
                    g.fillOval(bladx, blady, 80, 80);
                }
            }
        }
    }

    public void paint (Graphics g){
            boom(g);
    }
}

