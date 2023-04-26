package Clase;

public class Sucursal {
    private String nombreSuc;
    private String ubicacionSuc;
    private String codigoSuc;
    private int venta;

    public Sucursal() {
    }

    public Sucursal(String nombreSuc, String ubicacionSuc, String codigoSuc, int venta) {
        this.nombreSuc = nombreSuc;
        this.ubicacionSuc = ubicacionSuc;
        this.codigoSuc = codigoSuc;
        this.venta = venta;
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

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }
    
   
}
