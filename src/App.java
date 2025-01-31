import DataAccess.DAO.*;
import DataAccess.DTO.*;
import UserInterface.Form.MainForm;
import UserInterface.Form.SplashScreenForm;

import java.util.List;

import BusinessLogic.BLFactory;
import BusinessLogic.Entities.*;


public class App {
    /*public static void main(String[] args) throws Exception {
    /*public static void main(String[] args) throws Exception {
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

        SplashScreenForm.mostarSplash();
        
        MainForm frmMain  = new MainForm("PoliCursos");
        frmMain.setVisible(true);

    }*/

    public static void main(String[] args) {
        try {
         
            BLFactory<CursoDTO> blFactory = new BLFactory<>(CursoDAO::new);


            CursoDTO nuevoCurso = new CursoDTO(
                1, // ID del tutor
                "Matemáticas", 
                "Curso de matemáticas básicas", 
                1, 
                1, 
                1,
                "Activo", 
                "2025-01-30", 
                "2025-01-30"
            );
            blFactory.add(nuevoCurso);

            List<CursoDTO> todosLosCursos = blFactory.getAll();
            for (CursoDTO curso : todosLosCursos) {
                System.out.println(curso);
                System.out.println("-----------");
            }

            CursoDTO cursoPorId = blFactory.getBy(1);
            System.out.println(cursoPorId);

            cursoPorId.setNombre("Matemáticas Avanzadas");
            blFactory.upd(cursoPorId);

            blFactory.del(1);

        } catch (Exception e) {
            e.printStackTrace();
        }

        SplashScreenForm.mostarSplash();
        MainForm frmMain  = new MainForm("PoliCursos");
        frmMain.setVisible(true);
    }
}