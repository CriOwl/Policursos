package DataAccess.DTO;

public class SexoDTO {
    private Integer id_sexo;
    private String nombre;
    private String estado; 
    private String fecha_creacion;
    private String fecha_modificacion;

    public SexoDTO(){}
    
    public SexoDTO(Integer id_sexo, String nombre) {
        this.id_sexo = id_sexo;
        this.nombre = nombre;
    }

    public SexoDTO(Integer id_sexo, String nombre, String estado, String fecha_creacion, String fecha_modificacion) {
        this.id_sexo = id_sexo;
        this.nombre = nombre;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }
    public Integer getId_sexo() {
        return id_sexo;
    }
    public void setId_sexo(Integer id_sexo) {
        this.id_sexo = id_sexo;
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
        + "\n Id_sexo:  " + getId_sexo()
        + "\n Nombre: " + getNombre()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
