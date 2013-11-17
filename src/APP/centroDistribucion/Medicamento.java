package APP.centroDistribucion;

public class Medicamento extends Producto {

    public String posologia;
    public String contradicciones;

    public Medicamento(String posologia, String contradicciones,
            String codigo, String descripcion, int unidadMedida, double precio) {
        super(codigo, descripcion, unidadMedida, precio);
        this.posologia = posologia;
        this.contradicciones = contradicciones;
    }
    public void mostrarContradicciones(){
    
    
    }
     public void mostrarPosologia(){
    
    
    }
    

}
