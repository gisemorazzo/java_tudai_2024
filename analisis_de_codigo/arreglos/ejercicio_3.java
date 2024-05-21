package arreglos;
///Con el mismo arreglo del ejercicio anterior informe por pantalla
//cuantos elementos del mismo están por encima del promedio calculado.
 public class ejercicio_3{
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

        // Contar cuántos elementos están por encima del promedio
        int elementosPorEncimaDelPromedio = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > promedio) {
                elementosPorEncimaDelPromedio++;
            }
        }

        // Mostrar el promedio y la cantidad de elementos por encima del promedio
        System.out.println("El promedio del arreglo es: " + promedio);
        System.out.println("Cantidad de elementos por encima del promedio: " + elementosPorEncimaDelPromedio);
    }
}
    