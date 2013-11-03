package APP.clase2.persona;

public class AppPersona {

    public static void main(String[] args) {
        /* Persona jose = new Persona("jose", "Peso", 25);
         System.out.println("atributo del objeto");
         System.out.println("Nombres : " + jose.getNombre());
         System.out.println("Apellidos : " + jose.getApellidos());
         System.out.println("Edad : " + jose.getEdad()); */


        Persona luis = new Persona();

        luis.setNombre("luis");
        luis.setApellidos("lora");
        luis.setEdad(30);

        Persona carlos = new Persona();
        carlos.setNombre("luis");
        carlos.setApellidos("lora");
        carlos.printNombreCompleto();
    }
}
