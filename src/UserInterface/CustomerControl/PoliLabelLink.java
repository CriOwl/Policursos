package UserInterface.CustomerControl;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

import UserInterface.PoliCursoStyle;

public class PoliLabelLink extends PoliLabel implements MouseListener {

    PoliLabelLink(String text){
        super(text);
        setPersonallizacion();
    }

    PoliLabelLink(String text, String iconoPath){
        super(text);
        setPersonallizacion();
        setIcon(new ImageIcon(iconoPath));
    }


    void setPersonallizacion(){
        addMouseListener(this);
        setOpaque(false);
        setForeground(PoliCursoStyle.COLOR_FONT);
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
        this.setCursor(PoliCursoStyle.CURSOR_HAND);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setCursor(PoliCursoStyle.CURSOR_DEFAULT);
    }
    
}
