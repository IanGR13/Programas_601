
package pkg5.v4.trifiv;


public class funcionMultiplo {
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
