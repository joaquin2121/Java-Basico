
package APP.clase4.practica;

import java.util.Date;

public class Caballo extends Animal{
public double peso;
Date fechanacimiento;
public String observaciones;

    public Caballo(double peso, Date fechanacimiento, String observaciones, String codigo, String nombre) {
        super(codigo, nombre);
        this.peso = peso;
        this.fechanacimiento = fechanacimiento;
        this.observaciones = observaciones;
    }
    
    
    @Override
    public String tomarDietaDesayuno() {
        
        return "la dieta del desayuno para el caballo";
    }

    @Override
    public void tomarDietaAlmuerzo() {
    }

    @Override
    public void tomarDietaCena() {
    }

}
