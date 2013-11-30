package APP.soc.socket;

public class TestServidor {

    public static void main(String[] args) {
        TestServidor.Testserver();

    }

    public static void Testserver() {
        Servidor2 s2 = new Servidor2(999);
        
        s2.ejecutar();

    }

}
