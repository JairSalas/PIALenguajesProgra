/*Nombre:Iver Jair Salas Sanchez Matricula:217891 :N5
 *Elaborar un programa en JAVA que calcule la suma de dos matrices que ingrese el usuario. (nota: Validar lo que sea necesario para poder realizar la suma de matrices )
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaMatrices {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int rows = 0, cols = 0;
        boolean validInput = false;

        // Leer dimensiones de las matrices con validación
        while (!validInput) {
            try {
                System.out.print("Ingrese el número de filas: ");
                rows = scanner.nextInt();
                System.out.print("Ingrese el número de columnas: ");
                cols = scanner.nextInt();
                if (rows > 0 && cols > 0) {
                    validInput = true;
                } else {
                    System.out.println("Por favor, ingrese números positivos.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor ingrese números enteros.");
                scanner.next(); // Limpiar la entrada no válida
            }
        }

        // Crear las matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Leer los elementos de la primera matriz
        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                validInput = false;
                while (!validInput) {
                    try {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matrix1[i][j] = scanner.nextInt();
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada no válida. Por favor ingrese un número entero.");
                        scanner.next(); // Limpiar la entrada no válida
                    }
                }
            }
        }

        // Leer los elementos de la segunda matriz
        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                validInput = false;
                while (!validInput) {
                    try {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matrix2[i][j] = scanner.nextInt();
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada no válida. Por favor ingrese un número entero.");
                        scanner.next(); // Limpiar la entrada no válida
                    }
                }
            }
        }

        // Sumar las matrices
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Imprimir la matriz resultante
        System.out.println("La matriz resultante de la suma es:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }
}
