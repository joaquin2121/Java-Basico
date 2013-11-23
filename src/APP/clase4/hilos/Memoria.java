/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase4.hilos;

/**
 *
 * @author alumno
 */
public class Memoria extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {
            try {
                long mem0 = Runtime.getRuntime().totalMemory();
                long mem1 = Runtime.getRuntime().freeMemory();
                long mem2 = Runtime.getRuntime().availableProcessors();
                long mem3 = Runtime.getRuntime().maxMemory();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }
}
