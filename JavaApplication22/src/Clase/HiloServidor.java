package Clase;

import java.io.ObjectInputStream;
import static java.lang.Thread.sleep;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class HiloServidor extends Thread{
    private JTextArea Log;
    private int puerto;

    public HiloServidor() {
    }

    public HiloServidor(JTextArea Log, int puerto) {
        this.Log = Log;
        this.puerto = puerto;
    }

    public JTextArea getLog() {
        return Log;
    }

    public void setLog(JTextArea Log) {
        this.Log = Log;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
    
    public void run(){
        //INSTANCIAMOS NUESTROS SERVERSOCKET
        ServerSocket vSocketServidor;
        this.Log.append("Conectando Con El Proveedor...");

        try {
            sleep(5000);

            //INICIALIZAMOS NUESTRO SERVERSOCKET
            vSocketServidor = new ServerSocket(this.puerto);
            this.Log.append("\nServidor en Proveedor!!!");

            //COMO VEMOS CREAMOS UN BUCLE INFINITO
            //ESTO PARA QUE NUESTRO SERVIDOR ESTE SIEMPRE A LA ESCUCHA DE LOS CLIENTES
            while (true) {

                //CUANDO EL SERVIDOR RECIBE UNA PETICION
                Socket vNuevoSocketCliente;
                //ACEPTA LA PETICION DEL CLIENTE
                vNuevoSocketCliente = vSocketServidor.accept();

                //UNA VEZ ACEPTADA
            
                //PODEMOS RECIBIR INCLUSIVE OBJETOS DE PARTE DEL CLIENTE
                ObjectInputStream vInputObject = new ObjectInputStream(vNuevoSocketCliente.getInputStream());
                //RECORDEMOS QUE DEBEMOS HACER CASTING PARA SABER QUE TIPO DE OBJETO ESTAMOS RECIBIENDO
                Producto sProducto = (Producto) vInputObject.readObject();
                EnviarSolicitud(sProducto);

                //DEBEMOS CERRAR LOS FLUJOS Y LAS CONEXIONES

                vNuevoSocketCliente.close();
                this.Log.append("\nSe ha finalizado la conexion con el Proveedor");

            }
        } catch (Exception ex) {
            this.Log.append("\nHa ocurrido un error durante la incializacion del servidor...");
        }
    }
    
    public void EnviarSolicitud(Producto sProducto){
        try {
            //CREAMOS LA CONEXION CON LA BD
            Connection nuevaConexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost/basedatos", "root", "Steve123.");
            //DEFINIR EL COMANDO CON PARAMETROS
            String comando_Insert = "INSERT INTO PEDIDOS (NombreProducto, CantidadProducto) VALUES(?,?)";
            PreparedStatement nuevoStatamentPreparado = 
                    nuevaConexion.prepareStatement(comando_Insert);
            //DEFINIR LOS PARAMETROS
            nuevoStatamentPreparado.setString(1,sProducto.getNombreProd());
            nuevoStatamentPreparado.setString(2,Integer.toString(sProducto.getCantidad()));
            
            //EJECUTAMOS EL COMANDO
            nuevoStatamentPreparado.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha creado el "
                    + "registro exitosamente");   
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ha ocurrido un error"
                    + " al conectarse a la base de datos. Error " + ex.getMessage());
        }
    }
}