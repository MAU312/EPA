
package Clase;

import java.io.Serializable;
import java.util.ArrayList;

public class ListaUsuarios implements Serializable {
    ArrayList<Usuario> ListaDeUsuarios;

    public ListaUsuarios() {
    }

    public ListaUsuarios(ArrayList<Usuario> ListaDeUsuarios) {
        this.ListaDeUsuarios = ListaDeUsuarios;
    }

    public ArrayList<Usuario> getListaDeUsuarios() {
        return ListaDeUsuarios;
    }

    public void setListaDeUsuarios(ArrayList<Usuario> ListaDeUsuarios) {
        this.ListaDeUsuarios = ListaDeUsuarios;
    }
    
}

