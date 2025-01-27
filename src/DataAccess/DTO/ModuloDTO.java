package DataAccess.DTO;

public class ModuloDTO {
    private Integer Id_modulo;
    private Integer Id_curso;
    private String Nombre;
    private String Descripcion;
    private String Estado;
    private String Fecha_creacion;
    private String Fecha_modificacion;

    public ModuloDTO(){}

    public ModuloDTO(Integer Id_curso, String Nombre, String Descripcion) {
        this.Id_curso = Id_curso;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
    }
    
    public ModuloDTO(Integer Id_modulo, Integer Id_curso, String Nombre, String Descripcion, String Estado,
            String Fecha_creacion, String Fecha_modificacion) {
        this.Id_modulo = Id_modulo;
        this.Id_curso = Id_curso;
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Estado = Estado;
        this.Fecha_creacion = Fecha_creacion;
        this.Fecha_modificacion = Fecha_modificacion;
    }
    public Integer getId_modulo() {
        return Id_modulo;
    }
    public void setId_modulo(Integer Id_modulo) {
        this.Id_modulo = Id_modulo;
    }
    public Integer getId_curso() {
        return Id_curso;
    }
    public void setId_curso(Integer Id_curso) {
        this.Id_curso = Id_curso;
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
        + "\n Id_modulo:  " + getId_modulo()
        + "\n Id_curso:  " + getId_curso()
        + "\n Nombre: " + getNombre()
        + "\n Descripcion: " + getDescripcion()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
