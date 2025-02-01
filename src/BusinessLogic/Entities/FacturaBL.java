package BusinessLogic.Entities;

import java.util.List;

import DataAccess.DAO.FacturaDAO;
import DataAccess.DTO.FacturaDTO;

public class FacturaBL {
    private FacturaDTO factura;
    private FacturaDAO facturaDAO = new FacturaDAO();

    public FacturaBL(){}

     public List<FacturaDTO> getAll() throws Exception{
        return facturaDAO.readAll();
    }

    public FacturaDTO getByIdFactura(int idfactura) throws Exception{
        factura = facturaDAO.readBy(idfactura);
        return factura;
    }

    public boolean create(FacturaDTO facturaDTO) throws Exception{
        return facturaDAO.create(facturaDTO);
    }

    public boolean update(FacturaDTO facturaDTO) throws Exception{
        return facturaDAO.update(facturaDTO);
    }

    public boolean delete(int idfactura) throws Exception{
        return facturaDAO.delete(idfactura);
    }

    public Integer getMaxRow() throws Exception{
        return facturaDAO.getMaxRow();
    }
}
