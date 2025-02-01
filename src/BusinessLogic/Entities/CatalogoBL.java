package BusinessLogic.Entities;

import java.util.List;

import DataAccess.DAO.CatalogoDAO;
import DataAccess.DTO.CatalogoDTO;

public class CatalogoBL {
    private CatalogoDTO catalogo;
    private CatalogoDAO catalogoDAO = new CatalogoDAO();

    public CatalogoBL() {}

    public List<CatalogoDTO> getAll() throws Exception{
        return catalogoDAO.readAll();
    }

    public CatalogoDTO getByIdCatalogo(int idCatalogo) throws Exception{
        catalogo = catalogoDAO.readBy(idCatalogo);
        return catalogo;
    }

    public boolean create(CatalogoDTO catalogoDTO) throws Exception{
        return catalogoDAO.create(catalogoDTO);
    }

    public boolean update(CatalogoDTO catalogoDTO) throws Exception{
        return catalogoDAO.update(catalogoDTO);
    }

    public boolean delete(int idCatalogo) throws Exception{
        return catalogoDAO.delete(idCatalogo);
    }

    public Integer getMaxRow() throws Exception{
        return catalogoDAO.getMaxRow();
    }
    
}
