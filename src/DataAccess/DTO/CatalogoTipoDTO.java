package DataAccess.DTO;
public class CatalogoTipoDTO {
    private Integer Id_tipo;       
    private String  Nombre;
    private String  Estado;       
    private String  Fecha_creacion;    
    private String  Fecha_modificacion;
    
    
    public CatalogoTipoDTO(){ }

    public CatalogoTipoDTO(String nombre) {
        this.Nombre = nombre;
    }

    public CatalogoTipoDTO(int id_tipo, String nombre, String estado, String fecha_creacion, String fecha_modificacion) {
        this.Id_tipo = id_tipo;
        this.Nombre = nombre;
        this.Estado = estado;
        this.Fecha_creacion = fecha_creacion;
        this.Fecha_modificacion = fecha_modificacion;
    }
    
    public Integer getId_tipo() {
        return Id_tipo;
    }
    public void setId_tipo(Integer id_tipo) {
        Id_tipo = id_tipo;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
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
    @Override
    public String toString(){
        return getClass().getName()
        + "\n Id_tipo:              "+ getId_tipo()       
        + "\n Nombre:               "+ getNombre()       
        + "\n Estado:               "+ getEstado()       
        + "\n Fecha_creacion:       "+ getFecha_creacion()    
        + "\n Fecha_modificacion:   "+ getFecha_modificacion();
    }
    
}
