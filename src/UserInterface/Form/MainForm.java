package UserInterface.Form;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

import com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme;


public class MainForm extends JFrame{
    MenuPanel   pnlMenu = new MenuPanel();
    JPanel      pnlMain = new MainPanel();

    public MainForm(String titleApp) {
        try {
            UIManager.setLookAndFeel(new FlatCobalt2IJTheme());
        } catch (Exception e) {}
            customizeComponent(titleApp);
            pnlMenu.btnHome.addActionListener( e -> setPanel(new MainPanel()));
            pnlMenu.btnLogin.addActionListener( e -> setPanel(new LoginPanel()));
            pnlMenu.btnPersona.addActionListener( e -> setPanel(new PersonaPanel()));
        
        revalidate();
    }

        
    private void setPanel(JPanel formularioPanel) {
        Container container = getContentPane();
        container.remove(pnlMain);
        pnlMain = formularioPanel;
        container.add(pnlMain, BorderLayout.CENTER);
        revalidate();
        repaint();
    }

    private void customizeComponent(String titleApp) {
        setTitle(titleApp);
        setSize(800, 700);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        container.add(pnlMenu, BorderLayout.WEST);
        container.add(pnlMain, BorderLayout.CENTER);

    }

    // public static void main(String[] args) {
    //     // Añadir un bloque try-catch para manejar excepciones
    //     try {
    //         MainForm mainForm = new MainForm("PoliCursos");
    //         mainForm.setVisible(true);
    //     } catch (Exception e) {
    //         e.printStackTrace();
    //     }
    // }
}
