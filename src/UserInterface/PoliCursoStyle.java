package UserInterface;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public abstract class PoliCursoStyle {
    
    //Colores
    public static final Color COLOR_FONT = new Color(80, 100, 20);
    public static final Color COLOR_FONT_LIGHT = new Color(100, 100, 100);
    public static final Color COLOR_CURSOR = Color.BLACK;
    public static final Color COLOR_BORDER = Color.LIGHT_GRAY;

    //Fuente de letra
    public static final Font FONT = new Font("Comic Sans MS", Font.PLAIN, 14);
    public static final Font FONT_BOLD = new Font("Comic Sans MS", Font.BOLD, 14);
    public static final Font FONT_SMALL = new Font("Comic Sans MS", Font.PLAIN, 14);

    //Cursores
    public static final Cursor CURSOR_HAND = new Cursor(Cursor.HAND_CURSOR);
    public static final Cursor CURSOR_DEFAULT = new Cursor(Cursor.DEFAULT_CURSOR);

    //Imagenes
    public static final URL URL_LOGO = PoliCursoStyle.class.getResource("/UserInterface/Resource/Img/Logo.png");
    public static final URL URL_MAIN = PoliCursoStyle.class.getResource("/UserInterface/Resource/Img/Main.png");
    public static final URL URL_SPLASH = PoliCursoStyle.class.getResource("/UserInterface/Resource/Img/Splash.jpg");
    
    
    //Alineación
    public static final int ALIGNMENT_LEFT = SwingConstants.LEFT;

    public static final CompoundBorder createBorderRect(){
        return BorderFactory.createCompoundBorder(
            new LineBorder(Color.LIGHT_GRAY), new EmptyBorder(25,25,25,25));
    }


    



}
