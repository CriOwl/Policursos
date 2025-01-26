package DataAccess.DTO;

public class Actividad_tipoDTO {
    private Integer id_actividad;
    private String nombre;
    private String descripcion;
    private String estado;
    private String fecha_creacion;
    private String fecha_modificacion;
    
    public Actividad_tipoDTO(){}

    public Actividad_tipoDTO(Integer id_actividad, String nombre, String descripcion) {
        this.id_actividad = id_actividad;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Actividad_tipoDTO(Integer id_actividad, String nombre, String descripcion, String estado,
            String fecha_creacion, String fecha_modificacion) {
        this.id_actividad = id_actividad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }


    public Integer getId_actividad() {
        return id_actividad;
    }
    public void setId_actividad(Integer id_actividad) {
        this.id_actividad = id_actividad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        + "\n Id_actividad:  " + getId_actividad()
        + "\n Nombre: " + getNombre()
        + "\n Descripcion: " + getDescripcion()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
