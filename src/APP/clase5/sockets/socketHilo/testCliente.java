
package APP.clase5.sockets.socketHilo;


public class testCliente {

    public static void main(String[] args) {
        testCliente.Testcliente();

    }

    public static void Testcliente() {
        Cliente c = new Cliente("localhost", 9999);

        c.doConectar();
    }
}
