package u2.classcastexception;

public class U2ClassCastException {

    public static void main(String[] args) {
        try {
            Object obj = "Hola";
            Integer number = (Integer) obj;  // Intento de conversión inválida

            System.out.println("El número es: " + number);
        } catch (ClassCastException e) {
            System.out.println("Ocurrió una excepción: ClassCastException");
            System.out.println("No se puede convertir un objeto de tipo String a Integer.");
        }
    }

}
