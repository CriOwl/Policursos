package BusinessLogic.Entities;

public class Tutor extends Persona implements ITutor{

    public Tutor(String cedula, String clave) {
        super(cedula, clave);
    }

    @Override
    public void dictarClase() {
        System.out.println("El tutor está dictando una clase.");
    }

    @Override
    public void calificarEstudiante(Estudiante estudiante, double nota) {
        estudiante.setNota(nota);
        System.out.println("El tutor ha calificado al estudiante " + estudiante.getNombre() + " con una nota de " + nota);
    }
}
