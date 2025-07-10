package gitawt.awt;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Frame6 extends Frame implements MouseListener
{
    Button btnClose;
    Button btnChange;
    int i=0;
    public Frame6()
    {
        Frame f= new Frame();
        setTitle("My Frame");
        setSize(300,300);
        setLocation(200,250);
        Color c=new Color(190,56,67);
        setBackground(c);
        setVisible(true);
        btnClose = new Button("Close");
        btnChange = new Button("Change Color");
        FlowLayout fl=new FlowLayout();
        setLayout(fl);
        add(btnClose);
        add(btnChange);
        btnClose.addMouseListener(this);
        btnChange.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource()==btnChange)
        {
            setBackground(Color.yellow);
        }
        else if(e.getSource()==btnClose)
        {
            System.exit(0);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

