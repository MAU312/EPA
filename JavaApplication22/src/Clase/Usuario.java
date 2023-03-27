package Clase;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario implements Serializable, Comparable<Usuario> {
   private String nombreU;
   private String usuario;
   private String passwordU;
   private String correoU;
   

    public Usuario() {
    }

    public Usuario(String nombreU, String usuario, String passwordU, String correoU) {
        this.nombreU = nombreU;
        this.usuario = usuario;
        this.passwordU = passwordU;
        this.correoU = correoU;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPasswordU() {
        return passwordU;
    }

    public void setPasswordU(String passwordU) {
        this.passwordU = passwordU;
    }

    public String getCorreoU() {
        return correoU;
    }

    public void setCorreoU(String correoU) {
        this.correoU = correoU;
    }

    @Override
    public int compareTo(Usuario o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
   
}
