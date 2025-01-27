package DataAccess.DTO;

public class Actividad_tipoDTO {
    private Integer Id_actividad;
    private String Nombre;
    private String Descripcion;
    private String Estado;
    private String Fecha_creacion;
    private String Fecha_modificacion;
    
    public Actividad_tipoDTO(){}

    public Actividad_tipoDTO(Integer Id_actividad, String Nombre, String Descripcion) {
        this.Id_actividad = Id_actividad;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }

    public Actividad_tipoDTO(Integer Id_actividad, String Nombre, String Descripcion, String Estado,
            String Fecha_creacion, String Fecha_modificacion) {
        this.Id_actividad = Id_actividad;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Estado = Estado;
        this.Fecha_creacion = Fecha_creacion;
        this.Fecha_modificacion = Fecha_modificacion;
    }


    public Integer getId_actividad() {
        return Id_actividad;
    }
    public void setId_actividad(Integer Id_actividad) {
        this.Id_actividad = Id_actividad;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    public String getFecha_creacion() {
        return Fecha_creacion;
    }
    public void setFecha_creacion(String Fecha_creacion) {
        this.Fecha_creacion = Fecha_creacion;
    }
    public String getFecha_modificacion() {
        return Fecha_modificacion;
    }
    public void setFecha_modificacion(String Fecha_modificacion) {
        this.Fecha_modificacion = Fecha_modificacion;
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
