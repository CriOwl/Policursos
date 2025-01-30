import DataAccess.DAO.*;
import DataAccess.DTO.*;
import UserInterface.Form.MainForm;
import UserInterface.Form.SplashScreenForm;
import BusinessLogic.Entities.*;


public class App {
    public static void main(String[] args) throws Exception {
        Estudiante estudiante1 = new Estudiante("1234567890", "clave123", 0);
        Tutor tutor1 = new Tutor("0987654321", "claveTutor");
        Estudiante[] estudiantes = {estudiante1};
        Curso curso1 = new Curso("Matemáticas", "Primaria", estudiantes, tutor1);

        Sistema sistema = new Sistema();

        if (sistema.validarCredenciales(tutor1, "0987654321", "claveTutor")) {
            System.out.println("Credenciales del tutor correctas.");
        } else {
            System.out.println("Credenciales del tutor incorrectas.");
        }

        tutor1.dictarClase();

        tutor1.calificarEstudiante(estudiante1, 8.5);

        sistema.crearCertificadoAprob(estudiante1);

        //SplashScreenForm.mostarSplash();
        
        MainForm frmMain  = new MainForm("PoliCursos");
        frmMain.setVisible(true);

    }
        
}