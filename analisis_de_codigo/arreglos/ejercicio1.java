package arreglos;
//Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
//de valores entre 1 y 12. Luego mostrar cómo quedó cargado.

import java.io.BufferedReader;
import java.io.InputStreamReader;

    public class ejercicio1 {
        final static int MAX= 15;
        public static void main(String[]args){
            int []arreglo=new int [MAX];
            int numero;
            int pos = 0;
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                try{
                    while(pos < MAX){
                        System.out.println("Ingrese un numero entre 1 y 12");
                        numero = Integer.valueOf(entrada.readLine());
                        if(numero <=12){
                            arreglo[pos]=numero;
                            pos++;
                        }
                    }
                    System.out.println("Arreglo cargado: ");
                    for(int posicion =0; posicion < MAX; posicion++){
                        System.out.println("Posicion " + posicion + ": " + arreglo[posicion]);

                    }
                }
                catch(Exception exc){
                    System.out.println(exc);
                }
                
        }
    
}
