//Hacer un programa que dado un arreglo de caracteres de tamaño
//MAX que se encuentra cargado, invierta el orden del contenido.
package arreglos;

public class ejercicio_5 {
    final int MAX=0;
    public static void main(String[] args) {
        // Arreglo de caracteres ya cargado
        char[] arreglo = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};

        // Mostrar el arreglo original
        System.out.println("Arreglo original:");
        imprimirArreglo(arreglo);

        // Invertir el orden del contenido del arreglo
        invertirArreglo(arreglo);

        // Mostrar el arreglo invertido
        System.out.println("Arreglo invertido:");
        imprimirArreglo(arreglo);
    }

    // Método para invertir el orden del contenido del arreglo
    public static void invertirArreglo(char[] arreglo) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        while (izquierda < derecha) {
            // Intercambiar los caracteres en las posiciones izquierda y derecha
            char temp = arreglo[izquierda];
            arreglo[izquierda] = arreglo[derecha];
            arreglo[derecha] = temp;
            // Mover los índices hacia el centro del arreglo
            izquierda++;
            derecha--;
        }
    }

    // Método para imprimir un arreglo de caracteres
    public static void imprimirArreglo(char[] arreglo) {
        for (char elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
}
}
