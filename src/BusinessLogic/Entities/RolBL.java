package BusinessLogic.Entities;

import java.util.*;

import DataAccess.DAO.RolDAO;
import DataAccess.DTO.RolDTO;

public class RolBL {
    private RolDTO rol;
    private RolDAO rolDAO = new RolDAO();


    public RolBL(){}

    public List<RolDTO> getAll() throws Exception{
        return rolDAO.readAll();
    }
    
    public RolDTO getByIdRol(int idRol) throws Exception{
        rol = rolDAO.readBy(idRol);
        return rol;
    }

    public boolean create(RolDTO rolDTO) throws Exception{
        return rolDAO.create(rolDTO);
    }

    public boolean update(RolDTO rolDTO) throws Exception{
        return rolDAO.update(rolDTO);
    }

    public boolean delete(int idRol) throws Exception{
        return rolDAO.delete(idRol);
    }

    public Integer getMaxRow() throws Exception{
        return rolDAO.getMaxRow();
    }

}
