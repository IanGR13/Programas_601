
package pkg2.v1.trifiv;

import java.util.Scanner;


public class V1TRIFIV {

   
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num1;
       
        System.out.println("Ingrese un numero");
        num1=sc.nextInt();
        
        
        
        if(num1%5==0 && num1%3==0){
            System.out.println("TRIFIV");
        }
        
        else if(num1%5==0){
            System.out.println("FIV");
        }
        
         else if(num1%3==0){
             
             System.out.println("TRI");
             
         }
    }
    
}
