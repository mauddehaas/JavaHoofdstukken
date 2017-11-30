package HO12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class waarde extends Applet {


    int[] getallen = {2, 4, 5, 6, 10, 8, 14, 2, 7};



    int aantalkeergevonden;
    TextField textField;
    Button button;
    String schermtekst;


    @Override
    public void init() {


        textField = new TextField("", 8);
        add(textField);
        button = new Button("Kies");
        add(button);
        button.addActionListener(new KnopListener());
        schermtekst = "";
    }


    @Override
    public void paint(Graphics g) {
        int x = 50;
        int y = 80;


        g.drawString(schermtekst,x,y);
    }


    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int invoer = Integer.parseInt(textField.getText());
            boolean isgevonden = false;
            int index = 0;
            for (int i = 0; i < getallen.length; i++){
                if (getallen[i] == invoer) {
                    isgevonden = true;
                    index = i;
                }


                if (isgevonden) {
                    schermtekst = "De waarde is gevonden. Op index  " + index;
                }
                else {
                    schermtekst = "Is niet gevonden";
                }
                repaint();
            }
        }
    }
}
