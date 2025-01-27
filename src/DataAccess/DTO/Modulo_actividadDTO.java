package DataAccess.DTO;

public class Modulo_actividadDTO {

    private Integer Id_modulo_actividad;
    private Integer Id_actividad;
    private Integer Id_modulo;
    private String Descripcion;
    private String Fecha_inicio;
    private String Fecha_fin;
    private String Nota_max;
    private String Ponderacion;
    private String Estado;
    private String Fecha_creacion;
    private String Fecha_modificacion;
    
    public Modulo_actividadDTO(){}

    public Modulo_actividadDTO(Integer Id_actividad, Integer Id_modulo, String Descripcion,
            String Fecha_inicio, String Fecha_fin, String nota_max, String ponderacion) {
        this.Id_actividad = Id_actividad;
        this.Id_modulo = Id_modulo;
        this.Descripcion = Descripcion;
        this.Fecha_inicio = Fecha_inicio;
        this.Fecha_fin = Fecha_fin;
        Nota_max = nota_max;
        Ponderacion = ponderacion;
    }

    public Modulo_actividadDTO(Integer Id_modulo_actividad, Integer Id_actividad, Integer Id_modulo, String Descripcion,
            String Fecha_inicio, String Fecha_fin, String nota_max, String ponderacion, String Estado,
            String Fecha_creacion, String Fecha_modificacion) {
        this.Id_modulo_actividad = Id_modulo_actividad;
        this.Id_actividad = Id_actividad;
        this.Id_modulo = Id_modulo;
        this.Descripcion = Descripcion;
        this.Fecha_inicio = Fecha_inicio;
        this.Fecha_fin = Fecha_fin;
        Nota_max = nota_max;
        Ponderacion = ponderacion;
        this.Estado = Estado;
        this.Fecha_creacion = Fecha_creacion;
        this.Fecha_modificacion = Fecha_modificacion;
    }
    
    public Integer getId_modulo_actividad() {
        return Id_modulo_actividad;
    }
    public void setId_modulo_actividad(Integer Id_modulo_actividad) {
        this.Id_modulo_actividad = Id_modulo_actividad;
    }
    public Integer getId_actividad() {
        return Id_actividad;
    }
    public void setId_actividad(Integer Id_actividad) {
        this.Id_actividad = Id_actividad;
    }
    public Integer getId_modulo() {
        return Id_modulo;
    }
    public void setId_modulo(Integer Id_modulo) {
        this.Id_modulo = Id_modulo;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    public String getFecha_inicio() {
        return Fecha_inicio;
    }
    public void setFecha_inicio(String Fecha_inicio) {
        this.Fecha_inicio = Fecha_inicio;
    }
    public String getFecha_fin() {
        return Fecha_fin;
    }
    public void setFecha_fin(String Fecha_fin) {
        this.Fecha_fin = Fecha_fin;
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
