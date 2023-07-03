
package u2.classnotfoundexception;


public class U2ClassNotFoundException {

   
    public static void main(String[] args) {
       try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Ocurrió una excepción: ClassNotFoundException");
            System.out.println("No se pudo encontrar la clase especificada.");
        }
    }
    
}
