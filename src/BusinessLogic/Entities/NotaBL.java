package BusinessLogic.Entities;

import java.util.List;

import DataAccess.DAO.NotaDAO;
import DataAccess.DTO.NotaDTO;


public class NotaBL {
    private NotaDTO nota;
    private NotaDAO notaDAO = new NotaDAO();

    public NotaBL(){}

    public List<NotaDTO> getAll() throws Exception{
        return notaDAO.readAll();
    }
    
    public NotaDTO getByIdNota(int id_nota) throws Exception{
        nota = notaDAO.readBy(id_nota);
        return nota;
    }

    public boolean create(NotaDTO notaDTO) throws Exception{
        return notaDAO.create(notaDTO);
    }

    public boolean update(NotaDTO notaDTO) throws Exception{
        return notaDAO.update(notaDTO);
    }

    public boolean delete(int id_nota) throws Exception{
        return notaDAO.delete(id_nota);
    }

    public Integer getMaxRow() throws Exception{
        return notaDAO.getMaxRow();
    }
}
