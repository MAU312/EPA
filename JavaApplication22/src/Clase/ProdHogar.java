package Clase;

public class ProdHogar extends Producto{
    private String sector;
    private double tamaño;

    public ProdHogar() {
    }

    public ProdHogar(String sector, double tamaño) {
        this.sector = sector;
        this.tamaño = tamaño;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
