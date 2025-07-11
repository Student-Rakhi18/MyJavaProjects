package AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame3 extends Frame implements ActionListener {
    Button btnClose;
    Button btnChange;

    public Frame3() {
        Frame f = new Frame();
        setTitle("My Frame");
        setSize(300, 300);
        setLocation(200, 250);
        Color c = new Color(190, 56, 67);
        setBackground(c);
        setVisible(true);
        btnClose = new Button("Close");
        btnChange = new Button("Change color");
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        add(btnClose);
        add(btnChange);
        btnClose.addActionListener(this);
        btnChange.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnChange) {
            setBackground(Color.yellow);
        } else if (e.getSource() == btnClose) {
            System.exit(0);
        }
    }
}

