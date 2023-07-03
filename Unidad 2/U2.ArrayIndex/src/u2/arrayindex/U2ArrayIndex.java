package u2.arrayindex;

public class U2ArrayIndex {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 4;  // Índice fuera de los límites del arreglo

            int result = numbers[index];
            System.out.println("El elemento en el índice " + index + " es: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ocurrió una excepción: ArrayIndexOutOfBoundsException");
            System.out.println("El índice proporcionado está fuera de los límites del arreglo.");
        }
    }
}
