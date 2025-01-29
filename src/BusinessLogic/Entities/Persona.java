package BusinessLogic.Entities;

import BusinessLogic.BLFactory;
import DataAccess.DAO.PersonaDAO;
import DataAccess.DTO.PersonaDTO;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona implements IPersona {
    private int idPersona;
    private String rol;
    private String sexo;
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String clave;
    private String fechaNacimiento;
    private String pais;

    public Persona(String cedula, String clave) {
        this.cedula = cedula;
        this.clave = clave;
    }

    @Override
    public boolean ingresar(String cedula, String clave) {
        return this.cedula.equals(cedula) && this.clave.equals(clave);
    }

    // Getters y setters

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    public static Persona getPersonaById(int id) throws Exception {
        BLFactory<PersonaDTO> personaFactory = new BLFactory<>(PersonaDAO::new);
        PersonaDTO personaDTO = personaFactory.getBy(id);
        return new Estudiante(personaDTO.getCedula(), personaDTO.getClave()); 
    }

    public static List<Persona> getAllPersonas() throws Exception {
        BLFactory<PersonaDTO> personaFactory = new BLFactory<>(PersonaDAO::new);
        List<PersonaDTO> personaDTOList = personaFactory.getAll();
        List<Persona> personas = new ArrayList<>();
        for (PersonaDTO dto : personaDTOList) {
            personas.add(new Estudiante(dto.getCedula(), dto.getClave())); 
        }
        return personas;
    }

    public static boolean addPersona(Persona persona) throws Exception {
        BLFactory<PersonaDTO> personaFactory = new BLFactory<>(PersonaDAO::new);
        PersonaDTO personaDTO = new PersonaDTO(persona.getIdRol(), persona.getIdSexo(), persona.getCedula(), persona.getNombre(), persona.getApellido(), persona.getClave(), persona.getIdCatalogoPais());
        return personaFactory.add(personaDTO);
    }

    public static boolean updatePersona(Persona persona) throws Exception {
        BLFactory<PersonaDTO> personaFactory = new BLFactory<>(PersonaDAO::new);
        PersonaDTO personaDTO = new PersonaDTO(persona.getIdPersona(), persona.getIdRol(), persona.getIdSexo(), persona.getCedula(), persona.getNombre(), persona.getApellido(), persona.getCorreo(), persona.getDescripcion(), persona.getClave(), persona.getIdCatalogoPais(), persona.getFechaNacimiento(), persona.getEstado(), persona.getFechaCreacion(), persona.getFechaModificacion());
        return personaFactory.upd(personaDTO);
    }

    public static boolean deletePersona(int id) throws Exception {
        BLFactory<PersonaDTO> personaFactory = new BLFactory<>(PersonaDAO::new);
        return personaFactory.del(id);
    }
}
