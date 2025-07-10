package gitawt.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame5 extends Frame implements ActionListener {
    Button btnClose, btnInc, btnDec;
    //Button btnInc;
    //Button btnDec;
    int i = 0;

    public Frame5() {
        Frame f = new Frame();
        setTitle(String.valueOf(i));
        setSize(300, 300);
        setLocation(200, 250);
        Color c = new Color(190, 56, 67);
        setBackground(c);
        setVisible(true);
        btnClose = new Button("Close");
        btnInc = new Button("Increment");
        btnDec = new Button("Decrement");
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        add(btnClose);
        add(btnInc);
        add(btnDec);
        btnClose.addActionListener(this);
        btnInc.addActionListener(this);
        btnDec.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnInc) {
            setTitle(String.valueOf(++i));
        } else if (e.getSource() == btnDec) {
            setTitle(String.valueOf(--i));
        } else if (e.getSource() == btnClose) {
            System.exit(0);
        }
    }
}



