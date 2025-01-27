package DataAccess.DTO;

public class CursoDTO {
    private Integer Id_curso;
    private Integer Id_tutor;
    private String Nombre;
    private String Descripcion;
    private Integer Id_catalogo_categoria;
    private Integer Id_catalogo_subcategoria;
    private Integer Id_catalogo_idioma;
    private Integer Id_catalogo_nivel;
    private String Fecha_inicio;
    private String Fecha_fin;
    private String Nota_aprobacion;
    private String Duracion;
    private String Estado;
    private String Fecha_creacion;
    private String Fecha_modificacion;
    
    
    public CursoDTO(){}
    
    public CursoDTO(Integer id_tutor, String nombre, String descripcion, Integer id_catalogo_categoria,
            Integer id_catalogo_subcategoria, Integer id_catalogo_idioma, Integer id_catalogo_nivel,
            String fecha_inicio, String fecha_fin, String nota_aprobacion, String duracion) {
        Id_tutor = id_tutor;
        Nombre = nombre;
        Descripcion = descripcion;
        Id_catalogo_categoria = id_catalogo_categoria;
        Id_catalogo_subcategoria = id_catalogo_subcategoria;
        Id_catalogo_idioma = id_catalogo_idioma;
        Id_catalogo_nivel = id_catalogo_nivel;
        Fecha_inicio = fecha_inicio;
        Fecha_fin = fecha_fin;
        Nota_aprobacion = nota_aprobacion;
        Duracion = duracion;
    }

    public CursoDTO(Integer id_curso, Integer id_tutor, String nombre, String descripcion,
    Integer id_catalogo_categoria, Integer id_catalogo_subcategoria, Integer id_catalogo_idioma,
    Integer id_catalogo_nivel, String fecha_inicio, String fecha_fin, String nota_aprobacion, String duracion,
    String estado, String fecha_creacion, String fecha_modificacion) {
        Id_curso = id_curso;
        Id_tutor = id_tutor;
        Nombre = nombre;
        Descripcion = descripcion;
        Id_catalogo_categoria = id_catalogo_categoria;
        Id_catalogo_subcategoria = id_catalogo_subcategoria;
        Id_catalogo_idioma = id_catalogo_idioma;
        Id_catalogo_nivel = id_catalogo_nivel;
        Fecha_inicio = fecha_inicio;
        Fecha_fin = fecha_fin;
        Nota_aprobacion = nota_aprobacion;
        Duracion = duracion;
        Estado = estado;
        Fecha_creacion = fecha_creacion;
        Fecha_modificacion = fecha_modificacion;
    }

    public Integer getId_curso() {
        return Id_curso;
    }
    public void setId_curso(Integer Id_curso) {
        this.Id_curso = Id_curso;
    }
    public Integer getId_tutor() {
        return Id_tutor;
    }
    public void setId_tutor(Integer Id_tutor) {
        this.Id_tutor = Id_tutor;
    }
    public Integer getId_catalogo_categoria() {
        return Id_catalogo_categoria;
    }
    public void setId_catalogo_categoria(Integer Id_catalogo_categoria) {
        this.Id_catalogo_categoria = Id_catalogo_categoria;
    }
    public Integer getId_catalogo_subcategoria() {
        return Id_catalogo_subcategoria;
    }
    public void setId_catalogo_subcategoria(Integer Id_catalogo_subcategoria) {
        this.Id_catalogo_subcategoria = Id_catalogo_subcategoria;
    }
    public Integer getId_catalogo_idioma() {
        return Id_catalogo_idioma;
    }
    public void setId_catalogo_idioma(Integer Id_catalogo_idioma) {
        this.Id_catalogo_idioma = Id_catalogo_idioma;
    }
    public Integer getId_catalogo_nivel() {
        return Id_catalogo_nivel;
    }
    public void setId_catalogo_nivel(Integer id_catalogo_nive) {
        this.Id_catalogo_nivel = id_catalogo_nive;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
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
    public void setFecha_fin(String echa_fin) {
        this.Fecha_fin = echa_fin;
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
        + "\n Id_curso:  " + getId_curso()
        + "\n Id_tutor:  " + getId_tutor()
        + "\n Nombre: " + getNombre()
        + "\n Descripcion:  " + getDescripcion()
        + "\n Id_catalogo_categoria:  " + getId_catalogo_categoria()
        + "\n Id_catalogo_subcategoria:  " + getId_catalogo_subcategoria()
        + "\n Id_catalogo_idioma:  " + getId_catalogo_idioma()
        + "\n Id_catalogo_nivel:  " + getId_catalogo_nivel()
        + "\n Fecha_inicio:  " + getFecha_inicio()
        + "\n Fecha_fin:  " + getFecha_fin()
        + "\n Nota_aprobacion:  " + getNota_aprobacion()
        + "\n Duracion: " + getDuracion()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
