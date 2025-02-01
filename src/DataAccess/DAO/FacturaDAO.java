package DataAccess.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import DataAccess.IDAO;
import DataAccess.SQLiteDataHelper;
import DataAccess.DTO.FacturaDTO;
//import Framework.PatException;

public class FacturaDAO extends SQLiteDataHelper implements IDAO<FacturaDTO>{
    @Override
    public FacturaDTO readBy(Integer id) throws Exception {
        FacturaDTO oS = new FacturaDTO();
        String query =" SELECT Id_factura  " 
                     +" ,Id_curso        " 
                     +" ,Id_persona        " 
                     +" ,Monto_total        " 
                     +" ,Id_metodo_pago        "

                     +" ,Estado        " 
                     +" ,Fecha_creacion     " 
                     +" ,Fecha_modificacion "
                     +" FROM    Factura   "
                     +" WHERE   Estado ='A' AND Id_factura =   "+ id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                oS = new FacturaDTO(rs.getInt(1)        // Id_factura
                                ,rs.getInt(2)           // Id_curso              
                                ,rs.getInt(3)           // Id_persona              
                                ,rs.getDouble(4)        // Monto_total         
                                ,rs.getInt(5)           // Id_metodo_pago         
                                ,rs.getString(6)        // Estado        
                                ,rs.getString(7)        // Fecha_creacion      
                                ,rs.getString(8));      // Fecha_modificacion
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readBy()");
        }
        return oS;
    }

    @Override
    public List<FacturaDTO> readAll() throws Exception {
        List <FacturaDTO> lst = new ArrayList<>();
        String query =" SELECT Id_factura  " 
                     +" ,Id_curso        " 
                     +" ,Id_persona        " 
                     +" ,Monto_total        " 
                     +" ,Id_metodo_pago        "

                     +" ,Estado        " 
                     +" ,Fecha_creacion     " 
                     +" ,Fecha_modificacion "
                     +" FROM    Factura   "
                     +" WHERE   Estado ='A' ";

        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);    // ejecutar la
            while (rs.next()) {
                FacturaDTO s = new FacturaDTO( rs.getInt(1)     // Id_factura
                                              ,rs.getInt(2)           // Id_curso              
                                              ,rs.getInt(3)           // Id_persona              
                                              ,rs.getDouble(4)        // Monto_total         
                                              ,rs.getInt(5)           // Id_metodo_pago         
                                              ,rs.getString(6)        // Estado        
                                              ,rs.getString(7)        // Fecha_creacion      
                                              ,rs.getString(8));      // Fecha_modificacion
                lst.add(s);
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lst; 
    }

    @Override
    public boolean create(FacturaDTO entity) throws Exception {
        String query = "INSERT INTO Factura (Id_persona, Id_curso ,Monto_total, Id_metodo_pago) VALUES (?, ?, ?, ?)";
        try {
            Connection conn = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getId_persona());       // Id_persona
            pstmt.setInt(2, entity.getId_curso());       // Id_curso
            pstmt.setDouble(3, entity.getMonto_total());  // Monto_total
            pstmt.setInt(4, entity.getId_metodo_pago());  // Id_metodo_pago
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw e; // Puedes manejar esta excepción de manera personalizada si lo necesitas.
        }
    }

    @Override
    public boolean update(FacturaDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String query = " UPDATE Factura SET Id_curso = ?"
                                       +" , Id_persona = ?" 
                                       +" , Id_metodo_pago = ?" 
                                       +" , Monto_total = ?" 
                                       +" , Fecha_modificacion = ?" 
                                       + "WHERE Id_factura = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getId_curso());
            pstmt.setInt(2, entity.getId_persona());
            pstmt.setInt(3, entity.getId_metodo_pago());
            pstmt.setDouble(4, entity.getMonto_total());
            pstmt.setString(5, dtf.format(now).toString());
            pstmt.setInt(6, entity.getId_factura());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = " UPDATE Factura SET Estado = ? WHERE Id_factura = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement  pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "I");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "delete()");
        }
    }

    public Integer getMaxRow()  throws Exception  {
        String query =" SELECT COUNT(*) TotalReg FROM Factura "
                     +" WHERE   Estado ='A' ";
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                return rs.getInt(1);                    // TotalReg
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "getMaxRow()");
        }
        return 0;
    }
}
