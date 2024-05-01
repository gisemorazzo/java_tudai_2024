//Hacer un método que dado un número entero con valor inicial 1,
//haga una iteración incrementando el número de a uno hasta un
//valor MAX = 4 (constante). Mientras itera deberá imprimir el
//número. Luego invocarlo desde el programa principal y cuando
//termina, imprimir por pantalla “terminó”.

public class ejercicio_5 {
    public static final int MAX=4;
    public static void main(String[] args) {
        imprimirNumeros();
        System.out.println("Terminó.");
    }
    public static void imprimirNumeros() {
        int numero=1; //iniciacion de numero
        while(numero<=MAX){
            System.out.println("Numero: "+ numero);
            numero++;
        }
        
    }
}
