package arreglos;
//2. Escribir un diseño de programa que mientras que el usuario
//ingrese un carácter dígito o carácter letra minúscula, imprima
//dicho carácter, y si es carácter letra minúscula, imprima si es vocal
//o consonante.

import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] caracteres = new char[100]; // Definimos un array para almacenar los caracteres
        int indice = 0; // Índice para recorrer el array de caracteres

        char caracter = ' ';
        while (Character.isDigit(caracter) || Character.isLowerCase(caracter)) {
            System.out.print("Ingrese un carácter (dígito o letra minúscula): ");
            caracter = scanner.next().charAt(0);

            if (Character.isDigit(caracter) || Character.isLowerCase(caracter)) {
                caracteres[indice] = caracter; // Almacenamos el carácter en el array
                indice++; // Incrementamos el índice para el siguiente carácter
            }
        }

        // Imprimimos los caracteres y su tipo (dígito, vocal o consonante)
        for (int i = 0; i < indice; i++) {
            System.out.print("Carácter: " + caracteres[i]);
            if (Character.isDigit(caracteres[i])) {
                System.out.println(" - Es un dígito.");
            } else if (Character.isLowerCase(caracteres[i])) {
                if (esVocal(caracteres[i])) {
                    System.out.println(" - Es una vocal.");
                } else {
                    System.out.println(" - Es una consonante.");
                }
            }
        }

        scanner.close();
    }

    // Método para verificar si un carácter es vocal
    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}