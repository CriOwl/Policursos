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

    public String getNombre() throws Exception {
        if(nombre == null){
            BLFactory<CursoDTO> oCursoBL = new BLFactory<>(CursoDAO::new);
            this.nombre = oCursoBL.getBy(1).getNombre();
        }
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() throws Exception {
        if(categoria == null){
            BLFactory<CursoDTO> oCursoBL = new BLFactory<>(CursoDAO::new);
            this.categoria = oCursoBL.getBy(1).getCategoria();
        }
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Estudiante[] getEstudiantes() throws Exception {
        if(estudiantes == null){
            BLFactory<CursoDTO> oCursoBL = new BLFactory<>(CursoDAO::new);
            CursoDTO cursoDTO = oCursoBL.getBy(1);
        }
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public Tutor getTutor() throws Exception {
        if(tutor == null){
            BLFactory<CursoDTO> oCursoBL = new BLFactory<>(CursoDAO::new);
            CursoDTO cursoDTO = oCursoBL.getBy(1);
        }
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}