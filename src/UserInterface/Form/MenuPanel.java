package UserInterface.Form;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import UserInterface.PoliCursoStyle;
import UserInterface.CustomerControl.PoliButton;
import UserInterface.CustomerControl.PoliLabel;

public class MenuPanel extends JPanel{
    public PoliButton
        btnHome     = new PoliButton(" Home"),
        btnLogin    = new PoliButton(" Login"),
        btnPersona  = new PoliButton(" Persona");
        
        
    public MenuPanel() {
        customizeComponent();
    }

    private void customizeComponent() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // posicionar en el eje y, verticalmente
        setPreferredSize(new Dimension(150, getHeight()));

        try {
            Image logo = ImageIO.read(PoliCursoStyle.URL_LOGO);
            logo = logo.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            add(new JLabel(new ImageIcon(logo)));
        } catch (IOException e) {
            System.out.println(e.toString());
        }

        // Añadir botones
        add(btnHome);
        add(btnLogin);
        add(btnPersona);

        // Espacio flexible para empujar el texto hacia abajo
        add(Box.createVerticalGlue());

        // Añadir derechos de autor alineado a la izquierda
        PoliLabel lblCopyright = new PoliLabel("© PoliCurso 2025");
        lblCopyright.setAlignmentX(Component.LEFT_ALIGNMENT); // Alinear a la izquierda
        lblCopyright.setBorder(new EmptyBorder(10, 10, 10, 10)); // Margen para separación
        add(lblCopyright);
    }   

}
