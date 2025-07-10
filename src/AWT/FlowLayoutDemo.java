package gitawt.awt;

import java.awt.*;

public class FlowLayoutDemo {
    public static void main(String[] args) {
        Frame f = new Frame("FlowLayout Example");
        f.setLayout(new FlowLayout());

        f.add(new Button("Button 1"));
        f.add(new Button("Button 2"));
        f.add(new Button("Button 3"));

        f.setSize(250, 150);
        f.setVisible(true);
    }
}
