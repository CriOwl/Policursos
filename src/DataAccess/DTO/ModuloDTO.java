package DataAccess.DTO;

public class ModuloDTO {
    private Integer id_modulo;
    private Integer id_curso;
    private String nombre;
    private String descripcion;
    private String estado;
    private String fecha_creacion;
    private String fecha_modificacion;

    public ModuloDTO(){}

    public ModuloDTO(Integer id_modulo, Integer id_curso, String nombre, String descripcion) {
        this.id_modulo = id_modulo;
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public ModuloDTO(Integer id_modulo, Integer id_curso, String nombre, String descripcion, String estado,
            String fecha_creacion, String fecha_modificacion) {
        this.id_modulo = id_modulo;
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }
    public Integer getId_modulo() {
        return id_modulo;
    }
    public void setId_modulo(Integer id_modulo) {
        this.id_modulo = id_modulo;
    }
    public Integer getId_curso() {
        return id_curso;
    }
    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
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
        + "\n Id_modulo:  " + getId_modulo()
        + "\n Id_curso:  " + getId_curso()
        + "\n Nombre: " + getNombre()
        + "\n Descripcion: " + getDescripcion()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
