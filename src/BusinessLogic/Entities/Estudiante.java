package BusinessLogic.Entities;

import BusinessLogic.BLFactory;
import DataAccess.DAO.CursoDAO;
import DataAccess.DTO.CursoDTO;

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

    private static void getNotaDB() throws Exception{
        BLFactory<Estudiante_cursoDTO> oEstudiante_cursoBL = new BLFactory<>(Estudiante_cursoDAO::new);
        Estudiante_curso.nota = oEstudiante_curso.getBy(1).getNota(); 
    }

}
