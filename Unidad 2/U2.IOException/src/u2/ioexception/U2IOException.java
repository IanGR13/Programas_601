
package u2.ioexception;

import java.io.FileInputStream;
import java.io.IOException;

public class U2IOException {

  
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("archivo.txt");
            // Realizar operaciones con el archivo
            file.close();
        } catch (IOException e) {
            System.out.println("Ocurrió una excepción: IOException");
            System.out.println("Error al leer o escribir en el archivo.");
        }
    }
    
}
