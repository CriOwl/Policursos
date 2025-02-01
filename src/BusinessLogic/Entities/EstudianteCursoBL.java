package BusinessLogic.Entities;

import java.util.List;

import DataAccess.DAO.Estudiante_cursoDAO;
import DataAccess.DTO.Estudiante_cursoDTO;

public class EstudianteCursoBL {
    private Estudiante_cursoDTO estudiante_curso;
    private Estudiante_cursoDAO estudiante_cursoDAO = new Estudiante_cursoDAO();

    public EstudianteCursoBL(){}

     public List<Estudiante_cursoDTO> getAll() throws Exception{
        return estudiante_cursoDAO.readAll();
    }

    public Estudiante_cursoDTO getByIdMetodoPago(int idEstudainteCurso) throws Exception{
        estudiante_curso = estudiante_cursoDAO.readBy(idEstudainteCurso);
        return estudiante_curso;
    }

    public boolean create(Estudiante_cursoDTO estudiante_cursoDTO) throws Exception{
        return estudiante_cursoDAO.create(estudiante_cursoDTO);
    }

    public boolean update(Estudiante_cursoDTO estudiante_cursoDTO) throws Exception{
        return estudiante_cursoDAO.update(estudiante_cursoDTO);
    }

    public boolean delete(int idEstudainteCurso) throws Exception{
        return estudiante_cursoDAO.delete(idEstudainteCurso);
    }

    public Integer getMaxRow() throws Exception{
        return estudiante_cursoDAO.getMaxRow();
    }
    
}
