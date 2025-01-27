package DataAccess.DTO;

public class CursoDTO {
    private Integer Id_curso;
    private Integer Id_tutor;
    private String Nombre;
    private String Descripcion;
    private Integer Id_catalogo_categoria;
    private Integer Id_catalogo_subcategoria;
    private Integer Id_catalogo_nivel;

    private String Estado;
    private String Fecha_creacion;
    private String Fecha_modificacion;
    
    
    public CursoDTO(){}
    
    public CursoDTO(Integer id_tutor, String nombre, String descripcion, Integer id_catalogo_categoria,
            Integer id_catalogo_subcategoria, Integer id_catalogo_nivel) {
        Id_tutor = id_tutor;
        Nombre = nombre;
        Descripcion = descripcion;
        Id_catalogo_categoria = id_catalogo_categoria;
        Id_catalogo_subcategoria = id_catalogo_subcategoria;
        Id_catalogo_nivel = id_catalogo_nivel;
    }

    public CursoDTO(Integer id_curso, Integer id_tutor, String nombre, String descripcion,
    Integer id_catalogo_categoria, Integer id_catalogo_subcategoria,
    Integer id_catalogo_nivel, String estado, String fecha_creacion, String fecha_modificacion) {
        Id_curso = id_curso;
        Id_tutor = id_tutor;
        Nombre = nombre;
        Descripcion = descripcion;
        Id_catalogo_categoria = id_catalogo_categoria;
        Id_catalogo_subcategoria = id_catalogo_subcategoria;
        Id_catalogo_nivel = id_catalogo_nivel;
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
        + "\n Id_catalogo_nivel:  " + getId_catalogo_nivel()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
