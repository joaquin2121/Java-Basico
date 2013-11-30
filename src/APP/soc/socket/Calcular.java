/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.soc.socket;

/**
 *
 * @author JOAQUIN
 */
public class Calcular implements Calculadora {

    public int numero1, numero2;
    private int resultado;

    public Calcular(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
       @Override
    public int Sumar() {
        return (this.numero1 + this.numero2);
    }

    @Override
    public int Restar() {
        return (this.numero1 - this.numero2);
    }

    @Override
    public int Multiplicar() {
        return  (this.numero1 * this.numero2);
    }

    
}
