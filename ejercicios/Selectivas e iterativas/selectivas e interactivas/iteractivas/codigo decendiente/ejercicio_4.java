//Escribir un diseño de programa que mientras que el usuario
//ingrese un número distinto de 0, pida ingresar otros dos números
//e imprima el resultado de la multiplicación entre los dos últimos
//números ingresados.

import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero= 1;
        while (numero != 0) {
            System.out.println("Ingrese un número (0 para salir):");
            numero = scanner.nextInt();
            
            if (numero != 0) {
                pedirNumerosYMultiplicar(scanner);
            }
        }
        
        scanner.close();
        System.out.println("Programa terminado.");
    }
    
    // Método que solicita dos números y los multiplica
    public static void pedirNumerosYMultiplicar(Scanner scanner) {
        System.out.println("Ingrese dos números para multiplicar:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        
        int resultado = numero1 * numero2;
        System.out.println("El resultado de la multiplicación es: " + resultado);
    }
}
