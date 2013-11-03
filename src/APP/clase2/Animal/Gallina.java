package APP.clase2.Animal;

public class Gallina extends Animal {

    public Gallina(String nombre, int edad) {
        this.setNomnre(nombre);
        this.setEdad(edad);
    }

    @Override // alt + insert =Override
    public void hacerRuido() {
        System.out.println("cococococococo");
    }

    @Override
    public void comer() {
        System.out.println("maiz");
    }
}
