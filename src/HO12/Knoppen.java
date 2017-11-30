package HO12;

import java.awt.*;
import java.applet.*;


public class Knoppen extends Applet{
    Button buttons[];

    public void init(){
        buttons =new Button[25];

        for (int i = 0; i <buttons.length ; i++) {
            Button button = new Button("Knop " + (i + 1));
            buttons[i] = button;
        }


        for (int i = 0; i < buttons.length; i++) {
            add(buttons[i]);
        }

    }

}
