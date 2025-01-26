package DataAccess.DTO;

public class CATALOGO_TIPODTO {
    private Integer id_tipo;
    private String nombre;
    private String estado; 
    private String fecha_creacion;
    private String fecha_modificacion;

    public CATALOGO_TIPODTO(){}

    public CATALOGO_TIPODTO(String nombre) {
        this.nombre = nombre;
    }
    public CATALOGO_TIPODTO(Integer id_tipo, String nombre, String estado, String fecha_creacion,
            String fecha_modificacion) {
        this.id_tipo = id_tipo;
        this.nombre = nombre;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }
    
    public Integer getId_tipo() {
        return id_tipo;
    }
    public void setId_tipo(Integer id_tipo) {
        this.id_tipo = id_tipo;
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

    @Override
    public String toString() {
        return getClass().getName()
        + "\n Id_Tipo:  " + getId_tipo()
        + "\n Nombre: " + getNombre()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
