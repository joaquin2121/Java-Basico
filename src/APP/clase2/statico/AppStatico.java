package APP.clase2.statico;

public class AppStatico {

    public static void main(String[] args) {
        AppStatico.runAtributoEstatico();//ejecuta el atributo
        AppStatico.runMetodoEstatico();//ejecuta el metodo
    }

    public static void runMetodoEstatico() {
        double euro = Statico.dolaraEuro(10d);
        System.out.println(euro);
        System.out.println(Statico.contador);
    }

    public static void runAtributoEstatico() {
        Statico estaUn = new Statico();
        Statico estaDo = new Statico();
        Statico estaTre = new Statico();
        System.out.println(Statico.contador);
    }
}
