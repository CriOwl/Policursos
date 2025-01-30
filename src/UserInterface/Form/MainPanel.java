package UserInterface.Form;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import UserInterface.PoliCursoStyle;

public class MainPanel extends JPanel {
    public MainPanel() {
        customizeComponent();
    }

    private void customizeComponent(){
        try {
            setBackground(new Color(250,250,250));
            ImageIcon imageIcon = new ImageIcon(PoliCursoStyle.URL_MAIN);
            add(new JLabel(imageIcon), BorderLayout.CENTER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
