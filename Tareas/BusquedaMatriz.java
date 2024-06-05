/*Nombre:Iver Jair Salas Sanchez Matricula:217891 :N5
 * Elaborar un programa en JAVA que realice una búsqueda de un número en un vector, mostrando solamente un mensaje indicando cuantas veces apareció el número. Además de imprimir el vector
 */
import java.util.Scanner;

public class BusquedaMatriz {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        // Leer dimensiones de la matriz
        System.out.print("Ingrese el número de filas (N): ");
        int N = scanner.nextInt();
        System.out.print("Ingrese el número de columnas (M): ");
        int M = scanner.nextInt();
        
        // Crear la matriz
        int[][] matrix = new int[N][M];
        
        // Leer los elementos de la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Leer el número a buscar
        System.out.print("Ingrese el número a buscar: ");
        int target = scanner.nextInt();
        
        // Buscar el número en la matriz
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] == target) {
                    count++;
                }
            }
        }
        
        // Imprimir el resultado
        System.out.println("El número " + target + " se encuentra " + count + " veces en la matriz.");
        
        // Imprimir la matriz
        System.out.println("La matriz es:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close(); 
    }
}
