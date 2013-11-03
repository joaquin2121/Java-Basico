package APP.clase2.Bicicleta;

public class AppBicicleta {

    public static void main(String[] args) {// se ejecuta cuando se ejecute una clase
        Bicicleta bicicleta = new Bicicleta();
        bicicleta.setMarca("monark");
        bicicleta.setModelo("123");
        bicicleta.cambiarLlantas();
        System.out.println(bicicleta.getMarca());
    }
}
