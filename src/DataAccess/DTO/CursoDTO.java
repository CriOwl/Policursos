package DataAccess.DTO;

public class CursoDTO {
    private Integer id_curso;
    private Integer id_tutor;
    private Integer id_factura;
    private Integer id_catalogo_categoria;
    private Integer id_catalogo_subcategoria;
    private Integer id_catalogo_idioma;
    private Integer id_catalogo_nivel;
    private String nombre;
    private String descripcion;
    private String fecha_inicio;
    private String fecha_fin;
    private String Nota_aprobacion;
    private String Duracion;
    private String estado;
    private String fecha_creacion;
    private String fecha_modificacion;
    
    public CursoDTO(){}
    
    
    
    
    public Integer getId_factura() {
        return id_factura;
    }

    public void setId_factura(Integer id_factura) {
        this.id_factura = id_factura;
    }
    public Integer getId_curso() {
        return id_curso;
    }
    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }
    public Integer getId_tutor() {
        return id_tutor;
    }
    public void setId_tutor(Integer id_tutor) {
        this.id_tutor = id_tutor;
    }
    public Integer getId_catalogo_categoria() {
        return id_catalogo_categoria;
    }
    public void setId_catalogo_categoria(Integer id_catalogo_categoria) {
        this.id_catalogo_categoria = id_catalogo_categoria;
    }
    public Integer getId_catalogo_subcategoria() {
        return id_catalogo_subcategoria;
    }
    public void setId_catalogo_subcategoria(Integer id_catalogo_subcategoria) {
        this.id_catalogo_subcategoria = id_catalogo_subcategoria;
    }
    public Integer getId_catalogo_idioma() {
        return id_catalogo_idioma;
    }
    public void setId_catalogo_idioma(Integer id_catalogo_idioma) {
        this.id_catalogo_idioma = id_catalogo_idioma;
    }
    public Integer getId_catalogo_nivel() {
        return id_catalogo_nivel;
    }
    public void setId_catalogo_nivel(Integer id_catalogo_nive) {
        this.id_catalogo_nivel = id_catalogo_nive;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public void setFecha_fin(String echa_fin) {
        this.fecha_fin = echa_fin;
    }
    public String getNota_aprobacion() {
        return Nota_aprobacion;
    }
    public void setNota_aprobacion(String nota_aprobacion) {
        Nota_aprobacion = nota_aprobacion;
    }
    public String getDuracion() {
        return Duracion;
    }
    public void setDuracion(String duracion) {
        Duracion = duracion;
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
        + "\n Id_curso:  " + getId_curso()
        + "\n Id_tutor:  " + getId_tutor()
        + "\n Id_factura:  " + getId_factura()
        + "\n Id_catalogo_categoria:  " + getId_catalogo_categoria()
        + "\n Id_catalogo_subcategoria:  " + getId_catalogo_subcategoria()
        + "\n Id_catalogo_idioma:  " + getId_catalogo_idioma()
        + "\n Id_catalogo_nivel:  " + getId_catalogo_nivel()
        + "\n Nombre: " + getNombre()
        + "\n Descripcion:  " + getDescripcion()
        + "\n Fecha_inicio:  " + getFecha_inicio()
        + "\n Fecha_fin:  " + getFecha_fin()
        + "\n Nota_aprobacion:  " + getNota_aprobacion()
        + "\n Duracion: " + getDuracion()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
