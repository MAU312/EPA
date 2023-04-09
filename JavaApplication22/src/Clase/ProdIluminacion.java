package Clase;

public class ProdIluminacion extends Producto {
    private String tipoLuz;
    private String voltaje;

    public ProdIluminacion() {
    }

    public ProdIluminacion(String tipoLuz, String voltaje) {
        this.tipoLuz = tipoLuz;
        this.voltaje = voltaje;
    }

    public String getTipoLuz() {
        return tipoLuz;
    }

    public void setTipoLuz(String tipoLuz) {
        this.tipoLuz = tipoLuz;
    }

    public String getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(String voltaje) {
        this.voltaje = voltaje;
    }
    
    
}
