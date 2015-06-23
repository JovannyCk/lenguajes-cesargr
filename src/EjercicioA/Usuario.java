package EjercicioA;

public class Usuario {
    
    private String usuario;
    private String nombre;
    private int edad;
    private String email;
    private Direccion direccion;
    
    public Usuario(){
        //Constructor por defecto
    }
    public Usuario(String nombre, int edad, String email, Direccion direccion){
        this.edad=edad;
        this.nombre=nombre;
        this.email=email;
        this.direccion=direccion;
        //Constructor que inicialize todos los atributos
    }
    //Encapsular todos los atributos
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    

   
    
}
