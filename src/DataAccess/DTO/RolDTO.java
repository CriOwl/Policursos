package DataAccess.DTO;

public class RolDTO {
    
    private Integer Id_rol;
    private String Nombre;
    private String Estado;
    private String Fecha_creacion;
    private String Fecha_modificacion;

    
    public RolDTO(){}

    public RolDTO(String nombre) {
        this.Nombre = nombre;
    }
    public RolDTO(Integer id_rol, String nombre, String estado, String fecha_creacion, String fecha_modificacion) {
        this.Id_rol = id_rol;
        this.Nombre = nombre;
        this.Estado = estado;
        this.Fecha_creacion = fecha_creacion;
        this.Fecha_modificacion = fecha_modificacion;
    }
    
    public Integer getId_rol() {
        return Id_rol;
    }

    public void setId_rol(Integer id_rol) {
        Id_rol = id_rol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getFecha_creacion() {
        return Fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        Fecha_creacion = fecha_creacion;
    }

    public String getFecha_modificacion() {
        return Fecha_modificacion;
    }

    public void setFecha_modificacion(String fecha_modificacion) {
        Fecha_modificacion = fecha_modificacion;
    }


    public String toString() {
        return getClass().getName()
        + "\n Id_rol:  " + getId_rol()
        + "\n Nombre: " + getNombre()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
 
}
