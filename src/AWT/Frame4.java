package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame4 extends Frame implements ActionListener {
    Button btnClose;
    Button btnInc;
    int i = 0;

    public Frame4() {
        Frame f = new Frame();
        setTitle(String.valueOf(i));
        setSize(300, 300);
        setLocation(200, 250);
        Color c = new Color(190, 56, 67);
        setBackground(c);
        setVisible(true);
        btnClose = new Button("Close");
        btnInc = new Button("Click me");
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        add(btnClose);
        add(btnInc);
        btnClose.addActionListener(this);
        btnInc.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnInc) {
            setTitle(String.valueOf(++i));
        } else if (e.getSource() == btnClose) {
            System.exit(0);
        }
    }
}


