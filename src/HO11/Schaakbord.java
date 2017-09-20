package HO11;

import java.applet.Applet;
import java.awt.*;

public class Schaakbord extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int y, x, h, w;
        g.setColor(Color.black);
        y = 50;
        x = 50;
        w = 50;
        h = 50;

            for (int kolom = 0; kolom < 8; kolom++) {
                g.drawRect(x, y, w, h);


                //eerste rij
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, w, h);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, w, h);
                }
                x += w;
            }
            //tweede rij
            y += h;
            x = 50;
            for (int kolom2 = 0; kolom2 < 8; kolom2++) {

                if (kolom2 == 0 || kolom2 == 2 || kolom2 == 4 || kolom2 == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, w, h);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, w, h);

                }
                x += w;
        }

    }
}
