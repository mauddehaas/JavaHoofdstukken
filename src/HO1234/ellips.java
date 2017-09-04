package HO1234;


import java.applet.Applet;
import java.awt.*;

public class ellips extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {

        setBackground(Color.pink);
        g.setColor(Color.black);
        g.drawArc(20, 20, 100, 50, 90, 45);
        g.drawArc(20, 20, 100, 50, 135, 90);
        g.drawArc(20, 20, 100, 50, 180, 135);
        g.drawArc(20, 20, 100, 50, 225, 180);
        g.drawArc(20, 20, 100, 50, 270, 225);
        g.drawArc(20, 20, 100, 50, 315, 270);
        g.drawArc(20, 20, 100, 50, 360, 315);


    }
    }