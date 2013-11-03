package APP.clase2.Animal;

public abstract class Animal {// interezante de abstrac implementa metodo o crea metodos 

    private String nomnre;
    private String color;
    private double peso;
    private int edad;

    public abstract void hacerRuido();

    public abstract void comer();

    public void setNomnre(String nomnre) {
        this.nomnre = nomnre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
