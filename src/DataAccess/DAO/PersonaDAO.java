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
import DataAccess.DTO.PersonaDTO;
//import Framework.PatException;

public class PersonaDAO extends SQLiteDataHelper implements IDAO<PersonaDTO>{
    @Override
    public PersonaDTO readBy(Integer id) throws Exception {
        PersonaDTO oS = new PersonaDTO();
        String query =" SELECT Id_persona  " 
                     +" ,Id_rol        " 
                     +" ,Id_sexo        " 
                     +" ,Cedula        " 
                     +" ,Nombre        "
                     +" ,Apellido        "
                     +" ,Correo        "
                     +" ,Descripcion        "
                     +" ,Clave        "
                     +" ,Id_catalogo_pais   "
                     +" ,Fecha_nacimiento   "

                     +" ,Estado        " 
                     +" ,Fecha_creacion     " 
                     +" ,Fecha_modificacion "
                     +" FROM    Persona   "
                     +" WHERE   Estado ='A' AND Id_persona =   "+ id.toString() ;
        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);  // ejecutar la
            while (rs.next()) {
                oS = new PersonaDTO(rs.getInt(1)        // Id_persona
                                ,rs.getInt(2)           // Id_rol             
                                ,rs.getInt(3)           // Id_sexo             
                                ,rs.getString(4)        // Cedula             
                                ,rs.getString(5)        // Nombre             
                                ,rs.getString(6)        // Apellido             
                                ,rs.getString(7)        // Correo             
                                ,rs.getString(8)        // Descripcion             
                                ,rs.getString(9)        // Clave             
                                ,rs.getInt(10)          // Id_catalogo_pais             
                                ,rs.getString(11)        // Fecha_nacimiento             
                                ,rs.getString(12)        // Estado         
                                ,rs.getString(13)        // Fecha_creacion      
                                ,rs.getString(14));      // Fecha_modificacion
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readBy()");
        }
        return oS;
    }

    @Override
    public List<PersonaDTO> readAll() throws Exception {
        List <PersonaDTO> lst = new ArrayList<>();
        String query =" SELECT Id_persona  " 
                    +" ,Id_rol        " 
                    +" ,Id_sexo        " 
                    +" ,Cedula        " 
                    +" ,Nombre        "
                    +" ,Apellido        "
                    +" ,Correo        "
                    +" ,Descripcion        "
                    +" ,Clave        "
                    +" ,Id_catalogo_pais   "
                    +" ,Fecha_nacimiento   "
                
                    +" ,Estado        " 
                    +" ,Fecha_creacion     " 
                    +" ,Fecha_modificacion "
                    +" FROM    Persona   "
                    +" WHERE   Estado ='A' ";

        try {
            Connection conn = openConnection();         // conectar a DB     
            Statement  stmt = conn.createStatement();   // CRUD : select * ...    
            ResultSet rs   = stmt.executeQuery(query);    // ejecutar la
            while (rs.next()) {
                PersonaDTO s = new PersonaDTO( rs.getInt(1)           // Id_persona
                                              ,rs.getInt(2)           // Id_rol             
                                              ,rs.getInt(3)           // Id_sexo             
                                              ,rs.getString(4)        // Cedula             
                                              ,rs.getString(5)        // Nombre             
                                              ,rs.getString(6)        // Apellido             
                                              ,rs.getString(7)        // Correo             
                                              ,rs.getString(8)        // Descripcion             
                                              ,rs.getString(9)        // Clave             
                                              ,rs.getInt(10)          // Id_catalogo_pais             
                                              ,rs.getString(11)        // Fecha_nacimiento             
                                              ,rs.getString(12)        // Estado         
                                              ,rs.getString(13)        // Fecha_creacion      
                                              ,rs.getString(14));      // Fecha_modificacion
                                              lst.add(s);
            }
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "readAll()");
        }
        return lst; 
    }

    @Override
    public boolean create(PersonaDTO entity) throws Exception {
        String query = " INSERT INTO Persona (Id_rol,Id_sexo,Cedula,Nombre,Apellido,Clave, Id_catalogo_pais) VALUES (?,?,?,?,?,?,?)";
        try {
            Connection        conn  = openConnection();
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getId_rol());       // Id_rol
            pstmt.setInt(2, entity.getId_sexo());       // Id_sexo
            pstmt.setString(3, entity.getCedula());     //Cedula
            pstmt.setString(4, entity.getNombre());     //Nombre
            pstmt.setString(5, entity.getApellido());     //Apellido
            pstmt.setString(6, entity.getClave());       //Clave
            pstmt.setInt(7, entity.getId_catalogo_pais());       // Id_pais
            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "create()");
        }
    }

    @Override
    public boolean update(PersonaDTO entity) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();
        String query = " UPDATE Persona SET Id_persona = ?"
                                    +" , Id_rol = ?" 
                                    +" , Id_sexo = ?" 
                                    +" , Cedula = ?" 
                                    +" , Nombre = ?" 
                                    +" , Apellido = ?" 
                                    +" , Correo = ?" 
                                    +" , Descripcion = ?" 
                                    +" , Clave = ?" 
                                    +" , Id_catalogo_pais = ?" 
                                    +" , Fecha_nacimento = ?" 
                                    +" , Fecha_modificacion = ?" 
                                    + "WHERE Id_persona = ?";
        try {
            Connection          conn = openConnection();
            PreparedStatement pstmt  = conn.prepareStatement(query);
            pstmt.setInt(1, entity.getId_rol());       // Id_rol
            pstmt.setInt(2, entity.getId_sexo());       // Id_sexo
            pstmt.setString(3, entity.getCedula());     //Cedula
            pstmt.setString(4, entity.getNombre());     //Nombre
            pstmt.setString(5, entity.getApellido());     //Apellido
            pstmt.setString(6, entity.getCorreo());     //Correo
            pstmt.setString(7, entity.getDescripcion());     //Descripcion
            pstmt.setString(8, entity.getClave());       //Clave
            pstmt.setInt(9, entity.getId_catalogo_pais());       // Id_catalogo_pais
            pstmt.setString(10, entity.getFecha_nacimiento());       //FechaNacimiento
            pstmt.setString(11, dtf.format(now).toString());
            pstmt.setInt(6, entity.getId_persona());

            pstmt.executeUpdate();
            return true;
        } 
        catch (SQLException e) {
            throw e;// new PatException(e.getMessage(), getClass().getName(), "update()");
        }
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        String query = " UPDATE Persona SET Estado = ? WHERE Id_persona = ?";
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
        String query =" SELECT COUNT(*) TotalReg FROM Persona "
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
