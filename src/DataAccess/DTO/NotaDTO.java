package DataAccess.DTO;

public class NotaDTO {
    private Integer id_nota;
    private Integer id_modulo_actividad;
    private Integer id_estudiante_curso;
    private Integer Nota;
    private String estado;
    private String fecha_creacion;
    private String fecha_modificacion;

    public NotaDTO(){}

    public NotaDTO(Integer id_nota, Integer id_modulo_actividad, Integer id_estudiante_curso, Integer nota) {
        this.id_nota = id_nota;
        this.id_modulo_actividad = id_modulo_actividad;
        this.id_estudiante_curso = id_estudiante_curso;
        Nota = nota;
    }


    public NotaDTO(Integer id_nota, Integer id_modulo_actividad, Integer id_estudiante_curso, Integer nota,
            String estado, String fecha_creacion, String fecha_modificacion) {
        this.id_nota = id_nota;
        this.id_modulo_actividad = id_modulo_actividad;
        this.id_estudiante_curso = id_estudiante_curso;
        Nota = nota;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }

    
    public Integer getId_nota() {
        return id_nota;
    }
    public void setId_nota(Integer id_nota) {
        this.id_nota = id_nota;
    }
    public Integer getId_modulo_actividad() {
        return id_modulo_actividad;
    }
    public void setId_modulo_actividad(Integer id_modulo_actividad) {
        this.id_modulo_actividad = id_modulo_actividad;
    }
    public Integer getId_estudiante_curso() {
        return id_estudiante_curso;
    }
    public void setId_estudiante_curso(Integer id_estudiante_curso) {
        this.id_estudiante_curso = id_estudiante_curso;
    }
    public Integer getNota() {
        return Nota;
    }
    public void setNota(Integer nota) {
        Nota = nota;
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
        + "\n Id_nota:  " + getId_nota()
        + "\n Id_modulo_actividad:  " + getId_modulo_actividad()
        + "\n Id_estudiante_curso:  " + getId_estudiante_curso()
        + "\n Nota: " + getNota()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
