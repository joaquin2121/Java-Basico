package APP.clase5.sockets.ejemplo1;

public class TestServidor {

    public static void main(String[] args) {
        TestServidor.Testserver();

    }

    public static void Testserver() {
        Servidor s = new Servidor(99);
        
        s.ejecutar();
    }

    
}
