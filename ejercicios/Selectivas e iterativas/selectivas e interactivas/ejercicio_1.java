
//Escribir un programa completo (declaración de constantes y
//variables, carga de datos, procesamiento e impresión de
//resultados) para cada caso o ítem que:
//////a. solicite un número e indique si es positivo o negativo.
//b. solicite un número e imprima “grande” si es mayor a 100 y
////“chico “ si es menor.
////c. solicite un número del 1 al 7 e imprima el día de la semana.
//d. solicite una letra e imprima si es vocal o consonante.
///e. solicite 3 números e imprima “creciente” si los tres números
//están en orden creciente, “decreciente” si están en orden
//decreciente o “error” si no cumplen ningún orden

import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Caso a: Determinar si un número es positivo o negativo
        System.out.print("Ingrese un número: ");
        double numeroA = scanner.nextDouble();
        
        if (numeroA > 0) {
            System.out.println("El número es positivo.");
        } else if (numeroA < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        
        // Caso b: Determinar si un número es grande o chico
        System.out.print("Ingrese un número: ");
        double numeroB = scanner.nextDouble();
        
        if (numeroB > 100) {
            System.out.println("Grande");
        } else if (numeroB < 100) {
            System.out.println("Chico");
        } else {
            System.out.println("El número es igual a 100.");
        }
        
        // Caso c: Imprimir el día de la semana según el número ingresado
        System.out.printtln("Ingrese un número del 1 al 7: ");
        int numeroC = scanner.nextInt();
        
        switch(numeroC) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número fuera de rango.");
        }
        
        // Caso d: Determinar si una letra es vocal o consonante
        System.out.print("Ingrese una letra: ");
        char letraD = scanner.next().charAt(0);
        
        if (Character.isLetter(letraD)) {
            switch (Character.toLowerCase(letraD)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Es una vocal.");
                    break;
                default:
                    System.out.println("Es una consonante.");
            }
        } else {
            System.out.println("No es una letra válida.");
        }
        
        // Caso e: Determinar si tres números están en orden creciente, decreciente o no tienen orden
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double num3 = scanner.nextDouble();
        
        if (num1 < num2 && num2 < num3) {
            System.out.println("Creciente");
        } else if (num1 > num2 && num2 > num3) {
            System.out.println("Decreciente");
        } else {
            System.out.println("Error");
        }
        
        scanner.close();
    }
}
   
