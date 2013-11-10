/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase3.objeto;

/**
 *
 * @author alumno
 */
public class Socio {

    private int codigo;
    private String nombre;
    private String direccion;

    public Socio(int codigo) {
        this.codigo = codigo;
         this.nombre = nombre;
          this.codigo = codigo;
        
    }

    Socio(int i, String david, String tecsup) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String cadena = "Codigo : " + this.codigo;
        cadena += "nombre: " + this.nombre;
        cadena += "direccion: " + this.direccion;
        return cadena;
    }

    public boolean equals(Object o) {
        Socio s = (Socio) o;
        if (this.codigo == s.codigo
                && this.nombre.equals(s.nombre)
                && this.direccion.equals(s.direccion)) {
            return true;
        } else {
            return false;
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
