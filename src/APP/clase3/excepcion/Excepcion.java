package APP.clase3.excepcion;

public class Excepcion {

    public static void main(String[] args) {
        // Excepcion.tesexcepcion();
        Excepcion.tesexcepcion3();
    }

    public static void tesexcepcion3() {

        try {
            //int[] numeros = null;
                 int[] numeros = {1,2,3,4,5,6,7,8,9,10,11};
            for (int i = 1; i < 11; i++) {
                int j = numeros[i];
                System.out.println(""+numeros[i]);
            }
        } catch (NullPointerException e) {
            System.out.println("este es un array nulo");
            e.printStackTrace();/* imprime la traza del error */
        }finally{
                System.out.println("aplicacion terminada");
        }
    }

    public static void tesexcepcion2() {

        try {
            /* dividiendo or cero */
            int dividendo = 10, divisor = 0, resultado;

            resultado = dividendo / divisor;

            /* error del array */

            int[] array = new int[2];
            array[10] = 100;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("un error del Arrays");
        } catch (ArithmeticException e) {
            System.out.println("un error Matematico");
        } finally {
            System.out.println("fin de programa");
        }

    }

    public static void tesexcepcion() {
        try {

            int dividendo = 10, divisor = 0, resultado;

            resultado = dividendo / divisor;

        } catch (Exception e) {
            System.out.println("un error" + e.getMessage());
        }

    }
}
