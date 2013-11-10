/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package APP.clase3.interfaces.posicion;

/**
 *
 * @author alumno
 */
public class Auto implements Position {

    private String color;
    private int numeropuerta;
    private double longitud;
    private double latitud;

    public Auto(double longitud, double latitud) {

        this.longitud = longitud;
        this.latitud = latitud;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumeropuerta() {
        return numeropuerta;
    }

    public void setNumeropuerta(int numeropuerta) {
        this.numeropuerta = numeropuerta;
    }

    @Override
    public double getLongitud() {
        return this.longitud;
    }

    @Override
    public double getLatitud() {
        return this.latitud;
    }
}
