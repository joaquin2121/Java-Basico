/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase2.Animal;

/**
 *
 * @author alumno
 */
public class Tigre extends Animal{
    
    public Tigre(String nombre, int edad){
    this.setNomnre(nombre);
    this.setEdad(edad);
    }

    @Override // alt + insert =Override
    public void hacerRuido() {
        System.out.println("grrrrrrr");
    }
    public void hacerRuido(Boolean molestar) {
        System.out.println("grita");
    }

    @Override
    public void comer() {
        System.out.println("carne");
    }
    
}
