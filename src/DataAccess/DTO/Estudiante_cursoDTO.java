package DataAccess.DTO;

public class Estudiante_cursoDTO {
    private Integer id_estudiante_curso;
    private Integer id_estudiante;
    private Integer id_curso;
    private Integer id_catalogo_curso;
    
    public Estudiante_cursoDTO(){}

    public Estudiante_cursoDTO(Integer id_estudiante_curso, Integer id_estudiante, Integer id_curso,
            Integer id_catalogo_curso) {
        this.id_estudiante_curso = id_estudiante_curso;
        this.id_estudiante = id_estudiante;
        this.id_curso = id_curso;
        this.id_catalogo_curso = id_catalogo_curso;
    }

    public Integer getId_estudiante_curso() {
        return id_estudiante_curso;
    }
    public void setId_estudiante_curso(Integer id_estudiante_curso) {
        this.id_estudiante_curso = id_estudiante_curso;
    }
    public Integer getId_estudiante() {
        return id_estudiante;
    }
    public void setId_estudiante(Integer id_estudiante) {
        this.id_estudiante = id_estudiante;
    }
    public Integer getId_curso() {
        return id_curso;
    }
    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }
    public Integer getId_catalogo_curso() {
        return id_catalogo_curso;
    }
    public void setId_catalogo_curso(Integer id_catalogo_curso) {
        this.id_catalogo_curso = id_catalogo_curso;
    }

    public String toString() {
        return getClass().getName()
        + "\n Id_estudiante_curso:  " + getId_estudiante_curso()
        + "\n Id_estudiante: " + getId_estudiante()
        + "\n Id_curso: " + getId_curso()
        + "\n Id_catalogo_curso:  " +  getId_catalogo_curso();
    }
}
