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
import DataAccess.DTO.Estudiante_cursoDTO;
//import Framework.PatException;

public class Estudiante_cursoDAO extends SQLiteDataHelper implements IDAO<Estudiante_cursoDTO>{
    @Override
    public Estudiante_cursoDTO readBy(Integer id) throws Exception {
        Estudiante_cursoDTO oS = new Estudiante_cursoDTO();
        String query =" SELECT Id_estudiante_curso  " 
                     +" ,Id_estudiante        "
                     +" ,Id_curso        "
                     +" ,Id_catalogo_curso   "

                     +" ,Estado        " 
                     +" ,Fecha_creacion     " 
                     +" ,Fecha_modificacion "
                     +" FROM    estudiante_curso   "
                     +" WHERE   Estado ='A' AND Id_estudiante_curso =   "+ id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                oS = new Estudiante_cursoDTO(rs.getInt(1)          // Id_estudiante_curso
                                            ,rs.getInt(2)           // Id_estudiante                         
                                            ,rs.getInt(3)          // Id_curso             
                                            ,rs.getInt(4)          // Id_catalogo_curso             
                                            ,rs.getString(5)        // Estado         
                                            ,rs.getString(6)        // Fecha_creacion      
                                            ,rs.getString(7));      // Fecha_modificacion
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readBy()");
        }
        return oS;
    }

    @Override
    public List<Estudiante_cursoDTO> readAll() throws Exception {
        List <Estudiante_cursoDTO> lst = new ArrayList<>();
        String query =" SELECT Id_estudiante_curso  " 
                    +" ,Id_estudiante        "
                    +" ,Id_curso        "
                    +" ,Id_catalogo_curso   "
                                
                    +" ,Estado        " 
                    +" ,Fecha_creacion     " 
                    +" ,Fecha_modificacion "

                    +" FROM    Estudiante_curso   "
                    +" WHERE   Estado ='A' ";

        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);    // ejecutar la
            while (rs.next()) {
                Estudiante_cursoDTO s = new Estudiante_cursoDTO( rs.getInt(1)           // Id_estudiante_curso
                                                                ,rs.getInt(2)           // Id_estudiante                         
                                                                ,rs.getInt(3)          // Id_curso             
                                                                ,rs.getInt(4)          // Id_catalogo_curso             
                                                                ,rs.getString(5)        // Estado         
                                                                ,rs.getString(6)        // Fecha_creacion      
                                                                ,rs.getString(7));      // Fecha_modificacion
                                              lst.add(s);
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lst; 
    }

    @Override
    public boolean create(Estudiante_cursoDTO entity) throws Exception {
        String query = " INSERT INTO Estudiante_curso (Id_estudiante,Id_curso, Id_catalogo_curso) VALUES (?,?,?)";
        try {
            Connection        conn  = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getId_estudiante());             // Id_estudiante
            pstmt.setInt(2, entity.getId_curso());                  // Id_curso
            pstmt.setInt(3, entity.getId_catalogo_curso());         // Id_catalogo_curso
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "create()");
        }
    }

    @Override
    public boolean update(Estudiante_cursoDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String query = " UPDATE Estudiante_curso SET Id_estudiante_curso = ?"
                                    +" ,Id_estudiante = ?        "
                                    +" ,Id_curso = ?       "
                                    +" ,Id_catalogo_curso = ?   "

                                    +" , Fecha_modificacion = ?" 
                                    + "WHERE Id_estudiante_curso = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getId_estudiante_curso());             // Id_estudiante_curso
            pstmt.setInt(2, entity.getId_estudiante());             // Id_estudiante
            pstmt.setInt(3, entity.getId_curso());                  // Id_curso
            pstmt.setInt(4, entity.getId_catalogo_curso());         // Id_catalogo_curso

            pstmt.setString(5, dtf.format(now).toString());
            pstmt.setInt(6, entity.getId_estudiante_curso());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = " UPDATE Estudiante_curso SET Estado = ? WHERE Id_estudiante_curso = ?";
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
        String query =" SELECT COUNT(*) TotalReg FROM Estudiante_curso "
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
