package BusinessLogic;

import java.util.List;

import DataAccess.DAO.PersonaDAO;
import DataAccess.DTO.PersonaDTO;

public class PersonaBL {
    private PersonaDTO persona;
    private PersonaDAO personaDAO = new PersonaDAO();

    public PersonaBL() {}

    public List<PersonaDTO> getAll() throws Exception{
        return personaDAO.readAll();
    }

    public PersonaDTO getByidPersona(int idpersona) throws Exception{
        persona = personaDAO.readBy(idpersona);
        return persona;
    }

    public boolean create(PersonaDTO personaDTO) throws Exception{
        return personaDAO.create(personaDTO);
    }

    public boolean update(PersonaDTO personaDTO) throws Exception{
        return personaDAO.update(personaDTO);
    }

    public boolean delete(int id_persona) throws Exception{
        return personaDAO.delete(id_persona);
    }

    public Integer getMaxRow() throws Exception{
        return personaDAO.getMaxRow();
    }

}
