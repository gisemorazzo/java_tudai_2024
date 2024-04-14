//Escribir un programa que dado tres números reales ingresados
//por el usuario, divida el primero por el segundo y al resultado
//obtenido le reste el tercero. Muestre por pantalla el resultado
//obtenido. Puede o no usar variables auxiliares para los cálculos.
//Tenga en cuenta posibles errores en las operaciones.

import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1;
        double numero2;
        double numero3;
        double resultado;
        try {
            // Solicitar al usuario que ingrese tres números reales
            System.out.println("Ingrese el primer número real:");
            numero1 = Double.parseDouble(scanner.nextLine());
            
            System.out.println("Ingrese el segundo número real:");
            numero2 = Double.parseDouble(scanner.nextLine());
            
            System.out.println("Ingrese el tercer número real:");
            numero3 = Double.parseDouble(scanner.nextLine());
            
            // Realizar las operaciones
            resultado = (numero1 / numero2) - numero3;
            
            // Mostrar el resultado
            System.out.println("El resultado es: " + resultado);
        } catch (NumberFormatException e) {
            // Manejar el error si el usuario ingresa un valor no válido
            System.out.println("Error: Ingrese números reales válidos.");
        } catch (ArithmeticException e) {
            // Manejar el error si ocurre una división por cero
            System.out.println("Error: División por cero.");
        } catch (Exception e) {
            // Manejar cualquier otro error inesperado
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}  
