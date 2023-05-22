
package pkg5.v4.trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class V4TRIFIV {

    
    public static void main(String[] args) throws IOException {
        //Declara Variables
        
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        
        int num;
        
        //creo objeto
        
        funcionMultiplo mult=new funcionMultiplo();
        
        //Entrada de datos
        
        System.out.println("Ingrese un numero");
        num=Integer.parseInt(buf.readLine());
        
        
        System.out.println(mult.retornaMultiplos(num));
    }
    
}
