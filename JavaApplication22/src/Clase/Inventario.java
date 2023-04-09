package Clase;

import java.util.ArrayList;

public class Inventario {
    
    private ArrayList<Producto>vListaProductos = new ArrayList<Producto>();
    
    public Inventario() {
    }
    
    public ArrayList<Producto> getvListaProductos() {
        return vListaProductos;
    }

    public void setvListaProductos(ArrayList<Producto> vListaProductos) {
        this.vListaProductos = vListaProductos;
    }
    
    
            
}
