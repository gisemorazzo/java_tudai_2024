//Escribir un programa donde el usuario ingrese un número entre 0
//y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
//tiene 3 dígitos debe informar qué número es.

import java.util.Scanner;

public class ejercicio_4{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número entre 0 y 999: ");
        int numero = scanner.nextInt();
        
        if (numero < 0 || numero > 999) {
            System.out.println("El número debe estar entre 0 y 999.");
        } else {
            int cantidadDigitos = contarDigitos(numero);
            System.out.println("El número ingresado tiene " + cantidadDigitos + " dígito(s).");
            
            if (cantidadDigitos == 3) {
                System.out.println("El número ingresado es: " + numero);
            }
        }
        
        scanner.close();
    }
    
    // Función para contar la cantidad de dígitos de un número
    public static int contarDigitos(int numero) {
        if (numero < 10) {
            return 1;
        } else if (numero < 100) {
            return 2;
        } else {
            return 3;
        }
    }
}
