
package APP.clase5.sockets.ejemplo1;

public class testCliente {

    public static void main(String[] args) {
        testCliente.Testcliente();

    }

    public static void Testcliente() {
        ClienteEjemplo1 c = new ClienteEjemplo1("localhost", 99);

        c.doConectar();
    }
}
