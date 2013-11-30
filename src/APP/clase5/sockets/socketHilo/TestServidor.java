package APP.clase5.sockets.socketHilo;

public class TestServidor {

    public static void main(String[] args) {
        TestServidor.Testserver();

    }

    public static void Testserver() {
        Servidor s = new Servidor(9999);
        
        s.ejecutar();
    }

    
}
