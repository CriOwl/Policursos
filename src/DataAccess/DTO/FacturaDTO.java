package DataAccess.DTO;


public class FacturaDTO {
    private Integer Id_factura;
    private Integer Id_curso;
    private Integer Id_persona;
    private Double Monto_total;
    private Integer Id_metodo_pago;
    private String Estado;
    private String Fecha_creacion;
    private String Fecha_modificacion;
    
    
    public FacturaDTO(){}
    
    public FacturaDTO(Integer id_curso, Integer id_persona, Double monto_total, Integer id_metodo_pago) {
        Id_curso = id_curso;
        Id_persona = id_persona;
        Monto_total = monto_total;
        Id_metodo_pago = id_metodo_pago;
    }
    
    public FacturaDTO(Integer id_factura, Integer id_curso, Integer id_persona, Double monto_total, Integer id_metodo_pago,
    String estado, String fecha_creacion, String fecha_modificacion) {
        Id_factura = id_factura;
        Id_curso = id_curso;
        Id_persona = id_persona;
        Monto_total = monto_total;
        Id_metodo_pago = id_metodo_pago;
        Estado = estado;
        Fecha_creacion = fecha_creacion;
        Fecha_modificacion = fecha_modificacion;
    }
    
    
    public Integer getId_factura() {
        return Id_factura;
    }
    
    public void setId_factura(Integer id_factura) {
        Id_factura = id_factura;
    }

    public Integer getId_curso() {
        return Id_curso;
    }

    public void setId_curso(Integer id_curso) {
        Id_curso = id_curso;
    }

    public Integer getId_persona() {
        return Id_persona;
    }

    public void setId_persona(Integer id_persona) {
        Id_persona = id_persona;
    }

    public Integer getId_metodo_pago() {
        return Id_metodo_pago;
    }

    public void setId_metodo_pago(Integer id_metodo_pago) {
        Id_metodo_pago = id_metodo_pago;
    }

    public Double getMonto_total() {
        return Monto_total;
    }

    public void setMonto_total(Double monto_total) {
        Monto_total = monto_total;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getFecha_creacion() {
        return Fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        Fecha_creacion = fecha_creacion;
    }

    public String getFecha_modificacion() {
        return Fecha_modificacion;
    }

    public void setFecha_modificacion(String fecha_modificacion) {
        Fecha_modificacion = fecha_modificacion;
    }
    
    public String toString() {
        return getClass().getName()
        + "\n Id_factura:           " + getId_factura()
        + "\n Id_curso:             " + getId_curso()
        + "\n Id_persona:           " + getId_persona()
        + "\n Id_metodo_pago:       " + getId_metodo_pago()
        + "\n Monto_total:          " + getMonto_total()
        + "\n Estado:               " + getEstado()
        + "\n FechaCreacion:        " + getFecha_creacion()
        + "\n Fecha_modificacion=   " + getFecha_modificacion();
    }
}
