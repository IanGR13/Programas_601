
package clases;

import java.io.*;
import java.net.Socket;

public class cliente implements Runnable{

     //Creamos los atriburtos de puerto y mensaje
    private int puerto;
    private String mensaje;

    public cliente(int puerto, String mensaje) {
        this.puerto = puerto;
        this.mensaje = mensaje;
    }
    
    
    
    
    @Override
    public void run() {
        //Host del servidor
        final String HOST = "127.0.0.1";
        
        //Puerto del servidor
        DataOutputStream salida;
        
        try{
            Socket socket = new Socket(HOST, puerto);
            salida = new DataOutputStream(socket.getOutputStream());
            
            //enviamos el mensaje
            salida.writeUTF(mensaje);
        }catch(IOException error){
            System.out.println(error);
        }
    }
    
    
}
