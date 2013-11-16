/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase4.practica;

public abstract class Animal {

    private String codigo;
    private String nombre;

    public Animal(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public abstract  String tomarDietaDesayuno();

    public abstract void tomarDietaAlmuerzo();

    public abstract void tomarDietaCena();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
