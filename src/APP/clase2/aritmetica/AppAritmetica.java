/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase2.aritmetica;

/**
 *
 * @author alumno
 */
public class AppAritmetica {

    public static void main(String[] args) {
        OperacionesAritmeticas operaciones = new OperacionesAritmeticas();
        double suma = operaciones.sumar(10d, 20d);
        System.out.println(suma);

        int mayor = operaciones.getmax(10, 11);
        System.out.println(mayor);

        float mayorFloat = operaciones.getmax(10f, 50f);
        System.out.println(mayorFloat);
    }
}
