package UserInterface;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.SwingConstants;

public abstract class PoliCursoStyle {
    
    //Colores
    public static final Color COLOR_FONT = new Color(0, 0, 0);
    
    
    //Fuente de letra
    public static final Font FONT = new Font("Arial", Font.PLAIN, 14);
    public static final Font FONT_BOLD = new Font("Arial", Font.BOLD, 14);
    public static final Font FONT_SMALL = new Font("Arial", Font.PLAIN, 14);

    //Cursores
    public static final Cursor CURSOR_HAND = new Cursor(Cursor.HAND_CURSOR);
    public static final Cursor CURSOR_DEFAULT = new Cursor(Cursor.DEFAULT_CURSOR);

    //Alineación
    public static final int ALIGNMENT_LEFT = SwingConstants.LEFT;



    



}
