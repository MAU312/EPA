package Clase;

import java.util.Comparator;

public class Venta implements Comparator<Venta>{
    private int idVenta;
    private String sucursal;
    private int numeroVentas;

    public Venta() {
    }

    public Venta(int idVenta, String sucursal, int numeroVentas) {
        this.idVenta = idVenta;
        this.sucursal = sucursal;
        this.numeroVentas = numeroVentas;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }

    public void setNumeroVentas(int numeroVentas) {
        this.numeroVentas = numeroVentas;
    }

    @Override
    public int compare(Venta v1, Venta v2) {
        return v2.getNumeroVentas()- v1.getNumeroVentas();
    }
    
    
   
}
