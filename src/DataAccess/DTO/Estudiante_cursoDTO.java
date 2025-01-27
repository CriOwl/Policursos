package DataAccess.DTO;

public class Estudiante_cursoDTO {
    private Integer Id_estudiante_curso;
    private Integer Id_estudiante;
    private Integer Id_curso;
    private Integer Id_catalogo_curso;
    
    public Estudiante_cursoDTO(){}

    public Estudiante_cursoDTO(Integer Id_estudiante, Integer Id_curso,
            Integer Id_catalogo_curso) {
        this.Id_estudiante = Id_estudiante;
        this.Id_curso = Id_curso;
        this.Id_catalogo_curso = Id_catalogo_curso;
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
        + "\n Id_catalogo_curso:  " +  getId_catalogo_curso();
    }
}
