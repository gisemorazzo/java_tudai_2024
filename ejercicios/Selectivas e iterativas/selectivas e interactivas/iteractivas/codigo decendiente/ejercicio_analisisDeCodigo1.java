//public class Practica_3_Bonus_1 {
//public static void main (String [] args){
  //  int resultado=0;
    //System.out.println(“Tabla de multiplicar del 7”);
    //resultado=imprimirTabla7(resultado);
   // }
   // public static void imprimirTabla5(){
   // for (int i = 1 ; i <= 10; i++) {
    //System.out.println(5*i);
   // }
    //}
    //}

    ////CORRECCION//
        public class ejercicio_analisisDeCodigo1 {
            public static void main (String [] args){
                int resultado =0;
                System.out.println("Tabla de multiplicar del 7");
                resultado = imprimirTabla7 (resultado);
            }
            public static int imprimirTabla7(int resultado){
                for (int i = 1 ; i <= 10; i++) {
                    resultado = 7 * i;
                    System.out.println(resultado);
            }
            return resultado;
            }
        }
