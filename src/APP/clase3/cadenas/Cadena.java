package APP.clase3.cadenas;

public class Cadena {

    public static void main(String[] args) {
        Cadena.concatenar();
        Cadena.extraccion();
        Cadena.extraccion();
        Cadena.extraccion2();
        Cadena.remplaso();
        Cadena.metodosString();
        Cadena.buffer1();
        Cadena.buffer2();
    }

    public static void buffer2() {
        StringBuffer sb = new StringBuffer("Java Basico Tecsup Lima");
        sb.insert(11, " en");// agrega EN posision  11
        sb.delete(21, sb.length());// leimina pose 21
        System.out.println(sb);


    }

    public static void buffer1() {
        StringBuffer bufffer = new StringBuffer("Tecsup");
        bufffer.append(" - ");
        bufffer.append("java");// agregar al final cadenas

        bufffer.insert(0, "instituto");
        bufffer.delete(bufffer.indexOf("java"), bufffer.length());

        System.out.println(bufffer);
        System.out.println(bufffer.reverse());
    }

    public static void metodosString() {
        String jose = "  j   ose    luis eusebio     ";
        System.out.println("" + jose.toUpperCase());
        System.out.println("" + jose.length());
        System.out.println("" + jose.trim());
    }

    public static void remplaso() {

        String palabras = "los angeles java de synfhony php";
        palabras = palabras.replace("java", "php");
        System.out.println("" + palabras);
    }

    public static void extraccion2() {

        String texto = "Tecsup";
        System.out.println("" + texto.substring(1, 3));
        System.out.println("" + texto.substring(1));
    }

    public static void extraccion() {

        String texto = "Tecsup";
        System.out.println("Número de Caracteres: " + texto.length() + "\n");
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.substring(i, i + 1) + "\n");//
        }
    }

    public static void concatenar() {
        String nombre = "James";
        String apellido = "Gosling";
        if (nombre.equals("James")) {
            System.out.println(nombre + " " + apellido);
        }
        String completo = nombre.concat(" " + apellido);
        if (nombre.equals("James")) {
            System.out.println(completo);
        }

    }
}
