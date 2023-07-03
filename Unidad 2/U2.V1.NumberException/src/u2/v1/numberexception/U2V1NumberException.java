
package u2.v1.numberexception;

import javax.swing.JOptionPane;


public class U2V1NumberException {

    
    public static void main(String[] args) {
        int x,y;
        
        try{
            x= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 1: ", "Solicito dato", 3));
            
        }catch(NumberFormatException n){
            
            System.out.println(n.getMessage()+"No es numero entero");
            
    }
        
    }
    
}
