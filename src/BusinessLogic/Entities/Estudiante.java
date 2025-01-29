package BusinessLogic.Entities;

import BusinessLogic.BLFactory;
import DataAccess.DAO.Estudiante_cursoDAO;
import DataAccess.DTO.Estudiante_cursoDTO;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {

    private double nota;

    public Estudiante(String cedula, String clave, double nota) {
        super(cedula, clave);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    public static Estudiante getEstudianteById(int id) throws Exception {
        BLFactory<Estudiante_cursoDTO> estudianteFactory = new BLFactory<>(Estudiante_cursoDAO::new);
        Estudiante_cursoDTO estudianteDTO = estudianteFactory.getBy(id);
        return new Estudiante(estudianteDTO.getId_estudiante().toString(), "", estudianteDTO.getNota());
    }

    public static List<Estudiante> getAllEstudiantes() throws Exception {
        BLFactory<Estudiante_cursoDTO> estudianteFactory = new BLFactory<>(Estudiante_cursoDAO::new);
        List<Estudiante_cursoDTO> estudianteDTOList = estudianteFactory.getAll();
        List<Estudiante> estudiantes = new ArrayList<>();
        for (Estudiante_cursoDTO dto : estudianteDTOList) {
            estudiantes.add(new Estudiante(dto.getId_estudiante().toString(), "", dto.getNota()));
        }
        return estudiantes;
    }

    public static boolean addEstudiante(Estudiante estudiante) throws Exception {
        BLFactory<Estudiante_cursoDTO> estudianteFactory = new BLFactory<>(Estudiante_cursoDAO::new);
        Estudiante_cursoDTO estudianteDTO = new Estudiante_cursoDTO(estudiante.getCedula(), estudiante.getCurso(), estudiante.getNota(), "A", null, null);
        return estudianteFactory.add(estudianteDTO);
    }

    public static boolean updateEstudiante(Estudiante estudiante) throws Exception {
        BLFactory<Estudiante_cursoDTO> estudianteFactory = new BLFactory<>(Estudiante_cursoDAO::new);
        Estudiante_cursoDTO estudianteDTO = new Estudiante_cursoDTO(estudiante.getId(), estudiante.getCedula(), estudiante.getCurso(), estudiante.getNota(), "A", null, null);
        return estudianteFactory.upd(estudianteDTO);
    }

    public static boolean deleteEstudiante(int id) throws Exception {
        BLFactory<Estudiante_cursoDTO> estudianteFactory = new BLFactory<>(Estudiante_cursoDAO::new);
        return estudianteFactory.del(id);
    }
}
