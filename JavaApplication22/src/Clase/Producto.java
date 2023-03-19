package Clase;

public class Producto {
    private String nombreProd;
    private String codigoProd;
    private int cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(String nombreProd, String codigoProd, int cantidad, double precio) {
        this.nombreProd = nombreProd;
        this.codigoProd = codigoProd;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public String getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(String codigoProd) {
        this.codigoProd = codigoProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
