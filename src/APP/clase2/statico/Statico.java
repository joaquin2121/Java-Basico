/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase2.statico;

/**
 *
 * @author alumno
 */
public class Statico {

    static int contador;

    public Statico() {
        ++contador;
    }

    public static double dolaraEuro(double a) {
        double euro = a * 0.81559;
        return euro;
    }
}
