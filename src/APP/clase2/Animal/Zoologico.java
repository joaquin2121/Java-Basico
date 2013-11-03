/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase2.Animal;

/**
 *
 * @author alumno
 */
public class Zoologico {

    public static void main(String[] args) {
        Tigre diego = new Tigre("diego", 24);
        diego.hacerRuido();
        diego.comer();
        diego.hacerRuido(true); // con parametro


        Gallina gallina = new Gallina("diego", 24);
        gallina.hacerRuido();
        gallina.comer();

        Vicuña vicuña = new Vicuña("vicu", 35);
        vicuña.hacerRuido();
        vicuña.comer();

    }
}
