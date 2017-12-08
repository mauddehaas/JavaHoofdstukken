
package HO13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class betonbaksteenblokken extends Applet {
    int ruimte = 2;
    Button beton;
    Button baksteen;
    boolean blnbaksteen;
    boolean blnbeton;


    public void paint(Graphics g) {

        int x1 = 0;
        int y1 = 50;
        int w = 50;
        int h = 20;
        if (blnbeton == true) {
            for (int i = 0; i < 8; i++) {
                int y2 = y1 + (i * (h + ruimte));
                for (int c = 0; c < 8; c++) {
                    int x2 = x1 + (c * (w + ruimte));
                    g.setColor(Color.gray);
                    g.fillRect(x2, y2, w, h);

                }
            }
        }

        if (blnbaksteen == true) {
            for (int i = 0; i < 8; i++) {
                int y = y1 + (i * (h + ruimte));
                for (int c = 0; c < 8; c++) {
                    int x = x1 + (c * (w + ruimte));
                    g.setColor(Color.RED);
                    g.fillRect(x, y, w, h);
                }
            }
        }
    }

    public void init() {
        beton = new Button("beton");
        beton.addActionListener(new betonListener());
        add(beton);

        baksteen = new Button("baksteen");
        baksteen.addActionListener(new baksteenListener());
        add(baksteen);
    }


    class baksteenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            blnbaksteen = true;
            repaint();
            if (blnbeton = true){
                blnbeton = false;
            }
        }
    }
    class betonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            blnbeton = true;
            repaint();
            if (blnbaksteen = true){
                blnbaksteen = false;
            }
        }
    }
}
