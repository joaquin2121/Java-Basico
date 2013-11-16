package APP.centroDistribucion;

public abstract class CentroDistribucion {

    private String codigo;
    private int ruc;
    private String razonSocial;
    private String direccion;
    private int telefono;
    private String horaAbierto;
    private String horaCerrado;

    public CentroDistribucion(String codigo, int ruc, String razonSocial,
            String direccion, int telefono, String horaAbierto) {
        this.codigo = codigo;
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horaAbierto = horaAbierto;
    }

    public abstract void ventaProductos();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getRuc() {
        return ruc;
    }

    public void setRuc(int ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getHoraAbierto() {
        return horaAbierto;
    }

    public void setHoraAbierto(String horaAbierto) {
        this.horaAbierto = horaAbierto;
    }

    public String getHoraCerrado() {
        return horaCerrado;
    }

    public void setHoraCerrado(String horaCerrado) {
        this.horaCerrado = horaCerrado;
    }

}
