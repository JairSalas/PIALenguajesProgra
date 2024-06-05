/*Nombre:Iver Jair Salas Sanchez Matricula:2173891 Hora:N5
*Elaborar un programa en JAVA que calcule la multiplicación de dos matrices que ingrese el usuario. (nota: Validar lo que sea necesario para poder realizar la multiplicación de matrices)
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiplicacionMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsA = 0, colsA = 0, rowsB = 0, colsB = 0;
        boolean validInput = false;

        // Leer dimensiones de la primera matriz con validación
        while (!validInput) {
            try {
                System.out.print("Ingrese el número de filas de la primera matriz: ");
                rowsA = scanner.nextInt();
                System.out.print("Ingrese el número de columnas de la primera matriz: ");
                colsA = scanner.nextInt();
                if (rowsA > 0 && colsA > 0) {
                    validInput = true;
                } else {
                    System.out.println("Por favor, ingrese números positivos.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor ingrese números enteros.");
                scanner.next(); // Limpiar la entrada no válida
            }
        }

        // Leer dimensiones de la segunda matriz con validación
        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Ingrese el número de filas de la segunda matriz: ");
                rowsB = scanner.nextInt();
                System.out.print("Ingrese el número de columnas de la segunda matriz: ");
                colsB = scanner.nextInt();
                if (rowsB > 0 && colsB > 0) {
                    if (colsA == rowsB) {
                        validInput = true;
                    } else {
                        System.out.println("El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
                    }
                } else {
                    System.out.println("Por favor, ingrese números positivos.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor ingrese números enteros.");
                scanner.next(); // Limpiar la entrada no válida
            }
        }

        // Crear las matrices
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];

        // Leer los elementos de la primera matriz
        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                validInput = false;
                while (!validInput) {
                    try {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matrixA[i][j] = scanner.nextInt();
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
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                validInput = false;
                while (!validInput) {
                    try {
                        System.out.print("Elemento [" + i + "][" + j + "]: ");
                        matrixB[i][j] = scanner.nextInt();
                        validInput = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada no válida. Por favor ingrese un número entero.");
                        scanner.next(); // Limpiar la entrada no válida
                    }
                }
            }
        }

        // Multiplicar las matrices
        int[][] productMatrix = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                productMatrix[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    productMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        // Imprimir la matriz resultante
        System.out.println("La matriz resultante de la multiplicación es:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
