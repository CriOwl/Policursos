package DataAccess.DTO;
public class CatalogoDTO {
    private Integer Id_catalogo;       
    private String  Nombre;       
    private String  Estado;       
    private String  Fecha_creacion;    
    private String  Fecha_modificacion;
    private Integer Id_tipo;       
    private Integer Id_padre;       
    

    
    public CatalogoDTO(){ }
    
    public CatalogoDTO(String nombre, int tipo) {
        this.Nombre = nombre;
        this.Id_tipo = tipo;
    }
    
    public CatalogoDTO(int id_catalogo, String nombre, String estado, String fecha_creacion, String fecha_modificacion, int id_tipo, int id_padre) {
        this.Id_catalogo = id_catalogo;
        this.Nombre = nombre;
        this.Estado = estado;
        this.Fecha_creacion = fecha_creacion;
        this.Fecha_modificacion = fecha_modificacion;
        this.Id_tipo = id_tipo;
        this.Id_padre = id_padre;
    }
    
    public Integer getId_tipo() {
        return Id_tipo;
    }

    public void setId_tipo(Integer id_tipo) {
        Id_tipo = id_tipo;
    }

    public Integer getId_padre() {
        return Id_padre;
    }

    public void setId_padre(Integer id_padre) {
        Id_padre = id_padre;
    }

    public Integer getId_catalogo() {
        return Id_catalogo;
    }
    public void setId_catalogo(Integer id_catalogo) {
        Id_catalogo = id_catalogo;
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
        + "\n Id_catalogo:          "+ getId_catalogo()       
        + "\n Nombre:               "+ getNombre()       
        + "\n Estado:               "+ getEstado()       
        + "\n Fecha_creacion:       "+ getFecha_creacion()    
        + "\n Fecha_modificacion:   "+ getFecha_modificacion()
        + "\n Id_tipo:              "+ getId_tipo()
        + "\n Id_padre:             "+ getId_padre();
    }
    
}
