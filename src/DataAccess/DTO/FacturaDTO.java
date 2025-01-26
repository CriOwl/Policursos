package DataAccess.DTO;

import java.math.BigDecimal;

public class FacturaDTO {
    private Integer id_factura;
    private Integer id_persona;
    private Integer id_metodo_pago;
    private BigDecimal monto_total;
    private String estado;
    private String fecha_creacion;
    private String fecha_modificacion;

    public FacturaDTO(){}

    public FacturaDTO(Integer id_factura, Integer id_persona, Integer id_metodo_pago, BigDecimal monto_total) {
        this.id_factura = id_factura;
        this.id_persona = id_persona;
        this.id_metodo_pago = id_metodo_pago;
        this.monto_total = monto_total;
    }
    
    public FacturaDTO(Integer id_factura, Integer id_persona, Integer id_metodo_pago, BigDecimal monto_total,
            String estado, String fecha_creacion, String fecha_modificacion) {
        this.id_factura = id_factura;
        this.id_persona = id_persona;
        this.id_metodo_pago = id_metodo_pago;
        this.monto_total = monto_total;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }
    public Integer getId_factura() {
        return id_factura;
    }
    public void setId_factura(Integer id_factura) {
        this.id_factura = id_factura;
    }
    public Integer getId_persona() {
        return id_persona;
    }
    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
    }
    public Integer getId_metodo_pago() {
        return id_metodo_pago;
    }
    public void setId_metodo_pago(Integer id_metodo_pago) {
        this.id_metodo_pago = id_metodo_pago;
    }
    public BigDecimal getMonto_total() {
        return monto_total;
    }
    public void setMonto_total(BigDecimal monto_total) {
        this.monto_total = monto_total;
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
        + "\n Id_factura:  " + getId_factura()
        + "\n Id_persona:  " + getId_persona()
        + "\n Id_metodo_pago:  " + getId_metodo_pago()
        + "\n Monto_total: " + getMonto_total()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
