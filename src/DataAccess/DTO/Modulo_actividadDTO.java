package DataAccess.DTO;

public class Modulo_actividadDTO {

    private Integer id_modulo_actividad;
    private Integer id_actividad;
    private Integer id_modulo;
    private String descripcion;
    private String fecha_inicio;
    private String fecha_fin;
    private String Nota_max;
    private String Ponderacion;
    private String estado;
    private String fecha_creacion;
    private String fecha_modificacion;
    
    public Modulo_actividadDTO(){}

    public Modulo_actividadDTO(Integer id_modulo_actividad, Integer id_actividad, Integer id_modulo, String descripcion,
            String fecha_inicio, String fecha_fin, String nota_max, String ponderacion) {
        this.id_modulo_actividad = id_modulo_actividad;
        this.id_actividad = id_actividad;
        this.id_modulo = id_modulo;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        Nota_max = nota_max;
        Ponderacion = ponderacion;
    }

    public Modulo_actividadDTO(Integer id_modulo_actividad, Integer id_actividad, Integer id_modulo, String descripcion,
            String fecha_inicio, String fecha_fin, String nota_max, String ponderacion, String estado,
            String fecha_creacion, String fecha_modificacion) {
        this.id_modulo_actividad = id_modulo_actividad;
        this.id_actividad = id_actividad;
        this.id_modulo = id_modulo;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        Nota_max = nota_max;
        Ponderacion = ponderacion;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }
    
    public Integer getId_modulo_actividad() {
        return id_modulo_actividad;
    }
    public void setId_modulo_actividad(Integer id_modulo_actividad) {
        this.id_modulo_actividad = id_modulo_actividad;
    }
    public Integer getId_actividad() {
        return id_actividad;
    }
    public void setId_actividad(Integer id_actividad) {
        this.id_actividad = id_actividad;
    }
    public Integer getId_modulo() {
        return id_modulo;
    }
    public void setId_modulo(Integer id_modulo) {
        this.id_modulo = id_modulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFecha_inicio() {
        return fecha_inicio;
    }
    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    public String getFecha_fin() {
        return fecha_fin;
    }
    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    public String getNota_max() {
        return Nota_max;
    }
    public void setNota_max(String nota_max) {
        Nota_max = nota_max;
    }
    public String getPonderacion() {
        return Ponderacion;
    }
    public void setPonderacion(String ponderacion) {
        Ponderacion = ponderacion;
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
        + "\n Id_modulo_actividad:  " + getId_modulo_actividad()
        + "\n Id_actividad:  " + getId_actividad()
        + "\n Id_modulo:  " + getId_modulo()
        + "\n Descripcion:  " + getDescripcion()
        + "\n Fecha_inicio:  " + getFecha_inicio()
        + "\n Fecha_fin:  " + getFecha_fin()
        + "\n Nota_max:  " + getNota_max()
        + "\n Ponderacion: " + getPonderacion()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
