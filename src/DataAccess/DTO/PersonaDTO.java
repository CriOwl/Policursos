package DataAccess.DTO;

public class PersonaDTO {
    

    private Integer id_persona; 
    private String nombre;
    private String apellido; 
    private String correo;
    private String descripcion;
    private String clave;  
    private String id_catalogo_pais;
    private String fecha_nacimiento; 
    private String estado;
    private String fecha_creacion;
    private String fecha_modificacion;

    public PersonaDTO(){}

    public PersonaDTO(String nombre, String apellido, String correo, String descripcion, String clave, String fecha_nacimiento){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCorreo(correo);
        this.setDescripcion(descripcion);
        this.setClave(clave);
        this.setFecha_nacimiento(fecha_nacimiento);
    }

    public PersonaDTO(Integer id_persona, String nombre, String apellido, String correo, String descripcion,
            String clave, String id_catalogo_pais, String fecha_nacimiento, String estado, String fecha_creacion, String fecha_modificacion) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.descripcion = descripcion;
        this.clave = clave;
        this.id_catalogo_pais = id_catalogo_pais;
        this.fecha_nacimiento = fecha_nacimiento;
        this.estado = estado;
        this.fecha_creacion = fecha_creacion;
        this.fecha_modificacion = fecha_modificacion;
    }



    public Integer getId_persona() {
        return id_persona;
    }
    public void setId_persona(Integer id_persona) {
        this.id_persona = id_persona;
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
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getClave() {
        return clave;
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public String getId_catalogo_pais() {
        return id_catalogo_pais;
    }
    public void setId_catalogo_pais(String id_catalogo_pais) {
        this.id_catalogo_pais = id_catalogo_pais;
    }
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getFecha_creacion() {
        return fecha_creacion;
    }
    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    public String getFecha_modificacion() {
        return fecha_modificacion;
    }
    public void setFecha_modificacion(String fecha_modificacion) {
        this.fecha_modificacion = fecha_modificacion;
    } 
}
