package APP.clase5.sockets.socketHilo;

import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private int port; /* el servidor recibe un puerto*/

    public Servidor(int port) {
        this.port = port;
    }

    public void ejecutar() {
        try {
// Creamos un servidor de Socket
            ServerSocket server = new ServerSocket(port);
            System.out.println("SERV HILO INICIADO...");
            while (true) {
                System.out.println("Esperando ...");
                Socket cliente = server.accept();
                ServidorHilo ts = new ServidorHilo(cliente);
                ts.start();
            }
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
