package arreglos;
//Hacer un programa que dado un arreglo de enteros de tamaño 10
//que se encuentra cargado, obtenga la cantidad de números pares
//que tiene y la imprima.
import java.util.Scanner;
public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definimos el tamaño del arreglo
        final int TAMANIO_ARREGLO = 10;
        int[] numeros = new int[TAMANIO_ARREGLO];
        
        // Mensaje informativo
        System.out.println("Ingrese " + TAMANIO_ARREGLO + " números enteros:");

        // Cargar el arreglo con entrada del usuario
        for (int i = 0; i < TAMANIO_ARREGLO; i++) {
            while (true) {
                try {
                    System.out.print("Número " + (i + 1) + ": ");
                    numeros[i] = Integer.parseInt(scanner.nextLine());
                    break;  // Salir del bucle si la entrada es válida
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                }
            }
        }
        
        // Variable para contar los números pares
        int cantidadPares = 0;

        // Recorremos el arreglo y contamos los números pares
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                cantidadPares++;
            }
        }

        // Imprimimos la cantidad de números pares
        System.out.println("La cantidad de números pares es: " + cantidadPares);
    }
}