
package u2.nullpointerexception;

public class U2NullPointerException {

    
    public static void main(String[] args) {
        try {
            String text = null;
            int length = text.length();  // Intento acceder a un método de un objeto nulo

            System.out.println("La longitud del texto es: " + length);
        } catch (NullPointerException e) {
            System.out.println("Ocurrió una excepción: NullPointerException");
            System.out.println("Se intentó acceder a un objeto que es nulo.");
        }
    }
    
}
