package arreglos;
//Buscar un elemento en un arreglo de caracteres ya cargado de
//tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
//estar indicarlo también.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ejercicio_4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    // Definimos el tamaño del arreglo
    final int TAMANIO_ARREGLO = 10;
    char[] caracteres = new char[TAMANIO_ARREGLO];

    // Mensaje informativo
    System.out.println("Ingrese " + TAMANIO_ARREGLO + " caracteres para llenar el arreglo:");

    // Cargar el arreglo con entrada del usuario y validación
    for (int i = 0; i < TAMANIO_ARREGLO; i++) {
        while (true) {
            System.out.print("Carácter " + (i + 1) + ": ");
            String entrada = scanner.nextLine();
            if (entrada.length() == 1) {
                caracteres[i] = entrada.charAt(0);
                break;  // Salir del bucle si la entrada es válida
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un solo carácter.");
            }
        }
    }

    // Preguntar al usuario el carácter que desea buscar
    System.out.print("Ingrese el carácter que desea buscar: ");
    char elementoBuscado = scanner.nextLine().charAt(0);

    // Lista para almacenar las posiciones donde se encuentra el elemento
    List<Integer> posiciones = new ArrayList<>();

    // Recorremos el arreglo y buscamos el elemento
    for (int i = 0; i < caracteres.length; i++) {
        if (caracteres[i] == elementoBuscado) {
            posiciones.add(i);
        }
    }

    // Verificamos si el elemento fue encontrado y mostramos las posiciones
    if (posiciones.isEmpty()) {
        System.out.println("El carácter '" + elementoBuscado + "' no se encuentra en el arreglo.");
    } else {
        System.out.print("El carácter '" + elementoBuscado + "' se encuentra en las posiciones: ");
        for (int pos : posiciones) {
            System.out.print(pos + " ");
        }
        System.out.println(); // Salto de línea al final de la lista de posiciones
    }

    // Preguntar si desea buscar otro carácter
    while (true) {
        System.out.print("¿Desea buscar otro carácter? (s/n): ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Ingrese el carácter que desea buscar: ");
            elementoBuscado = scanner.nextLine().charAt(0);

            // Limpiar la lista de posiciones
            posiciones.clear();

            // Recorremos el arreglo y buscamos el elemento nuevamente
            for (int i = 0; i < caracteres.length; i++) {
                if (caracteres[i] == elementoBuscado) {
                    posiciones.add(i);
                }
            }

            // Verificamos si el elemento fue encontrado y mostramos las posiciones
            if (posiciones.isEmpty()) {
                System.out.println("El carácter '" + elementoBuscado + "' no se encuentra en el arreglo.");
            } else {
                System.out.print("El carácter '" + elementoBuscado + "' se encuentra en las posiciones: ");
                for (int pos : posiciones) {
                    System.out.print(pos + " ");
                }
                System.out.println(); // Salto de línea al final de la lista de posiciones
            }
        } else if (respuesta.equalsIgnoreCase("n")) {
            System.out.println("Gracias por usar el programa. ¡Adiós!");
            break;
        } else {
            System.out.println("Respuesta inválida. Por favor, ingrese 's' o 'n'.");
        }
    }
}
}