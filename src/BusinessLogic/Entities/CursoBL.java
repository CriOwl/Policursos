package BusinessLogic.Entities;

import java.util.List;

import DataAccess.DAO.CursoDAO;
import DataAccess.DTO.CursoDTO;

public class CursoBL {
    private CursoDTO curso;
    private CursoDAO cursoDAO = new CursoDAO();


    public CursoBL(){}

    public List<CursoDTO> getAll() throws Exception{
        return cursoDAO.readAll();
    }
    
    public CursoDTO getByIdCurso(int idCurso) throws Exception{
        curso = cursoDAO.readBy(idCurso);
        return curso;
    }

    public boolean create(CursoDTO cursoDTO) throws Exception{
        return cursoDAO.create(cursoDTO);
    }

    public boolean update(CursoDTO cursoDTO) throws Exception{
        return cursoDAO.update(cursoDTO);
    }

    public boolean delete(int idCurso) throws Exception{
        return cursoDAO.delete(idCurso);
    }

    public Integer getMaxRow() throws Exception{
        return cursoDAO.getMaxRow();
    }
}
