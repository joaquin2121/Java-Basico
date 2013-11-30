package APP.soc.socket;

import java.net.ServerSocket;
import java.net.Socket;

public class Servidor2 {

    private int port,n1,n2;

    public Servidor2(int port) {
        this.port = port;

    }
    public void ejecutar() {

        try {
            // Creamos un servidor de Socket
            ServerSocket server = new ServerSocket(port);

            System.out.println("Servidor iniciado...");

            while (true) {
                System.out.println("Esperando ...");
                Socket cliente = server.accept();

                ServidorHilo ts = new ServidorHilo(cliente, n1, n2);

                ts.start();

            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }

}
