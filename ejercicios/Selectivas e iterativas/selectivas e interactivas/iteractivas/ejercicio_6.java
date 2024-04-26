//Escribir un programa que mientras el usuario ingrese un número entero menor que 100 y mayor a 1, muestre por 
//pantalla si el número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
//valores mencionados en el enunciado deberían ser constantes?.De a poco habría que definirlos como constantes).

import java.util.Scanner;

    public class ejercicio_6{
        public static void main(String[]args){
            // Constantes para los límites del número
     int MINIMO = 1;
     int MAXIMO = 100;
    
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        
        do {
            System.out.print("Ingrese un número entero entre " + MINIMO + " y " + MAXIMO + ": ");
            numero = scanner.nextInt();
            
            if (numero >= MINIMO && numero <= MAXIMO) {
                if (numero % 2 == 0 && numero % 3 == 0) {
                    System.out.println("El número " + numero + " es múltiplo de 2 y múltiplo de 3 simultáneamente.");
                } else {
                    System.out.println("El número " + numero + " no es múltiplo de 2 y múltiplo de 3 simultáneamente.");
                }
            } else {
                System.out.println("El número debe estar entre " + MINIMO + " y " + MAXIMO + ".");
            }
            
        } while (numero >= MINIMO && numero <= MAXIMO);
        
    }
    }