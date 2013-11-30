/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase5.sockets.socketHilo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Cliente {

    private String host;
    private int port;

    public Cliente(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void doConectar() {
        try {
            Socket cliente = new Socket(host, port);
            BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter out = new PrintWriter(cliente.getOutputStream(), true);

            String msg = in.readLine();
            System.out.println(msg);
            
            out.println("HOLAAA");
            out.println("r");
            out.println(20);
            out.println(10);
            
            msg = in.readLine();
            System.out.println(msg);

            msg = in.readLine();
            System.out.println(msg);

            in.close();
            out.close();
            cliente.close();
        } catch (Exception e) {
            System.out.println("Error Cliente : " + e.getMessage());
        }
    }
}