//Escribir un diseño de programa que mientras que el usuario
//ingrese un número distinto de 0, pida ingresar otro número y lo
//imprima.

import java.util.Scanner;
public class ejercicio_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            int numero;
            do {
                System.out.println("Ingrese un número (0 para salir):");
                numero = scanner.nextInt();
                if (numero != 0) {
                    System.out.println("Número ingresado: " + numero);
                }
            } while (numero != 0);
        } catch (Exception e) {
            System.out.println("Error: Ingrese un número válido.");
        } finally {
            scanner.close();
        }
        
        System.out.println("Programa terminado.");
    }
}