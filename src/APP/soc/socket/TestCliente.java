package APP.soc.socket;

public class TestCliente {

    public static void main(String[] args) {
        TestCliente.Testcliente();

    }

    public static void Testcliente() {

        Cliente c2 = new Cliente("localhost", 999,100,100);
       c2.doConectar();
    }
}
