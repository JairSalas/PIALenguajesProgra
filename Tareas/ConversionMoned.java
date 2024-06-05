/*Nombre:Iver Jair Salas Sanchez Matricula:2173891 Hora:N5 */
/*Elabore un programa en JAVA que a través de un Menú de opciones permita al usuario convertir de pesos a las siguientes monedas:1. Dólar2. Euro3. Yen(Japonés)4. Dólar de Hong Kong(Nota:Las equivalencias deberán definirse dentro del programa. */

import java.util.Scanner;

public class ConversionMoned {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcion;
        double pesos, Conversion,dolar,euro,yen,dHongKong;
        dolar=16.92;
        euro=18.19;
        yen=0.11;
        dHongKong=2.16;


        
        System.out.print("\nIndique la cantidad de pesos a convertir: ");
        pesos = read.nextDouble();

        System.out.println("\nMenú de opciones:");
        System.out.println("1. Convertir a dolares");
        System.out.println("2. Convertir a Euros");
        System.out.println("3. Convertir a Yenes");
        System.out.println("4. Convertir a Dolares De Hong Kong");
        System.out.print("Seleccione una opción: ");
        opcion = read.nextInt();

        switch (opcion) {
            case 1:
                Conversion = pesos/dolar;
                System.out.printf("La conversion   es de: %.2f Dolares ", Conversion);
                break;
            case 2:
                Conversion=pesos/euro;
                System.out.printf("La conversion a euros  es de: %.2f Euros", Conversion);
                break;
            case 3:
                Conversion=pesos/yen;
                System.out.printf("La conversion a yenes  es de: %.2f Yenes", Conversion);
                break;
            case 4:
                Conversion=pesos/dHongKong;
                System.out.printf("La conversion a dolares de Hong Kong  es: %.2f Dolares De Hong Kong", Conversion);
                break;  
            default:
                System.out.println("Opción no válida.");
                break;
        }//fin switch
        read.close();
    }//fin funcion main

    
}//Fin ConversionMoned
