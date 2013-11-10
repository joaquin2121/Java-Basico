package APP.clase3.interfaces.posicion;

public class Teodolito {

    public static void main(String[] args) {
        Position carro = new Auto(20, 30);
        Position persona = new Persona(50, 20);
  
        getDistancia(carro,persona);
    }

    public static  void getDistancia(Position p1, Position p2) {

        //  double resultado = p2.getLongitud() - p1.getLatitud();
        double d1 = p1.getLatitud() - p2.getLongitud();
        double d2 = p1.getLongitud() - p2.getLongitud();
        System.out.println("Distancia1  : " + Math.sqrt(d1 * d1 + d2 * d2));
        System.out.println("Distancia2  : " +Math.floor(Math.sqrt(d1 * d1 + d2 * d2)) );
    }
}
