package AWT;

import java.awt.*;

public class Frame1 {
    public static void main(String args[]) {
        Frame f = new Frame();
        f.setTitle("My Frame");
        f.setSize(300, 300);
        f.setLocation(200, 250);
        // f.setBackground(Color.yellow);
        Color c = new Color(190, 56, 67);
        f.setBackground(c);
        f.setVisible(true);
    }
}
