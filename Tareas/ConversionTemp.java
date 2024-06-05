/*Nombre:Iver Jair Salas Sanchez Matricula:2173891 Hora:N5 */
/*Elabore un programa en JAVA que mediante un Menú de opciones permita calcular la conversión de escala de temperatura:1. De grados Centígrados a grados Farenheit2. De grados Farenheita grados Centígrados */

import java.util.Scanner;

public class ConversionTemp {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcion;
        double temp, tempConver;
        
        System.out.print("\nIndique la temperatura: ");
        temp = read.nextDouble();

        System.out.println("\nMenú de opciones:");
        System.out.println("1. Convertir de Celsius a Fahrenheit");
        System.out.println("2. Convertir de Fahrenheit a Celsius");
        System.out.print("Seleccione una opción: ");
        opcion = read.nextInt();

        switch (opcion) {
            case 1:
                tempConver = celsiusAFahrenheit(temp);
                System.out.printf("La temperatura en Fahrenheit es: %.2f °F", tempConver);
                break;
            case 2:
                tempConver = fahrenheitACelsius(temp);
                System.out.printf("La temperatura en Celsius es: %.2f °C", tempConver);
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
        read.close();
    }//fin main

    // Función para convertir de Celsius a Fahrenheit
    private static double celsiusAFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // Función para convertir de Fahrenheit a Celsius
    private static double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}//fin ConversionTemp
