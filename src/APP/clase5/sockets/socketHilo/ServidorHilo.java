package APP.clase5.sockets.socketHilo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServidorHilo extends Thread {

    private Socket cliente;

    public ServidorHilo(Socket cliente) {
        this.cliente = cliente;
    }

    public void run() {
        try {
// Crear los canales de lectura y escritura
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    cliente.getInputStream()));

            calculadora(out, in);

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

    public void calculadora(PrintWriter out, BufferedReader in) throws IOException {
        
        out.println("\"SERVIDOR: Bienvenido, ¿Cómo te llamas? \"");

        String nombre = in.readLine();
        System.out.println(nombre);
        
        String operacion = in.readLine();
        System.out.println(operacion);
        
        Double operador1, operador2;
        operador1 = Double.parseDouble(in.readLine());
        operador2 = Double.parseDouble(in.readLine());
        System.out.println(operador1 + " "+operador2);
        
        if (operacion.equals("s")) {
            out.println("servidor multiplicacion");
            out.println(operador1 + operador2);
            
        } else if (operacion.equals("r")) {
            out.println("servidor resta");
            out.println(operador1 - operador2);
            
        } else if (operacion.equals("m")) {
            out.println("servidor multiplicacion");
            out.println(operador1 * operador2);
            
        } else {
            System.out.println("no existe");
        }

    }
}
