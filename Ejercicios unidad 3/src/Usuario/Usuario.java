package Usuario;

public class Usuario {
    private String apellido;
    private String nombre;
    private String documento;
    private String nombreusuario;
    private String contrasenia;

    public Usuario(){}
    public Usuario(String apellido, String nombre,String documento, String nombreusuario, String contrasenia){
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
        this.nombreusuario = nombreusuario;
        this.contrasenia = contrasenia;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento(){
        return documento;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia){
        this.contrasenia = contrasenia;
    }

    public String toString (){
        return "Apellido: "+apellido+" Nombre: "+nombre+" Documento: "+documento;
    }
}
