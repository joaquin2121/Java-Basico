
package APP.clase3.excepcion;

public class Cajero {
    public static void main(String[] args) {
        
        try {
             Cuenta jose = new Cuenta("jose", 5000);
              System.out.println(""+jose.retirarCajero(3000));
            System.out.println(""+jose.retirarCajero(4000));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       
       
    }
    
    
}
