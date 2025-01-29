package BusinessLogic.Entities;

import BusinessLogic.BLFactory;
import DataAccess.DAO.CursoDAO;
import DataAccess.DTO.CursoDTO;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private int idCurso;
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

    public Curso(int idCurso, String nombre, String categoria) {
        this.idCurso = idCurso;
        this.nombre = nombre;
        this.categoria = categoria;
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


    public static Curso getCursoById(int id) throws Exception {
        BLFactory<CursoDTO> cursoFactory = new BLFactory<>(CursoDAO::new);
        CursoDTO cursoDTO = cursoFactory.getBy(id);
        return new Curso(cursoDTO.getId_curso(), cursoDTO.getNombre(), cursoDTO.getDescripcion());
    }

    public static List<Curso> getAllCursos() throws Exception {
        BLFactory<CursoDTO> cursoFactory = new BLFactory<>(CursoDAO::new);
        List<CursoDTO> cursoDTOList = cursoFactory.getAll();
        List<Curso> cursos = new ArrayList<>();
        for (CursoDTO dto : cursoDTOList) {
            cursos.add(new Curso(dto.getId_curso(), dto.getNombre(), dto.getDescripcion()));
        }
        return cursos;
    }

    public static boolean addCurso(Curso curso) throws Exception {
        BLFactory<CursoDTO> cursoFactory = new BLFactory<>(CursoDAO::new);
        CursoDTO cursoDTO = new CursoDTO(null, curso.tutor != null ? curso.tutor.getId() : null, curso.getNombre(), curso.getCategoria(), null, null, null, "A", null, null);
        return cursoFactory.add(cursoDTO);
    }

    public static boolean updateCurso(Curso curso) throws Exception {
        BLFactory<CursoDTO> cursoFactory = new BLFactory<>(CursoDAO::new);
        CursoDTO cursoDTO = new CursoDTO(curso.getIdCurso(), curso.tutor != null ? curso.tutor.getId() : null, curso.getNombre(), curso.getCategoria(), null, null, null, "A", null, null);
        return cursoFactory.upd(cursoDTO);
    }

    public static boolean deleteCurso(int id) throws Exception {
        BLFactory<CursoDTO> cursoFactory = new BLFactory<>(CursoDAO::new);
        return cursoFactory.del(id);
    }
}

