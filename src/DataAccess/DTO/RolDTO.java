package DataAccess.DTO;

public class RolDTO {
    
    private Integer id_rol;
    private String nombre;
    private String estado;
    private String fecha_creacion;
    private String fecha_modificacion;

    public RolDTO(){}

    public RolDTO(Integer id_rol, String nombre) {
        this.id_rol = id_rol;
        this.nombre = nombre;
    }
    public RolDTO(Integer id_rol, String nombre, String estado, String fecha_creacion, String fecha_modificacion) {
        this.id_rol = id_rol;
        this.nombre = nombre;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }

    
    public Integer getId_rol() {
        return id_rol;
    }
    public void setId_rol(Integer id_rol) {
        this.id_rol = id_rol;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getFecha_creacion() {
        return fecha_creacion;
    }
    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    public String getFecha_modificacion() {
        return fecha_modificacion;
    }
    public void setFecha_modificacion(String fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
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
