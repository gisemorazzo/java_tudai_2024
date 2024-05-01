    //public class Practica_3_Bonus_2 {
       // public static void main(String []args){
         //   char letra=’a’;
           // obtenerCaracter(letra);
             //   if (letra>=‘a’ && letra<=‘z’){
               //     System.out.println(“Es una letra minuscula”);
               // }

   //     public static String obtenerCaracter(char letra, int numero){
     //           String letra = ‘ ’;
    //try {
    ///BufferedReader entrada = new BufferedReader(new
   // InputStreamReader(System.in));
    //System.out.println("Ingrese un NRO entero: ");
   // letra = entrada.readLine().charAt(0);
  //  }
   // catch (Exception exc) {
   // System.out.println("error");
   // }
  //  return letra;
   // }
   // }
//}


import java.io.BufferedReader;
import java.io.InputStreamReader;

        public class Practica_3_Bonus_2 {
            public static void main(String[] args) {
                char letra = 'a';
                letra = obtenerCaracter(letra, 0);
                if (letra >= 'a' && letra <= 'z') {
                    System.out.println("Es una letra minúscula");
                }
            }

            public static char obtenerCaracter(char letra, int numero) {
                try {
                    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Ingrese un carácter: ");
                    letra = entrada.readLine().charAt(0);
                } catch (Exception exc) {
                    System.out.println("Error: " + exc.getMessage());
                }
                return letra;
    }
}