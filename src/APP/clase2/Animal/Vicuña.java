/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase2.Animal;

/**
 *
 * @author alumno
 */
public class Vicuña extends Animal{
     public Vicuña(String nombre, int edad){
    this.setNomnre(nombre);
    this.setEdad(edad);
    }
    
    

    @Override
    public void hacerRuido() {
       System.out.println("vivivivivi");
    }

    @Override
    public void comer() {
       System.out.println("pasto");
    }
    
}
