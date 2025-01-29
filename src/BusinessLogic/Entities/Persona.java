package BusinessLogic.Entities;

import BusinessLogic.BLFactory;
import DataAccess.DAO.CursoDAO;
import DataAccess.DTO.CursoDTO;

public abstract class Persona implements IPersona{
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
    
    private static void getNombreDB() throws Exception{
        BLFactory<PersonaDTO> oPersonaBL = new BLFactory<>(PersonaDAO::new);
        Persona.nombre = oPersona.getBy(1).getNombre(); 
    }

    private static void getApellidoDB() throws Exception{
        BLFactory<PersonaDTO> oPersonaBL = new BLFactory<>(PersonaDAO::new);
        Persona.apellido = oPersona.getBy(1).getApellido(); 
    }

    private static void getCorreoDB() throws Exception{
        BLFactory<PersonaDTO> oPersonaBL = new BLFactory<>(PersonaDAO::new);
        Persona.correo = oPersona.getBy(1).getCorreo(); 
    }

    private static void getClaveDB() throws Exception{
        BLFactory<PersonaDTO> oPersonaBL = new BLFactory<>(PersonaDAO::new);
        Persona.clave = oPersona.getBy(1).getClave(); 
    }

    private static void getFechaNacimientoDB() throws Exception{
        BLFactory<PersonaDTO> oPersonaBL = new BLFactory<>(PersonaDAO::new);
        Persona.fechaNacimiento = oPersona.getBy(1).getFecha_nacimiento(); 
    }

    private static void getPaisDB() throws Exception{
        BLFactory<PersonaDTO> oPersonaBL = new BLFactory<>(PersonaDAO::new);
        Persona.pais = oPersona.getBy(1).getPais(); 
    }

}