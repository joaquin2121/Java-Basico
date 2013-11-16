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
        
      Medico  cliente = new Medico(null, null, null, null, null, 
              null, 10, null, null, null, 2, 100);
      
     cliente.generarRceceta(null, null, 2, null, null);
         
     
     Farmacia farmacia = new Farmacia(null, 101010, null, null, 101010, null, null);
     farmacia.solicitarReceta();
     farmacia.ventaMedicamentos();
     
    }
}
