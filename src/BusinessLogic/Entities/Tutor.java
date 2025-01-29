package BusinessLogic.Entities;

import BusinessLogic.BLFactory;
import DataAccess.DAO.PersonaDAO;
import DataAccess.DTO.PersonaDTO;

import java.util.ArrayList;
import java.util.List;

public class Tutor extends Persona implements ITutor {

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


    public static Tutor getTutorById(int id) throws Exception {
        BLFactory<PersonaDTO> personaFactory = new BLFactory<>(PersonaDAO::new);
        PersonaDTO personaDTO = personaFactory.getBy(id);
        return new Tutor(personaDTO.getCedula(), personaDTO.getClave());
    }

    public static List<Tutor> getAllTutores() throws Exception {
        BLFactory<PersonaDTO> personaFactory = new BLFactory<>(PersonaDAO::new);
        List<PersonaDTO> personaDTOList = personaFactory.getAll();
        List<Tutor> tutores = new ArrayList<>();
        for (PersonaDTO dto : personaDTOList) {
            if (dto.getId_rol() == 3) { 
                tutores.add(new Tutor(dto.getCedula(), dto.getClave()));
            }
        }
        return tutores;
    }

    public static boolean addTutor(Tutor tutor) throws Exception {
        BLFactory<PersonaDTO> personaFactory = new BLFactory<>(PersonaDAO::new);
        PersonaDTO personaDTO = new PersonaDTO(tutor.getIdRol(), tutor.getIdSexo(), tutor.getCedula(), tutor.getNombre(), tutor.getApellido(), tutor.getClave(), tutor.getIdCatalogoPais());
        return personaFactory.add(personaDTO);
    }

    public static boolean updateTutor(Tutor tutor) throws Exception {
        BLFactory<PersonaDTO> personaFactory = new BLFactory<>(PersonaDAO::new);
        PersonaDTO personaDTO = new PersonaDTO(tutor.getIdPersona(), tutor.getIdRol(), tutor.getIdSexo(), tutor.getCedula(), tutor.getNombre(), tutor.getApellido(), tutor.getCorreo(), tutor.getDescripcion(), tutor.getClave(), tutor.getIdCatalogoPais(), tutor.getFechaNacimiento(), tutor.getEstado(), tutor.getFechaCreacion(), tutor.getFechaModificacion());
        return personaFactory.upd(personaDTO);
    }

    public static boolean deleteTutor(int id) throws Exception {
        BLFactory<PersonaDTO> personaFactory = new BLFactory<>(PersonaDAO::new);
        return personaFactory.del(id);
    }
}
