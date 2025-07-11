package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame2 extends Frame implements ActionListener {
    public Frame2() {
        Frame f = new Frame();
        setTitle("My Frame");
        setSize(300, 300);
        setLocation(200, 250);
        Color c = new Color(190, 56, 67);
        setBackground(c);
        setVisible(true);
        Button btnClose = new Button("Close");
        Button btnChange = new Button("Change color");
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        add(btnClose);
        add(btnChange);
        CloseFrame2 cl = new CloseFrame2();
        btnClose.addActionListener(cl);
        btnChange.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        setBackground(Color.yellow);
    }
}
