package APP.centroDistribucion;

public class Farmacia {

    public String codigo;
    public int ruc;
    public String razonSocial;
    public String direccion;
    public int telefono;
    public String horaAbierto;
    public String horaCerrado;

    public Farmacia(String codigo, int ruc, String razonSocial, String direccion, int telefono, String horaAbierto, String horaCerrado) {
        this.codigo = codigo;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horaAbierto = horaAbierto;
        this.horaCerrado = horaCerrado;
    }
    
    public void ventaMedicamentos(){
       
    }
     public void solicitarReceta(){
    System.out.println("receta solicitada : ");
    
    }

}
