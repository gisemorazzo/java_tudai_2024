

import java.util.Scanner;
public class ejercicio_tres {
    public static void main(String[] args) {
        final int constante;
        //declaro una constante de tipo int
        Scanner scanner =new Scanner (System.in);
        //le pido al usuario que ingrese un valor por pantalla
        System.out.println("ingrese un valor entero:\n");
        constante = scanner.nextInt();
        System.out.println("el valor ingresado es:" + constante);
        //mostrar por pantalla
        scanner.close();
    }
}
