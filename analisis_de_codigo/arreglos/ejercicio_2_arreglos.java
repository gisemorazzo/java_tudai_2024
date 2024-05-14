package arreglos;
//Hacer un programa que dado un arreglo ya cargado con 10
//enteros, calcule el promedio y lo muestre por la consola.
public class ejercicio_2_arreglos {
    public static void main(String[] args) {
        // Arreglo de enteros ya cargado
        int[] arreglo = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        // Calcular la suma de los elementos del arreglo
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }

        // Calcular el promedio
        double promedio = (double) suma / arreglo.length;

        // Mostrar el promedio por la consola
        System.out.println("El promedio del arreglo es: " + promedio);
    }
}
        

