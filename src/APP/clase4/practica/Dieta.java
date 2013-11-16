package APP.clase4.practica;

import java.util.Date;

public class Dieta extends Animal {

    public String tomaUno;
    public String tomaDos;
    public String tomaTres;
    Date hora;

    public Dieta(String tomaUno, String tomaDos, String tomaTres, Date hora, String codigo, String nombre) {
        super(codigo, nombre);
        this.tomaUno = tomaUno;
        this.tomaDos = tomaDos;
        this.tomaTres = tomaTres;
        this.hora = hora;

    }

    @Override
    public String tomarDietaDesayuno() {
        Nutrientes nutriente = new Nutrientes(tomaUno, tomaDos, tomaUno,
                tomaDos, tomaUno, 10, tomaUno, tomaUno, tomaUno, tomaUno, tomaTres, 10, 10);
       
return nutriente.conseguirNutrientes();
    }

    @Override
    public void tomarDietaAlmuerzo() {
    }

    @Override
    public void tomarDietaCena() {
    }
}
