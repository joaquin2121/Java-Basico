/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase4.practica;

/**
 *
 * @author alumno
 */
public class ObjetoGranja {
    public static void main(String[] args) {
        
        Caballo rojo =new Caballo(180, null, null, null, null);
        rojo.tomarDietaDesayuno();
        rojo.setCodigo("T0001");
        rojo.setNombre("Torpedo");
        System.out.println("codigo :"+ rojo.getCodigo()+"\nnombre :"+rojo.getNombre());
        System.out.println(rojo.tomarDietaDesayuno());
    }
    
}
