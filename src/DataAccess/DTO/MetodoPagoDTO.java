package DataAccess.DTO;

public class MetodoPagoDTO {
    private Integer id_metodo_pago;
    private String nombre;
    private String estado;
    private String fecha_creacion;
    private String fecha_modificacion;

    public MetodoPagoDTO(){}

    public MetodoPagoDTO(Integer id_metodo_pago, String nombre) {
        this.id_metodo_pago = id_metodo_pago;
        this.nombre = nombre;
    }
    
    public MetodoPagoDTO(Integer id_metodo_pago, String nombre, String estado, String fecha_creacion,
            String fecha_modificacion) {
        this.id_metodo_pago = id_metodo_pago;
        this.nombre = nombre;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }
    public Integer getId_metodo_pago() {
        return id_metodo_pago;
    }
    public void setId_metodo_pago(Integer id_metodo_pago) {
        this.id_metodo_pago = id_metodo_pago;
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
        + "\n Id_metodo_pago:  " + getId_metodo_pago()
        + "\n Nombre: " + getNombre()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
