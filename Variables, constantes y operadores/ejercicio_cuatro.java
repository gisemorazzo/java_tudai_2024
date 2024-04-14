
import java.util.Scanner;
public class ejercicio_cuatro {
    public static void main(String[] args) {
        int[]numeros = new int[5];//declaro un array para almacenar los numeros
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese 5 numeros:");
        for (int i = 0; i < 5;  i++) {
            System.out.println("Numero"+(i+1)+ ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Numeros ingre45sado en orden inverso:");
        for(int i= 4; i>=0;i--) {
            System.out.println(numeros[i]);
            if(i>0){
                System.out.print("");
            }
        }
        scanner.close();
    }
}
