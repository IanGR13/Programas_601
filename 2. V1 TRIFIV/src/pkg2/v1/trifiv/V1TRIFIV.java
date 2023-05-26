
package pkg2.v1.trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class V1TRIFIV {

   
    public static void main(String[] args) throws IOException {
       
         BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
        
        int num;
        
        System.out.println("Ingrese un numero");
        num=Integer.parseInt(buf.readLine());
        
        
        
        if(num%5==0 && num%3==0){
            System.out.println("TRIFIV");
        }
        
        if(num%5==0){
            System.out.println("FIV");
        }
        
         if(num%3==0){
             
             System.out.println("TRI");
             
         }
    
        
    }
    
    
}
