package analisis_de_codigo;

////*Para los siguientes métodos verificar su funcionamiento por medio
//de algunas de las técnicas aprendidas y corregir los errores si
//hubiesen:

 //   public class ejercicio_1 {
   //         public static int obtenerFactorial(int numero){

    // obtiene el factorial de numero
     //   int resultado=numero;
       //     while (numero>0)
         //   resultado*=--numero;
           // return resultado;
    //}
//}

public class ejercicio_1 {
    public static void main(String[] args) {
        // Casos de prueba conocidos
        int[] casosPrueba = {0, 1, 5, 10};
        
        // Verificar el resultado para cada caso de prueba
        for (int i = 0; i < casosPrueba.length; i++) {
            int numero = casosPrueba[i];
            int resultadoEsperado = factorial(numero);
            int resultadoReal = obtenerFactorial(numero);
            
            // Imprimir resultado
            System.out.println("Número: " + numero);
            System.out.println("Resultado esperado: " + resultadoEsperado);
            System.out.println("Resultado real: " + resultadoReal);
            System.out.println("-------------------------------------");
        }
    }
    
    // Método para obtener el factorial de un número (calculado correctamente)
    public static int factorial(int numero) {
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método proporcionado con correcciones
    public static int obtenerFactorial(int numero) {
        int resultado = numero;
        while (numero > 1) {
            resultado *= --numero;
        }
        return resultado;
    }
}