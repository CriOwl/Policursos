package BusinessLogic.Entities;

import java.util.List;

import DataAccess.DAO.MetodoPagoDAO;
import DataAccess.DTO.MetodoPagoDTO;

public class MetodoPagoBL {
    private MetodoPagoDTO metodoPago;
    private MetodoPagoDAO metodoPagoDAO = new MetodoPagoDAO();

    public MetodoPagoBL(){}

     public List<MetodoPagoDTO> getAll() throws Exception{
        return metodoPagoDAO.readAll();
    }

    public MetodoPagoDTO getByIdMetodoPago(int idMetodoPago) throws Exception{
        metodoPago = metodoPagoDAO.readBy(idMetodoPago);
        return metodoPago;
    }

    public boolean create(MetodoPagoDTO MetodoPagoDTO) throws Exception{
        return metodoPagoDAO.create(MetodoPagoDTO);
    }

    public boolean update(MetodoPagoDTO MetodoPagoDTO) throws Exception{
        return metodoPagoDAO.update(MetodoPagoDTO);
    }

    public boolean delete(int idMetodoPago) throws Exception{
        return metodoPagoDAO.delete(idMetodoPago);
    }

    public Integer getMaxRow() throws Exception{
        return metodoPagoDAO.getMaxRow();
    }

}
