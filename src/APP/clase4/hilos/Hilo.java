package APP.clase4.hilos;

public class Hilo {

    public static void main(String[] args) {
        //Hilos.hiloHerencia();
        //Hilo.hilointerfase();
        // Hilo.SimpleDelayThread();
        //Hilo.SimpleDelayThread2();
        // Hilo.Prioridad();
        // Hilo.ProcesosHilos();

        Hilo.Memoria();
    }

    public static void hiloHerencia() {
        HiloHerencia hilo = new HiloHerencia();
        hilo.start();

    }

    public static void hilointerfase() {
        HiloInterfase hilo = new HiloInterfase();
        Thread runner = new Thread(hilo);
        runner.start();

    }

    public static void SimpleDelayThread() {
        SimpleDelayThread simple = new SimpleDelayThread();
        simple.start();
    }

    public static void SimpleDelayThread2() {
        long delay1 = (long) (Math.random() * 2000);
        long delay2 = (long) (Math.random() * 2000);
        long delay3 = (long) (Math.random() * 2000);
        Simple2DelayThread thread1 = new Simple2DelayThread("thread1", delay1);
        Simple2DelayThread thread2 = new Simple2DelayThread("thread2", delay2);
        Simple2DelayThread thread3 = new Simple2DelayThread("thread3", delay3);
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static void Prioridad() {
        Simple2DelayThread luis = new Simple2DelayThread("Jose", 0);
        Simple2DelayThread jose = new Simple2DelayThread("Luis", 0);
// Modificando las prioridades
        luis.setPriority(Thread.MIN_PRIORITY);
        jose.setPriority(Thread.MAX_PRIORITY);
        luis.start();
        jose.start();
    }

    public static void ProcesosHilos() {
        ProcesosHilos pro = new ProcesosHilos();
        pro.start();
    }

    public static void Memoria() {
        Memoria memo = new Memoria();
        memo.start();



    }
}
