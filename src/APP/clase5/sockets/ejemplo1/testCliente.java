/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase5.sockets.ejemplo1;

/**
 *
 * @author alumno
 */
public class testCliente {

    public static void main(String[] args) {
        testCliente.Testcliente();

    }

    public static void Testcliente() {
        Cliente c = new Cliente("localhost", 99);

        c.doConectar();
    }
}
