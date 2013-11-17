package APP.clase3.excepcion;

public class Saldoinsuficienteexception extends Excepcion {
    
  public double saldo, cuantoDesea;

    public Saldoinsuficienteexception(double saldo, double cuantoDesea) {
        
        this.saldo = saldo;
        this.cuantoDesea = cuantoDesea;
    }

    

}
