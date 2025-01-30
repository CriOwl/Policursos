package UserInterface.CustomerControl;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import UserInterface.PoliCursoStyle;

public class PoliLabel  extends JLabel {
    public PoliLabel(){

    }

    public PoliLabel(String text){
        super(text);
        customizeComponent();
    }

    private void customizeComponent() {
        setCustomizeComponent(getText(), PoliCursoStyle.FONT, PoliCursoStyle.COLOR_FONT_LIGHT, PoliCursoStyle.ALIGNMENT_LEFT);
    }

    public void setCustomizeComponent(String text, Font font, Color color, int alignment) {
        setText(text);
        setFont(font);
        setOpaque(false);
        setBackground(null);
        setForeground(color);
        setHorizontalAlignment(alignment);
    }
    
}
