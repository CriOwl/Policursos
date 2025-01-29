package BusinessLogic.Entities;

public class Estudiante extends Persona{

    private double nota;

    public Estudiante(String cedula, String clave, double nota) {
        super(cedula, clave);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}