import java.util.Scanner;

public class BusquedaVector {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        
        // Definir el vector
        int[] vector = {1, 4, 7, 9, 21, 4, 0, 2, 5, 2};
        
        // Imprimir el vector
        System.out.println("Vector:");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        
        // Solicitar al usuario el valor a buscar
        System.out.println("\n\nValor a buscar: ");
        int valorBuscado =lec.nextInt();
        
        // Contar cuántas veces aparece el valor en el vector
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == valorBuscado) {
                contador++;
            }
        }
        
        // Mostrar el resultado
        System.out.println("\nEl número " + valorBuscado + " aparece " + contador + " veces en el vector.");
    }
}
