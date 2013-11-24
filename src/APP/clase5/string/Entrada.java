package APP.clase5.string;

public class Entrada {
    
    public static void main(String[] args) {
        Entrada.Entradas();
    }
    
    public static  void Entradas() {
        EntradaSalida entra= new EntradaSalida();
        entra.verificarArchivo();
        entra.listarDirectorio();
        entra.CreateDirectorio();
    }
}
