package APP.soc.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {

    private String host;
    private int port;
    private int n1, n2;

    public Cliente(String host, int port, int n1, int n2) {
        this.host = host;
        this.port = port;
        this.n1 = n1;
        this.n2 = n2;
    }

    public void doConectar() {
        try {
            Socket cliente = new Socket(host, port);
// Crear los canales de lectura y escritura
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
// COMUNICACION 1

            String msg = in.readLine();
            System.out.println(msg);
            ServidorHilo ser = new ServidorHilo(cliente, n1, n2);
            
            ser.run();
// COMUNICACION 2
            out.println("CLIENTE: David Rodríguez");

// Cerrar canales
            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }

}
