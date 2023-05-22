
package pkg4.v3.trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class V3TRIFIV {

    
    public static void main(String[] args) throws IOException {
        
        //Declara Variables
        
        BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        
        int num;
        
        //Entrada de datos
        
        System.out.println("Ingrese un numero");
        num=Integer.parseInt(buf.readLine());
        
        
        System.out.println(retornaMultiplos(num));
        
    }
    
    //creacion de la funcion
    public static String retornaMultiplos(int num){
        
        float multres;
        float mulcinco;
        
        //procesar datos
        multres = num % 3;
        mulcinco = num % 5;
        
        if(multres==0 && mulcinco==0){
            return "TRIFIV";
        }
        
        else if(mulcinco==0){
            return "FIV";
        }
        
         else if(multres==0){
             
             return "TRI";
             
         }
        
        return "ningun valor";
    }
    
}
