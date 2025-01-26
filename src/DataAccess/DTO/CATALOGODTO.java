package DataAccess.DTO;

public class CATALOGODTO {
    private Integer id_catalogo;
    private Integer id_tipo;
    private Integer id_padre;
    private String nombre;
    private String estado; 
    private String fecha_creacion;
    private String fecha_modificacion;
    
    public CATALOGODTO(){}

    public CATALOGODTO(Integer id_tipo, String nombre) {
        this.id_tipo = id_tipo;
        this.nombre = nombre;
    }

    public CATALOGODTO(Integer id_catalogo, Integer id_tipo, Integer id_padre, String nombre, String estado,
            String fecha_creacion, String fecha_modificacion) {
        this.id_catalogo = id_catalogo;
        this.id_tipo = id_tipo;
        this.id_padre = id_padre;
        this.nombre = nombre;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }
    public Integer getId_catalogo() {
        return id_catalogo;
    }
    public void setId_catalogo(Integer id_catalogo) {
        this.id_catalogo = id_catalogo;
    }
    public Integer getId_tipo() {
        return id_tipo;
    }
    public void setId_tipo(Integer id_tipo) {
        this.id_tipo = id_tipo;
    }
    public Integer getId_padre() {
        return id_padre;
    }
    public void setId_padre(Integer id_padre) {
        this.id_padre = id_padre;
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
        + "\n Id_catalogo:  " + getId_catalogo()
        + "\n Id_Tipo:  " + getId_tipo()
        + "\n Id_padre:  " + getId_padre()
        + "\n Nombre: " + getNombre()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}

