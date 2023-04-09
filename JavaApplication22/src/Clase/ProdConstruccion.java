package Clase;

public class ProdConstruccion extends Producto{
    private String tipoMaterial;
    private double peso;

    public ProdConstruccion() {
    }

    public ProdConstruccion(String tipoMaterial, double peso) {
        this.tipoMaterial = tipoMaterial;
        this.peso = peso;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
