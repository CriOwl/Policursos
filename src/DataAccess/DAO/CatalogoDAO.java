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
import DataAccess.DTO.CatalogoDTO;
//import Framework.PatException;

public class CatalogoDAO extends SQLiteDataHelper implements IDAO<CatalogoDTO>{
    @Override
    public CatalogoDTO readBy(Integer id) throws Exception {
        CatalogoDTO oS = new CatalogoDTO();
        String query =" SELECT Id_catalogo  " 
                     +" ,Nombre        " 
                     +" ,Estado        " 
                     +" ,Fecha_creacion     " 
                     +" ,Fecha_modificacion "
                     +" ,Id_tipo "
                     +" ,Id_padre "
                     +" FROM    Catalogo   "
                     +" WHERE   Estado ='A' AND Id_catalogo =   "+ id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                oS = new CatalogoDTO(rs.getInt(1)       // Id_catalogo
                                ,rs.getString(2)        // Nombre             
                                ,rs.getString(3)        // Estado         
                                ,rs.getString(4)        // Fecha_creacion      
                                ,rs.getString(5)        // Fecha_modificacion
                                ,rs.getInt(6)           // Id_tipo
                                ,rs.getInt(7)           // Id_padre
                                );                                  
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readBy()");
        }
        return oS;
    }

    @Override
    public List<CatalogoDTO> readAll() throws Exception {
        List <CatalogoDTO> lst = new ArrayList<>();
        String query =" SELECT Id_catalogo  " 
                     +" ,Nombre        " 
                     +" ,Estado        " 
                     +" ,Fecha_creacion     " 
                     +" ,Fecha_modificacion "
                     +" ,Id_tipo "
                     +" ,Id_padre "
                     +" FROM    Catalogo   "
                     +" WHERE   Estado ='A' ";

        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);    // ejecutar la
            while (rs.next()) {
                CatalogoDTO s = new CatalogoDTO( rs.getInt(1)     // Id_catalogo
                                        ,rs.getString(2)    // Nombre             
                                        ,rs.getString(3)    // Estado         
                                        ,rs.getString(4)    // Fecha_creacion      
                                        ,rs.getString(5)    // Fecha_modificacion
                                        ,rs.getInt(6)       // Id_tipo
                                        ,rs.getInt(7));     // Id_padre
                lst.add(s);
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lst; 
    }

    @Override
    public boolean create(CatalogoDTO entity) throws Exception {
        String query = " INSERT INTO CATALOGO (Nombre) VALUES (?)";
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
    public boolean update(CatalogoDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String query = " UPDATE Catalogo SET Nombre = ?, Fecha_modificacion = ? WHERE Id_catalogo = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setString(1, entity.getNombre());
            pstmt.setString(2, dtf.format(now).toString());
            pstmt.setInt(3, entity.getId_catalogo());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = " UPDATE Catalogo SET Estado = ? WHERE Id_catalogo = ?";
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
        String query =" SELECT COUNT(*) TotalReg FROM Catalogo "
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
