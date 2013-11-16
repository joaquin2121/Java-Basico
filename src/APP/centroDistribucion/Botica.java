package APP.centroDistribucion;

public class Botica extends CentroDistribucion {

    public Botica(String codigo, int ruc, String razonSocial,
            String direccion, int telefono, String horaAbierto) {
        super(codigo, ruc, razonSocial, direccion, telefono, horaAbierto);

    }

    @Override
    public void ventaProductos() {
        System.out.println("estoy en botica");

    }

}
