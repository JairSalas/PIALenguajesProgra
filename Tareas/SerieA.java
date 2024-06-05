/*Nombre:Iver Jair Salas Sanchez Matricula:2173891 Hora:N5 */
/*Construya un programa en JAVA. Que calcule e imprima la siguiente serie para los N primeros  términos :1,8,243,16384,19531125*/

import java.util.Scanner;

public class SerieA {

    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        int n;
        long num;
        System.out.print("\nIndique  cuantos numeros de la serie quiere: ");
        n=read.nextInt();

        for (int i = 1; i <=n; i++) {
            num=(long) Math.pow(i,2*i-1);
            System.out.println("Num"+i+": "+num);
        }//Fin ciclo for

        read.close();



    }//Fin clase Main
}//Fin seriA