package gitawt.awt;

import java.awt.*;

public class MyAWT {
    public static void main(String[] args) {
        Frame f = new Frame("AWT Example");  // Creating a Frame
        Label l = new Label("Enter Name:");
        TextField tf = new TextField();
        Button b = new Button("Submit");

        l.setBounds(50, 50, 100, 20);
        tf.setBounds(160, 50, 100, 20);
        b.setBounds(100, 100, 80, 30);

        f.add(l);
        f.add(tf);
        f.add(b);

        f.setSize(300, 200);
        f.setLayout(null);       // Using no layout manager
        f.setVisible(true);
    }
}
