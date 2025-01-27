package DataAccess.DTO;

public class NotaDTO {
    private Integer Id_nota;
    private Integer Id_modulo_actividad;
    private Integer Id_estudiante_curso;
    private Integer Nota;
    private String Estado;
    private String Fecha_creacion;
    private String Fecha_modificacion;

    public NotaDTO(){}

    public NotaDTO(Integer Id_modulo_actividad, Integer Id_estudiante_curso, Integer nota) {
        this.Id_modulo_actividad = Id_modulo_actividad;
        this.Id_estudiante_curso = Id_estudiante_curso;
        this.Nota = nota;
    }


    public NotaDTO(Integer Id_nota, Integer Id_modulo_actividad, Integer Id_estudiante_curso, Integer nota,
            String Estado, String Fecha_creacion, String Fecha_modificacion) {
        this.Id_nota = Id_nota;
        this.Id_modulo_actividad = Id_modulo_actividad;
        this.Id_estudiante_curso = Id_estudiante_curso;
        this.Nota = nota;
        this.Estado = Estado;
        this.Fecha_creacion = Fecha_creacion;
        this.Fecha_modificacion = Fecha_modificacion;
    }

    
    public Integer getId_nota() {
        return Id_nota;
    }
    public void setId_nota(Integer Id_nota) {
        this.Id_nota = Id_nota;
    }
    public Integer getId_modulo_actividad() {
        return Id_modulo_actividad;
    }
    public void setId_modulo_actividad(Integer Id_modulo_actividad) {
        this.Id_modulo_actividad = Id_modulo_actividad;
    }
    public Integer getId_estudiante_curso() {
        return Id_estudiante_curso;
    }
    public void setId_estudiante_curso(Integer Id_estudiante_curso) {
        this.Id_estudiante_curso = Id_estudiante_curso;
    }
    public Integer getNota() {
        return Nota;
    }
    public void setNota(Integer nota) {
        Nota = nota;
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
        + "\n Id_nota:  " + getId_nota()
        + "\n Id_modulo_actividad:  " + getId_modulo_actividad()
        + "\n Id_estudiante_curso:  " + getId_estudiante_curso()
        + "\n Nota: " + getNota()
        + "\n Estado: " + getEstado()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
