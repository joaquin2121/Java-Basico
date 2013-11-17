package APP.centroDistribucion;

import java.util.Date;

public class Cliente {

    private int dni;
    private String nombre;
    private int telefono;
    private String direccion;
    private String distrito;
    
   

    public Cliente(int dni, String nombre, int telefono, String direccion, String distrito) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.distrito = distrito;
    }

     public static void main(String[] args) {
        
          
     
     Farmacia farmacia = new Farmacia();
     farmacia.solicitarReceta();
     farmacia.ventaMedicamentos();
     
    }
}
