package analisis_de_codigo;
//a. Escribir un programa que llame un método que calcule el
//promedio de la suma de valores enteros entre 1 y 1000.
//Finalmente, el promedio debe mostrarse por pantalla
   // public class Practica_3_Bonus_4 {
    //public static final int MAX = 1, MIN = 1000;
    //public static void main(String[] args) {
    //System.out.println("El promedio de la suma entre " MIN " y
    //" MAX " es "+ calcular_promedio());
    //}
   // public static char calcular_promedio(int MAX, int MIN) {
/////int suma = 0;
    //int numero = MIN;
    //for (; numero <= MAX; numero++) {
    //suma += numero;
   // }
   // return suma/(MAX-MIN+1);
   // }
   /// }
    public class Practica_3_Bonus_4 {
        public static final int MAX = 1000; // Corregido el valor máximo
        public static final int MIN = 1; // Corregido el valor mínimo

        public static void main(String[] args) {
            System.out.println("El promedio de la suma entre " + MIN + " y " + MAX + " es " + calcular_promedio(MAX, MIN));
        }

        public static double calcular_promedio(int MAX, int MIN) { // Cambiado el tipo de retorno a double
            int suma = 0;
            for (int numero = MIN; numero <= MAX; numero++) {
                suma += numero;
            }
            return (double) suma / (MAX - MIN + 1); // Se convierte la suma a double para obtener el promedio
        }
    }