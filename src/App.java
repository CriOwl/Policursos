import UserInterface.Form.MainForm;
import UserInterface.Form.SplashScreenForm;

public class App {
    public static void main(String[] args) {
     
        SplashScreenForm.mostarSplash(); // se muestra la carga
        MainForm frmMain  = new MainForm("PoliCursos");
        frmMain.setVisible(true); // se muestra la pantalla de inicio
    }
}