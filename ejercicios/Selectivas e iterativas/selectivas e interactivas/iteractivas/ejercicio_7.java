//Escribir un programa que mientras el usuario ingrese un caracter
//distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
//si es carácter vocal minúscula.

import java.util.Scanner;

public class ejercicio_7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            char caracter;
            
            do {
                System.out.print("Ingrese un carácter ('*' para salir): ");
                caracter = scanner.next().charAt(0);
                
                if (caracter != '*') {
                    if (Character.isDigit(caracter)) {
                        System.out.println("El carácter ingresado es un dígito.");
                    } else if (esVocalMinuscula(caracter)) {
                        System.out.println("El carácter ingresado es una vocal minúscula.");
                    } else {
                        System.out.println("El carácter ingresado no es un dígito ni una vocal minúscula.");
                    }
                }
                
            } while (caracter != '*');
            
            scanner.close();
        }
        
        // Función para verificar si un carácter es una vocal minúscula
        public static boolean esVocalMinuscula(char caracter) {
            return "aeiou".indexOf(caracter) != -1;
        }
    }
