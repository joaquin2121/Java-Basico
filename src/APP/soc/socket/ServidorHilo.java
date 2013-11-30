package APP.soc.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServidorHilo extends Thread {

    private Socket cliente;
    private int n1, n2;

    public ServidorHilo(Socket cliente, int n1, int n2) {
        this.cliente = cliente;
        this.n1 = n1;
        this.n2 = n2;
    }

    public void run() {
        try {
            // Crear los canales de lectura y escritura
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    cliente.getInputStream()));

            // COMUNICACION 1
            out.println("SERVIDOR: Bienvenido, ¿Cómo te llamas? ");

            // COMUNICACION 2
            String resp2 = in.readLine();

            Calculadora calcula = new Calcular(n1, n2);
            System.out.println(resp2);
            System.out.println("suma : " + calcula.Sumar());

            /* Cerramos el canal */
            in.close();
            out.close();
            cliente.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (cliente != null) {
                    cliente.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
