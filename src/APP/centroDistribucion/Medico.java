package APP.centroDistribucion;

import java.util.Date;

public class Medico extends RecetaMedica {

    public String nombre;
    public String nroLicencia;
    public String añograduacion;

    public Medico(String nombre, String nroLicencia, String añograduacion, Date fechaEmicion, String recetaMedica, Date fechaVencimiento, int cantidad, String nombreMedico, String codigo, String descripcion, int unidadMedida, double precio) {
        super(fechaEmicion, recetaMedica, fechaVencimiento, cantidad, nombreMedico, codigo, descripcion, unidadMedida, precio);
        this.nombre = nombre;
        this.nroLicencia = nroLicencia;
        this.añograduacion = añograduacion;
    }

    public void recetar() {
        generarRceceta(fechaEmicion, fechaVencimiento,
                cantidad, recetaMedica, nombreMedico);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroLicencia() {
        return nroLicencia;
    }

    public void setNroLicencia(String nroLicencia) {
        this.nroLicencia = nroLicencia;
    }

    public String getAñograduacion() {
        return añograduacion;
    }

    public void setAñograduacion(String añograduacion) {
        this.añograduacion = añograduacion;
    }

    public Date getFechaEmicion() {
        return fechaEmicion;
    }

    public void setFechaEmicion(Date fechaEmicion) {
        this.fechaEmicion = fechaEmicion;
    }

    public String getRecetaMedica() {
        return recetaMedica;
    }

    public void setRecetaMedica(String recetaMedica) {
        this.recetaMedica = recetaMedica;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }
    
    

}
