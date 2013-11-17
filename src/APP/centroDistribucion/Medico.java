package APP.centroDistribucion;

import java.util.Date;

public class Medico  {

    public String nombre;
    public String nroLicencia;
    public String añograduacion;

    public Medico(String nombre, String nroLicencia, String añograduacion) {
        this.nombre = nombre;
        this.nroLicencia = nroLicencia;
        this.añograduacion = añograduacion;
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

    
    

}
