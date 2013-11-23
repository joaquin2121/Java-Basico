package APP.clase4.hilos;

public class Simple2DelayThread extends Thread {

    public String name = null;
    public long delay = 0;

    public Simple2DelayThread(String name, long delay) {
        this.name = name;
        this.delay = delay;
    }

    @Override
    public void run() {
for( int i=1;i<=3;i++){

  System.out.println("name : " + name + " | delay : " + delay);

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            System.out.println("error : " + e.getMessage());

        }

      }
    }
}
