package HO11;


import java.applet.Applet;
import java.awt.*;

public class Schaakbord2 extends Applet
{
    int x,y,w,h;
    public void init() { }

    public void paint(Graphics g)
    {
        x=1;
        y=1;
        w=50;
        h=50;
        for(int i=1;i<=8;i++) {

            for(int j=1;j<=8;j++) {

                if(i%2==1)
                {
                    if(j%2==0)
                    {
                        g.setColor(Color.WHITE);
                    }
                    else
                    {
                        g.setColor(Color.BLACK);
                    }
                }
                else
                {

                    if(j%2==0)
                    {
                        g.setColor(Color.BLACK);
                    }
                    else
                    {
                        g.setColor(Color.WHITE);
                    }
                }
                g.fillRect(x,y,w,h);
                x=x+w;
            }

            y=y+h;
            x=1;
        }
    }
}