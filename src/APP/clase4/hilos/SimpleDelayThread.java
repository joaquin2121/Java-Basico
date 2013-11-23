/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase4.hilos;

/**
 *
 * @author alumno
 */
public class SimpleDelayThread extends Thread {

    @Override
    public void run() {
        int i;
        for (i = 1; i <= 10; i++) {
            try {
                // 1000 ms
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }

    }
}
