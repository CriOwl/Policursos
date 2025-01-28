package BusinessLogic.Entities;

public class Sistema implements ICertificado{
    private Estudiante estudiante;
    private Curso curso;

    public boolean validarCredenciales(IPersona usuario, String cedula, String clave) {
        return usuario.ingresar(cedula, clave);
    }

    @Override
    public void crearCertificadoAprob(Estudiante estudiante) {
        if (estudiante.getNota() >= 70) {
            System.out.println("Certificado de aprobación creado para el estudiante: " + estudiante.getNombre());
        } else {
            System.out.println("El estudiante no ha aprobado.");
        }
    }
    
    public Estudiante getEstudiante() {
        return estudiante;
    }
    
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    
    public Curso getCurso() {
        return curso;
    }
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}