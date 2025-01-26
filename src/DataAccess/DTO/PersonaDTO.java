package DataAccess.DTO;

public class PersonaDTO {
    

    private Integer Id_persona; 
    private Integer Id_catalogo_pais;
    private Integer Id_rol;
    private Integer Id_sexo;
    private String Cedula;
    
    private String Nombre;
    private String Apellido; 
    private String Correo;
    private String Descripcion;
    private String Clave;  
    private String Fecha_nacimiento; 
    private String Estado;
    private String Fecha_creacion;
    private String Fecha_modificacion;
    
    public PersonaDTO(){}
    
    public PersonaDTO(Integer id_rol, Integer id_sexo, String cedula, String nombre,
    String apellido, String correo, String clave) {
        this.Id_rol = id_rol;
        this.Id_sexo = id_sexo;
        this.Cedula = cedula;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Correo = correo;
        this.Clave = clave;
    }
    
    
    public PersonaDTO(Integer id_persona, Integer id_rol, Integer id_sexo, String cedula ,String nombre,
    String apellido, String correo, String descripcion, String clave, Integer id_catalogo_pais, String fecha_nacimiento, String estado,
    String fecha_creacion, String fecha_modificacion) {
        this.Id_persona = id_persona;
        this.Id_catalogo_pais = id_catalogo_pais;
        this.Id_rol = id_rol;
        this.Id_sexo = id_sexo;
        this.Cedula = cedula;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Correo = correo;
        this.Descripcion = descripcion;
        this.Clave = clave;
        this.Fecha_nacimiento = fecha_nacimiento;
        this.Estado = estado;
        this.Fecha_creacion = fecha_creacion;
        this.Fecha_modificacion = fecha_modificacion;
    }
    
    public Integer getId_rol() {
        return Id_rol;
    }
    
    public void setId_rol(Integer id_rol) {
        this.Id_rol = id_rol;
    }
    
    public Integer getId_sexo() {
        return Id_sexo;
    }
    
    public void setId_sexo(Integer id_sexo) {
        this.Id_sexo = id_sexo;
    } 

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }
    
    public Integer getId_persona() {
        return Id_persona;
    }
    public void setId_persona(Integer id_persona) {
        this.Id_persona = id_persona;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String correo) {
        Correo = correo;
    }
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public String getClave() {
        return Clave;
    }
    public void setClave(String clave) {
        Clave = clave;
    }
    public Integer getId_catalogo_pais() {
        return Id_catalogo_pais;
    }
    public void setId_catalogo_pais(Integer id_catalogo_pais) {
        this.Id_catalogo_pais = id_catalogo_pais;
    }
    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }
    public void setFecha_nacimiento(String fecha_nacimiento) {
        Fecha_nacimiento = fecha_nacimiento;
    }
    public String getEstado() {
        return Estado;
    }
    public void setEstado(String estado) {
        Estado = estado;
    }
    public String getFecha_creacion() {
        return Fecha_creacion;
    }
    public void setFecha_creacion(String fecha_creacion) {
        Fecha_creacion = fecha_creacion;
    }
    public String getFecha_modificacion() {
        return Fecha_modificacion;
    }
    public void setFecha_modificacion(String fecha_modificacion) {
        Fecha_modificacion = fecha_modificacion;
    } 

    @Override
    public String toString() {
        return getClass().getName()
        + "\n Id_persona:  " + getId_persona()
        + "\n IdCatalogoPais: " + getId_catalogo_pais()
        + "\n Id_rol:  " + getId_rol()
        + "\n Id_sexo:  " + getId_sexo()
        + "\n Nombre: " + getNombre()
        + "\n Apellido: " + getApellido()
        + "\n Correo: " + getCorreo()
        + "\n Descripcion: " + getDescripcion()
        + "\n Clave: " + getClave()
        + "\n FechaNacimiento: " + getFecha_nacimiento()
        + "\n Estado: " + getNombre()
        + "\n FechaCreacion:  " +  getFecha_creacion()
        + "\n Fecha_modificacion=" + getFecha_modificacion();
    }
}
