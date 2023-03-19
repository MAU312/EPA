package Clase;

public class Sucursal {
    private String nombreSuc;
    private String ubicacionSuc;
    private String codigoSuc;
    private Inventario inventarioSuc;

    public Sucursal() {
    }

    public Sucursal(String nombreSuc, String ubicacionSuc, String codigoSuc, Inventario inventarioSuc) {
        this.nombreSuc = nombreSuc;
        this.ubicacionSuc = ubicacionSuc;
        this.codigoSuc = codigoSuc;
        this.inventarioSuc = inventarioSuc;
    }

    public String getNombreSuc() {
        return nombreSuc;
    }

    public void setNombreSuc(String nombreSuc) {
        this.nombreSuc = nombreSuc;
    }

    public String getUbicacionSuc() {
        return ubicacionSuc;
    }

    public void setUbicacionSuc(String ubicacionSuc) {
        this.ubicacionSuc = ubicacionSuc;
    }

    public String getCodigoSuc() {
        return codigoSuc;
    }

    public void setCodigoSuc(String codigoSuc) {
        this.codigoSuc = codigoSuc;
    }

    public Inventario getInventarioSuc() {
        return inventarioSuc;
    }

    public void setInventarioSuc(Inventario inventarioSuc) {
        this.inventarioSuc = inventarioSuc;
    }
    
    
}
