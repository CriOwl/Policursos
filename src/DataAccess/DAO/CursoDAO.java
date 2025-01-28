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
import DataAccess.DTO.CursoDTO;
//import Framework.PatException;

public class CursoDAO extends SQLiteDataHelper implements IDAO<CursoDTO>{
    @Override
    public CursoDTO readBy(Integer id) throws Exception {
        CursoDTO oS = new CursoDTO();
        String query =" SELECT Id_curso  " 
                     +" ,Id_tutor        " 
                     +" ,Nombre        "
                     +" ,Descripcion        "
                     +" ,Id_catalogo_categoria   "
                     +" ,Id_catalogo_subcategoria   "
                     +" ,Id_catalogo_nivel   "

                     +" ,Estado        " 
                     +" ,Fecha_creacion     " 
                     +" ,Fecha_modificacion "
                     +" FROM    Curso   "
                     +" WHERE   Estado ='A' AND Id_curso =   "+ id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                oS = new CursoDTO(rs.getInt(1)          // Id_curso
                                ,rs.getInt(2)           // Id_tutor             
                                ,rs.getString(3)        // Nombre             
                                ,rs.getString(4)        // Descripcion             
                                ,rs.getInt(5)          // Id_catalogo_categoria             
                                ,rs.getInt(6)          // Id_catalogo_subcategoria             
                                ,rs.getInt(7)          // Id_catalogo_nivel             
                                ,rs.getString(8)        // Estado         
                                ,rs.getString(9)        // Fecha_creacion      
                                ,rs.getString(10));      // Fecha_modificacion
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readBy()");
        }
        return oS;
    }

    @Override
    public List<CursoDTO> readAll() throws Exception {
        List <CursoDTO> lst = new ArrayList<>();
        String query =" SELECT Id_curso  " 
                    +" ,Id_tutor        " 
                    +" ,Nombre        "
                    +" ,Descripcion        "
                    +" ,Id_catalogo_categoria   "
                    +" ,Id_catalogo_subcategoria   "
                    +" ,Id_catalogo_nivel   "

                    +" ,Estado        " 
                    +" ,Fecha_creacion     " 
                    +" ,Fecha_modificacion "
                    +" FROM    Curso   "
                    +" WHERE   Estado ='A' ";

        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);    // ejecutar la
            while (rs.next()) {
                CursoDTO s = new CursoDTO( rs.getInt(1)           // Id_curso
                                          ,rs.getInt(2)           // Id_tutor             
                                          ,rs.getString(3)        // Nombre             
                                          ,rs.getString(4)        // Descripcion             
                                          ,rs.getInt(5)          // Id_catalogo_categoria             
                                          ,rs.getInt(6)          // Id_catalogo_subcategoria             
                                          ,rs.getInt(7)          // Id_catalogo_nivel             
                                          ,rs.getString(8)        // Estado         
                                          ,rs.getString(9)        // Fecha_creacion      
                                          ,rs.getString(10));      // Fecha_modificacion
                                              lst.add(s);
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lst; 
    }

    @Override
    public boolean create(CursoDTO entity) throws Exception {
        String query = " INSERT INTO Curso (Id_tutor,Nombre, Id_catalogo_categoria,Id_catalogo_subcategoria,Id_catalogo_nivel) VALUES (?,?,?,?,?)";
        try {
            Connection        conn  = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getId_tutor());       // Id_tutor
            pstmt.setString(2, entity.getNombre());     //Nombre
            pstmt.setInt(3, entity.getId_catalogo_categoria());       // Id_categoria
            pstmt.setInt(4, entity.getId_catalogo_subcategoria());       // Id_subcategoria
            pstmt.setInt(5, entity.getId_catalogo_nivel());       // Id_nivel
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "create()");
        }
    }

    @Override
    public boolean update(CursoDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String query = " UPDATE Curso SET Id_curso = ?"
                                    +" , Id_tutor = ?" 
                                    +" , Nombre = ?" 
                                    +" , Descripcion = ?" 
                                    +" , Id_catalogo_categoria = ?" 
                                    +" , Id_catalogo_subcategoria = ?" 
                                    +" , Id_catalogo_nivel = ?" 

                                    +" , Fecha_modificacion = ?" 
                                    + "WHERE Id_curso = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getId_curso());       // Id_curso
            pstmt.setInt(2, entity.getId_tutor());       // Id_tutor
            pstmt.setString(3, entity.getNombre());     //Nombre
            pstmt.setString(4, entity.getDescripcion());     //Descripcion
            pstmt.setInt(5, entity.getId_catalogo_categoria());       // Id_categoria
            pstmt.setInt(6, entity.getId_catalogo_subcategoria());       // Id_subcategoria
            pstmt.setInt(7, entity.getId_catalogo_nivel());       // Id_nivel
            pstmt.setString(8, dtf.format(now).toString());
            pstmt.setInt(9, entity.getId_curso());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = " UPDATE Curso SET Estado = ? WHERE Id_curso = ?";
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
        String query =" SELECT COUNT(*) TotalReg FROM Curso "
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
