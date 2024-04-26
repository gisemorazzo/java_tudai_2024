
//Escribir un diseño de programa que mientras que el usuario
//ingrese un carácter dígito o carácter letra minúscula, imprima
//dicho carácter, y si es carácter letra minúscula, imprima si es vocal
//o consonante.

import java.util.Scanner;
public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char caracter;
        do {
            System.out.println("Ingrese un carácter (digito o letra minúscula):");
            caracter = scanner.next().charAt(0);
            
            if (Character.isDigit(caracter) || Character.isLowerCase(caracter)) {
                System.out.println("Carácter ingresado: " + caracter);
                if (Character.isLowerCase(caracter)) {
                    if (esVocal(caracter)) {
                        System.out.println("Es una vocal.");
                    } else {
                        System.out.println("Es una consonante.");
                    }
                }
            } else {
                System.out.println("Carácter no válido. Intente de nuevo.");
            }
        } while (Character.isDigit(caracter) || Character.isLowerCase(caracter));
        
        scanner.close();
        System.out.println("Programa terminado.");
    }
    
    // Función para verificar si un carácter es vocal o consonante
    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}
    
