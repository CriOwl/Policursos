package DataAccess.DTO;

public class Estudiante_cursoDTO {
    private Integer Id_estudiante_curso;
    private Integer Id_estudiante;
    private Integer Id_curso;
    private Integer Id_catalogo_curso;
    private String  Estado;       
    private String  Fecha_creacion;    
    private String  Fecha_modificacion;
    
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

    public Estudiante_cursoDTO(){}

    public Estudiante_cursoDTO(Integer id_estudiante, Integer id_curso,
            Integer id_catalogo_curso, String estado, String fecha_creacion, String fecha_modificacion) {
        this.Id_estudiante =        id_estudiante;
        this.Id_curso =             id_curso;
        this.Id_catalogo_curso =    id_catalogo_curso;
        this.Estado = estado;
        this.Fecha_creacion = fecha_creacion;
        this.Fecha_modificacion = fecha_modificacion;
    }

    public Estudiante_cursoDTO(Integer id_estudiante_curso,Integer id_estudiante, Integer id_curso,
            Integer id_catalogo_curso, String estado, String fecha_creacion, String fecha_modificacion) {
        this.Id_estudiante_curso =  id_estudiante_curso;
        this.Id_estudiante =        id_estudiante;
        this.Id_curso =             id_curso;
        this.Id_catalogo_curso =    id_catalogo_curso;
        this.Estado = estado;
        this.Fecha_creacion = fecha_creacion;
        this.Fecha_modificacion = fecha_modificacion;
    }

    public Integer getId_estudiante_curso() {
        return Id_estudiante_curso;
    }
    public void setId_estudiante_curso(Integer Id_estudiante_curso) {
        this.Id_estudiante_curso = Id_estudiante_curso;
    }
    public Integer getId_estudiante() {
        return Id_estudiante;
    }
    public void setId_estudiante(Integer Id_estudiante) {
        this.Id_estudiante = Id_estudiante;
    }
    public Integer getId_curso() {
        return Id_curso;
    }
    public void setId_curso(Integer Id_curso) {
        this.Id_curso = Id_curso;
    }
    public Integer getId_catalogo_curso() {
        return Id_catalogo_curso;
    }
    public void setId_catalogo_curso(Integer Id_catalogo_curso) {
        this.Id_catalogo_curso = Id_catalogo_curso;
    }

    public String toString() {
        return getClass().getName()
        + "\n Id_estudiante_curso:  " + getId_estudiante_curso()
        + "\n Id_estudiante: " + getId_estudiante()
        + "\n Id_curso: " + getId_curso()
        + "\n Id_catalogo_curso:  " +  getId_catalogo_curso()
        + "\n Estado:               "+ getEstado()       
        + "\n Fecha_creacion:       "+ getFecha_creacion()    
        + "\n Fecha_modificacion:   "+ getFecha_modificacion();
    }
}
