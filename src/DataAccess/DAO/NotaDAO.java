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
import DataAccess.DTO.NotaDTO;
//import Framework.PatException;

public class NotaDAO extends SQLiteDataHelper implements IDAO<NotaDTO>{
    @Override
    public NotaDTO readBy(Integer id) throws Exception {
        NotaDTO oS = new NotaDTO();
        String query =" SELECT Id_nota  " 
                    +" ,Id_estudiante_curso "
                     +" ,Nota        " 

                     +" ,Estado        " 
                     +" ,Fecha_creacion     " 
                     +" ,Fecha_modificacion "
                     +" FROM    Nota   "
                     +" WHERE   Estado ='A' AND Id_nota =   "+ id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                oS = new NotaDTO(rs.getInt(1)           // Id_nota
                                ,rs.getInt(2)           // Id_estudiante_curso
                                ,rs.getInt(3)           // Nota
                                ,rs.getString(4)        // Estado         
                                ,rs.getString(5)        // Fecha_creacion      
                                ,rs.getString(6)        // Fecha_modificacion
                                );                                  
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readBy()");
        }
        return oS;
    }

    @Override
    public List<NotaDTO> readAll() throws Exception {
        List <NotaDTO> lst = new ArrayList<>();
        String query =" SELECT Id_nota  " 
                     +" ,Id_estudiante_curso "
                     +" ,Nota        " 

                     +" ,Estado        " 
                     +" ,Fecha_creacion     " 
                     +" ,Fecha_modificacion "
                     +" FROM    Nota   "
                     +" WHERE   Estado ='A' ";

        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);    // ejecutar la
            while (rs.next()) {
                NotaDTO s = new NotaDTO( rs.getInt(1)     // Id_nota
                                        ,rs.getInt(2)           // Id_estudiante_curso
                                        ,rs.getInt(3)           // Nota
                                        ,rs.getString(4)        // Estado         
                                        ,rs.getString(5)        // Fecha_creacion      
                                        ,rs.getString(6));        // Fecha_modificacion
                lst.add(s);
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lst; 
    }

    @Override
    public boolean create(NotaDTO entity) throws Exception {
        String query = " INSERT INTO Nota (Id_estudiante_curso,Nota) VALUES (?,?)";
        try {
            Connection        conn  = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getId_estudiante_curso());
            pstmt.setInt(2, entity.getNota());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "create()");
        }
    }

    @Override
    public boolean update(NotaDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String query = " UPDATE Nota SET Id_estudiante_curso = ? ,Nota = ?, Fecha_modificacion = ? WHERE Id_nota = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getId_estudiante_curso());
            pstmt.setInt(2, entity.getNota());
            pstmt.setString(3, dtf.format(now).toString());
            pstmt.setInt(4, entity.getId_nota());
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = " UPDATE Nota SET Estado = ? WHERE Id_nota = ?";
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
        String query =" SELECT COUNT(*) TotalReg FROM Nota "
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
