package Posnet;

public class Persona {

    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    public Persona(String dni, String nombre, String apellido, String telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
    }
    public String nombreCompleto(){
        return nombre + " " + apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre " + nombre + ", apellido " + apellido + ", telefono " + telefono + ", email " + email;
    }
}
