package APP.clase4.practica;

public class Nutrientes implements TipoAlimentos {

    public String calcio;
    public String glucosa;
    public String magnesio;
    public String lactosa;
    public String rivoflavina;
    public double unidamedida;
    public String estadosolido;
    public String estadoliquido;
    public String nombreAlimento;
    public String tipoAlimento;
    public String unidadMedida;
    public double costoporunidadmedida;
    public int valorNutricional;

    public Nutrientes(String calcio, String glucosa, String magnesio, String lactosa, String rivoflavina,
            double unidamedida, String estadosolido, String estadoliquido, String nombreAlimento,
            String tipoAlimento, String unidadMedida, double costoporunidadmedida, int valorNutricional) {
        this.calcio = calcio;
        this.glucosa = glucosa;
        this.magnesio = magnesio;
        this.lactosa = lactosa;
        this.rivoflavina = rivoflavina;
        this.unidamedida = unidamedida;
        this.estadosolido = estadosolido;
        this.estadoliquido = estadoliquido;
        this.nombreAlimento = nombreAlimento;
        this.tipoAlimento = tipoAlimento;
        this.unidadMedida = unidadMedida;
        this.costoporunidadmedida = costoporunidadmedida;
        this.valorNutricional = valorNutricional;
    }

    @Override
    public String conseguirNutrientes() {
               return "Nutrientes generados";
    
    }

    public String getCalcio() {
        return calcio;
    }

    public void setCalcio(String calcio) {
        this.calcio = calcio;
    }

    public String getGlucosa() {
        return glucosa;
    }

    public void setGlucosa(String glucosa) {
        this.glucosa = glucosa;
    }

    public String getMagnesio() {
        return magnesio;
    }

    public void setMagnesio(String magnesio) {
        this.magnesio = magnesio;
    }

    public String getLactosa() {
        return lactosa;
    }

    public void setLactosa(String lactosa) {
        this.lactosa = lactosa;
    }

    public String getRivoflavina() {
        return rivoflavina;
    }

    public void setRivoflavina(String rivoflavina) {
        this.rivoflavina = rivoflavina;
    }

    public double getUnidamedida() {
        return unidamedida;
    }

    public void setUnidamedida(double unidamedida) {
        this.unidamedida = unidamedida;
    }

    public String getEstadosolido() {
        return estadosolido;
    }

    public void setEstadosolido(String estadosolido) {
        this.estadosolido = estadosolido;
    }

    public String getEstadoliquido() {
        return estadoliquido;
    }

    public void setEstadoliquido(String estadoliquido) {
        this.estadoliquido = estadoliquido;
    }

    public String getNombreAlimento() {
        return nombreAlimento;
    }

    public void setNombreAlimento(String nombreAlimento) {
        this.nombreAlimento = nombreAlimento;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getCostoporunidadmedida() {
        return costoporunidadmedida;
    }

    public void setCostoporunidadmedida(double costoporunidadmedida) {
        this.costoporunidadmedida = costoporunidadmedida;
    }

    public int getValorNutricional() {
        return valorNutricional;
    }

    public void setValorNutricional(int valorNutricional) {
        this.valorNutricional = valorNutricional;
    }

   
}
