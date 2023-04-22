
package Clase;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String id;
    private String telefono;
    private String direccion;
    private ArrayList<Producto> pedido;

    public Cliente() {
    }

    public Cliente(String nombre, String id, String telefono, String direccion, ArrayList<Producto> pedido) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
        this.direccion = direccion;
        this.pedido = pedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Producto> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Producto> pedido) {
        this.pedido = pedido;
    }
    
    
}
