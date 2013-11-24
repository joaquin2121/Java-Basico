package APP.clase4.hilos;

public class Memoria extends Thread {

    long mem0 = Runtime.getRuntime().totalMemory();
    long mem1 = Runtime.getRuntime().freeMemory();
    long mem2 = Runtime.getRuntime().availableProcessors();
    long mem3 = Runtime.getRuntime().maxMemory();

    @Override
    public void run() {


        try {
            System.out.println("totalMemory" + mem0);
            System.out.println("freeMemory" + mem1);
            System.out.println("Processors" + mem2);
            System.out.println("maxMemory" + mem3);

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
