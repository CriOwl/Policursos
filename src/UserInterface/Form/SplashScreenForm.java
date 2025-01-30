package UserInterface.Form;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

import UserInterface.PoliCursoStyle;

public class SplashScreenForm {
    private static JFrame       frmSplash;
    private static JProgressBar prbLoag;
    private static ImageIcon    iconImagen;
    private static JLabel       lblSplash;
    
    public static void mostarSplash() {
        iconImagen = new ImageIcon(PoliCursoStyle.URL_SPLASH);
        lblSplash = new JLabel(iconImagen);
        prbLoag = new JProgressBar(0,100);
        prbLoag.setStringPainted(true);

        frmSplash = new JFrame();
        frmSplash.setUndecorated(true);
        frmSplash.getContentPane().add(lblSplash, BorderLayout.CENTER);
        frmSplash.add(prbLoag, BorderLayout.SOUTH);
        frmSplash.setSize(iconImagen.getIconWidth(), iconImagen.getIconHeight());
        frmSplash.setLocationRelativeTo(null);
        frmSplash.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
            prbLoag.setValue(i);
        }
        
        frmSplash.setVisible(false);
    }



}
