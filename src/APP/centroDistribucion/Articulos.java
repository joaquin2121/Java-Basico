package APP.centroDistribucion;

public class Articulos extends Producto{

    public double descuento;

     public Articulos(double descuento, String codigo, String descripcion, int unidadMedida, double precio) {
        super(codigo, descripcion, unidadMedida, precio);
        this.descuento = descuento;
    }
public double calcularDescuento(double descuento){
descuento=10;

return descuento;
}
    
}
