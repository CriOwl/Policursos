package BusinessLogic.Entities;

import BusinessLogic.BLFactory;
import DataAccess.DAO.CursoDAO;
import DataAccess.DTO.CursoDTO;

public class Curso {
    private String nombre;
    private String categoria;
    private Estudiante[] estudiantes;
    private Tutor tutor;

    public Curso(String nombre, String categoria, Estudiante[] estudiantes, Tutor tutor) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.estudiantes = estudiantes;
        this.tutor = tutor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    private static void getNombreDB() throws Exception{
        BLFactory<CursoDTO> oCursoBL = new BLFactory<>(CursoDAO::new);
        Curso.nombre = oCurso.getBy(1).getNombre(); 
    }

    private static void getCategoriaDB() throws Exception{
        BLFactory<CursoDTO> oCursoBL = new BLFactory<>(CursoDAO::new);
        Curso.categoria = oCurso.getBy(1).getCategoria(); 
    }

    private static void getEstudianteDB() throws Exception{
        BLFactory<CursoDTO> oCursoBL = new BLFactory<>(CursoDAO::new);
        Curso.estudiante = oCurso.getBy(1).getEstudiante(); 
    }

}