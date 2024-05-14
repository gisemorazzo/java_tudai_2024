//Construir un programa que solicite desde teclado un número de
//mes y posteriormente notifique por pantalla la cantidad de días de
//ese mes. En el caso de que ingrese 2 como número de mes
//(febrero) deberá además solicitar ingresar un número de año y,
//dependiendo si es bisiesto o no con la siguiente sentencia:
//((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
//imprimir la cantidad de días correspondiente.

import java.util.Scanner;

public class ejercicio_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número de mes (1-12): ");
        int mes = scanner.nextInt();
        
        if (mes < 1 || mes > 12) {
            System.out.println("Número de mes inválido.");
            return;
        }
        
        if (mes == 2) { // Febrero
            System.out.print("Ingrese un número de año: ");
            int anio = scanner.nextInt();
            int dias = 28; // Por defecto, febrero tiene 28 días
            
            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                // Si el año es bisiesto, febrero tiene 29 días
                dias = 29;
            }
            
            System.out.println("Febrero del año " + anio + " tiene " + dias + " días.");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            // Abril, junio, septiembre, noviembre tienen 30 días
            System.out.println("El mes " + mes + " tiene 30 días.");
        } else {
            // Resto de los meses tienen 31 días
            System.out.println("El mes " + mes + " tiene 31 días.");
        }
        
        scanner.close();
    }
}
