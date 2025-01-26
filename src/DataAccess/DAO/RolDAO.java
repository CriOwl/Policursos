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

import DataAccess.SQLiteDataHelper;
import DataAccess.DTO.RolDTO;
//import Framework.PatException;

public class RolDAO extends SQLiteDataHelper implements IDAO<RolDTO>{
    @Override
    public RolDTO readBy(Integer id) throws Exception {
        RolDTO oS = new RolDTO();
        String query =" SELECT Id_rol  " 
                     +" ,Nombre        " 
                     +" ,Estado        " 
                     +" ,Fecha_creacion     " 
                     +" ,Fecha_modificacion "
                     +" FROM    Rol   "
                     +" WHERE   Estado ='A' AND Id_rol =   "+ id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                oS = new RolDTO(rs.getInt(1)            // Id_rol
                                ,rs.getString(2)        // Nombre             
                                ,rs.getString(3)        // Estado         
                                ,rs.getString(4)        // Fecha_creacion      
                                ,rs.getString(5));      // Fecha_modificacion
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readBy()");
        }
        return oS;
    }

    @Override
    public List<RolDTO> readAll() throws Exception {
        List <RolDTO> lst = new ArrayList<>();
        String query =" SELECT Id_rol  " 
                     +" ,Nombre        " 
                     +" ,Estado        " 
                     +" ,Fecha_creacion     " 
                     +" ,Fecha_modificacion "
                     +" FROM    Rol   "
                     +" WHERE   Estado ='A' ";

        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);    // ejecutar la
            while (rs.next()) {
                RolDTO s = new RolDTO( rs.getInt(1)     // Id_rol
                                        ,rs.getString(2)  // Nombre             
                                        ,rs.getString(3)  // Estado         
                                        ,rs.getString(4)  // Fecha_creacion      
                                        ,rs.getString(5));// Fecha_modificacion
                lst.add(s);
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lst; 
    }

    @Override
    public boolean create(RolDTO entity) throws Exception {
        String query = " INSERT INTO Rol (Nombre) VALUES (?)";
        try {
            Connection        conn  = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "create()");
        }
    }

    @Override
    public boolean update(RolDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String query = " UPDATE Rol SET Nombre = ?, Fecha_modificacion = ? WHERE Id_rol = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.setString(2, dtf.format(now).toString());
            pstmt.setInt(3, entity.getId_rol());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = " UPDATE Rol SET Estado = ? WHERE Id_rol = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement  pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "X");
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "delete()");
        }
    }

    public Integer getMaxRow()  throws Exception  {
        String query =" SELECT COUNT(*) TotalReg FROM Rol "
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
