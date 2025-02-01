package BusinessLogic.Entities;

import java.util.*;

import DataAccess.DAO.SexoDAO;
import DataAccess.DTO.SexoDTO;

public class SexoBL {
    private SexoDTO sexo;
    private SexoDAO sexoDAO = new SexoDAO();

    public SexoBL(){}

    public List<SexoDTO> getAll() throws Exception{
        return sexoDAO.readAll();
    }

    public SexoDTO getByIdSexo(int id_sexo) throws Exception{
        sexo = sexoDAO.readBy(id_sexo);
        return sexo;
    }

    public boolean create(SexoDTO sexoDTO) throws Exception{
        return sexoDAO.create(sexoDTO);
    }

    public boolean update(SexoDTO sexoDTO)throws Exception{
        return sexoDAO.update(sexoDTO);
    }

    public boolean delete(int id_sexo) throws Exception{
        return sexoDAO.delete(id_sexo);
    }

    public Integer getMaxRow() throws Exception{
        return sexoDAO.getMaxRow();
    }

    

}
