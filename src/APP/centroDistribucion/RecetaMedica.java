package APP.centroDistribucion;

import java.util.Date;

public class RecetaMedica extends Producto {

    public Date fechaEmicion;
    public String recetaMedica;
    public Date fechaVencimiento;
    public int cantidad;
    public Medico nombreMedico;

    public RecetaMedica(Date fechaEmicion, String recetaMedica, Date fechaVencimiento, int cantidad, Medico nombreMedico, String codigo, String descripcion, int unidadMedida, double precio) {
        super(codigo, descripcion, unidadMedida, precio);
        this.fechaEmicion = fechaEmicion;
        this.recetaMedica = recetaMedica;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
        this.nombreMedico = nombreMedico;
    }

   
    public void generarRceceta(Date fechaEmicion,Date fechaVencimiento,
            int cantidad,String recetaMedica,String nombreMedico){
        System.out.println("receta generada");    
    }

}
