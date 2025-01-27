package DataAccess.DTO;

public class MetodoPagoDTO {
    private Integer Id_metodo_pago;
    private String Nombre;
    private String Estado;
    private String Fecha_creacion;
    private String Fecha_Modificacion;

    public MetodoPagoDTO(){}

    public MetodoPagoDTO(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public MetodoPagoDTO(Integer Id_metodo_pago, String Nombre, String Estado, String Fecha_creacion,
            String Fecha_Modificacion) {
        this.Id_metodo_pago = Id_metodo_pago;
        this.Nombre = Nombre;
        this.Estado = Estado;
        this.Fecha_creacion = Fecha_creacion;
        this.Fecha_Modificacion = Fecha_Modificacion;
    }
    public Integer getId_metodo_pago() {
        return Id_metodo_pago;
    }
    public void setId_metodo_pago(Integer Id_metodo_pago) {
        this.Id_metodo_pago = Id_metodo_pago;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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
    public String getFecha_Modificacion() {
        return Fecha_Modificacion;
    }
    public void setFecha_Modificacion(String Fecha_Modificacion) {
        this.Fecha_Modificacion = Fecha_Modificacion;
    }

    public String toString() {
        return getClass().getName()
        + "\n Id_metodo_pago:  " + getId_metodo_pago()
        + "\n Nombre: " + getNombre()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_Modificacion=" + getFecha_Modificacion();
    }
}
