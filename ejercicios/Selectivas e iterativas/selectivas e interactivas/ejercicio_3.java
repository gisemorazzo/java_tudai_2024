//Escribir un programa que solicite el ingreso de un número mayor a
//50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3.

import java.util.Scanner;

public class ejercicio_3{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número mayor a 50: ");
        int numero = scanner.nextInt();
        
        if (numero <= 50) {
            System.out.println("El número ingresado debe ser mayor a 50.");
        } else {
            if (numero % 2 == 0 || numero % 3 == 0) {
                System.out.println("El número " + numero + " es múltiplo de 2 o 3.");
            } else {
                System.out.println("El número " + numero + " no es múltiplo de 2 ni de 3.");
            }
        }
    }
}