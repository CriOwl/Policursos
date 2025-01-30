package UserInterface.Form;

import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UserInterface.PoliCursoStyle;
import UserInterface.CustomerControl.PoliButton;
import UserInterface.CustomerControl.PoliLabel;

public class MenuPanel extends JPanel{
    public PoliButton
        btnHome     = new PoliButton("Home"),
        btnLogin    = new PoliButton("Login"),
        btnPersona  = new PoliButton("Persona");
        
    public MenuPanel() {
        customizeComponent();
    }

    private void customizeComponent() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setPreferredSize(new Dimension(200, getHeight()));
        try{
            Image logo = ImageIO.read(PoliCursoStyle.URL_LOGO);
            logo = logo.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            add(new JLabel(new ImageIcon(logo)));
        }catch(IOException e){
            System.out.println(e.toString());
        }
        
        // añadir botones
        add(btnHome);
        add(btnLogin);
        add(btnPersona);

        // añadir - derechos de autor
        add(new PoliLabel("\n © PoliCurso 2021"));
    }
}
