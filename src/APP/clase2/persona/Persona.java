package APP.clase2.persona;

public class Persona {

    public String nombre;
    public String apellidos;
    public int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.printNombreCompleto();
    }

    public Persona() {
    }// constructor

    public String getNombre() {
        return nombre;
    }

    public void setNombreApellidos(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public void setNombreCompleto(String nombre, String apellidos) {
    }

    public void printNombreCompleto() {
        System.out.println(nombre + "" + apellidos);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
