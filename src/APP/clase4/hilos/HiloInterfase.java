/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase4.hilos;

/**
 *
 * @author alumno
 */
public class HiloInterfase implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

    }
}
