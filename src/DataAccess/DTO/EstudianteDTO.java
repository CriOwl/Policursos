package DataAccess.DTO;

public class EstudianteDTO {
    private Integer Id_estudiante;
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Clave;
    private String Fecha_nacimiento;
    private String Pais;

    public EstudianteDTO() {}

    public EstudianteDTO(Integer id_estudiante, String cedula, String nombre, String apellido, String correo, String clave, String fecha_nacimiento, String pais) {
        this.Id_estudiante = id_estudiante;
        this.Cedula = cedula;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Correo = correo;
        this.Clave = clave;
        this.Fecha_nacimiento = fecha_nacimiento;
        this.Pais = pais;
    }

    public Integer getId_estudiante() {
        return Id_estudiante;
    }

    public void setId_estudiante(Integer id_estudiante) {
        this.Id_estudiante = id_estudiante;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        this.Cedula = cedula;
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
        this.Correo = correo;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        this.Clave = clave;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.Fecha_nacimiento = fecha_nacimiento;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        this.Pais = pais;
    }
}
