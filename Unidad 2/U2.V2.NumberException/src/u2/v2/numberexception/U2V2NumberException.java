
package u2.v2.numberexception;

import javax.swing.JOptionPane;


public class U2V2NumberException {

    
    public static void main(String[] args) {
       int x,y;
        
        try{
            x= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 1: ", "Solicito dato", 3));
             y= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero 2: ", "Solicito dato", 3));
             JOptionPane.showMessageDialog(null, "La divicion de "+ x + " / "+ y + " es "+ (x/y), "Mostrando Resultado", 3);
            
        }catch(NumberFormatException n){
            
            System.out.println(n.getMessage()+"No es numero entero");
            
    }catch(ArithmeticException a){
        
            System.out.println(a.getMessage()+"No se puede dividir entre 0");
        
    }
    }
    
}
