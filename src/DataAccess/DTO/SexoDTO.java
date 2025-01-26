package DataAccess.DTO;

public class SexoDTO {
    private Integer Id_sexo;
    private String Nombre;
    private String Estado; 
    private String Fecha_creacion;
    private String Fecha_modificacion;

    
    public SexoDTO(){}
    
    public SexoDTO(String nombre) {
        Nombre = nombre;
    }

    public SexoDTO(Integer id_sexo, String nombre, String estado, String fecha_creacion, String fecha_modificacion) {
        Id_sexo = id_sexo;
        Nombre = nombre;
        Estado = estado;
        Fecha_creacion = fecha_creacion;
        Fecha_modificacion = fecha_modificacion;
    }
    
    public Integer getId_sexo() {
        return Id_sexo;
    }

    public void setId_sexo(Integer id_sexo) {
        Id_sexo = id_sexo;
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
        + "\n Id_sexo:  " + getId_sexo()
        + "\n Nombre: " + getNombre()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
