package UserInterface.CustomerControl;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import UserInterface.PoliCursoStyle;

public class PoliButton extends JButton implements MouseListener{


    public  PoliButton(String text) {
        customizeComponent(text);
    }


    public  PoliButton(String text, String iconPath) {
        customizeComponent(text, iconPath);
    }

    public void customizeComponent(String text) {
        
        setText(text);
        setOpaque(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setForeground(PoliCursoStyle.COLOR_FONT);
        setHorizontalAlignment(PoliCursoStyle.ALIGNMENT_LEFT);
        setFont(PoliCursoStyle.FONT);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public void customizeComponent(String text, String iconPath) {
        setSize(25, 50);
        addMouseListener(this);
        customizeComponent(text);
        setBounds(60, 30, 90, 90);
        setIcon(new ImageIcon(iconPath));
        setFont(PoliCursoStyle.FONT);
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
        setForeground(Color.BLACK);
        setCursor(PoliCursoStyle.CURSOR_HAND);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setForeground(Color.ORANGE);
        setCursor(PoliCursoStyle.CURSOR_DEFAULT);
    }
    
}
