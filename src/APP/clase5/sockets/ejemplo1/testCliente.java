
package APP.clase5.sockets.ejemplo1;

public class testCliente {

    public static void main(String[] args) {
        testCliente.Testcliente();

    }

    public static void Testcliente() {
        Cliente c = new Cliente("localhost", 99);

        c.doConectar();
    }
}
