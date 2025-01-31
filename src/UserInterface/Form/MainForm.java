package UserInterface.Form;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainForm extends JFrame{
    MenuPanel   pnlMenu = new MenuPanel();
    JPanel      pnlMain = new MainPanel();

    
    public MainForm(String titleApp) {
        customizeComponent(titleApp);
        pnlMenu.btnHome.addActionListener( e -> setPanel(new MainPanel()));
        pnlMenu.btnLogin.addActionListener( e -> setPanel(new LoginPanel()));
        pnlMenu.btnPersona.addActionListener( e -> setPanel(new PersonaPanel()));
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
        setSize(1000, 650);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());

        container.add(pnlMenu, BorderLayout.WEST);
        container.add(pnlMain, BorderLayout.CENTER);

    }
}
