//Escribir un programa que solicite una hora del día (valor entero de
//la hora solamente) y resuelva en cada caso:
//a. Si la hora está entre las 0 y las 5, pida ingresar la temperatura y si la misma es menor a 20 grados imprima
//“Encender la calefacción”. Si es mayor a 25, imprima “Apagar calefacción”. Si está en el rango de 20 a 25 imprima
//“Calefacción encendida, no abra las ventanas!!!”.
//b. Si la hora está entre las 6 y las 11, pida un carácter letra minúscula y si es vocal imprima por la consola la cantidad de
//vocales que tiene la palabra que corresponde con la hora.Ejemplo 8 (ocho) tiene 2 vocales. Si no es vocal imprima la
//cantidad de consonantes que tiene, para el ejemplo 8 (ocho) tiene 2 consonantes.
//c. Si la hora está entre las 12 y 17 y es par, imprima el promedio entre la hora ingresada y el límite inferior del
//rango. Si la hora es impar debe imprimir el promedio entre la hora ingresada y el límite superior del rango.
//d. Si la hora está entre las 18 y 23, pida ingresar una clave numérica, si coincide con la clave almacenada previamente
//en una constante, pida ingresar una segunda clave de verificación (un valor entre 100 y 999). Para esta segunda
//clave (que solo la conoce el usuario) se debe verificar que el dígito de mayor peso (centena) sea múltiplo del dígito de
//mayor peso de la clave almacenada. Si todo esto se cumple debería mostrar por la consola el mensaje “Clave correcta”.
//Ejemplo: clave almacenada 364, clave ingresada 364, segunda clave ingresada 698.

import java.util.Scanner
public class ejercicio_5{
    private static final int CLAVE_ALMACENADA = 364;
    
    public static void main(String[] args) {
        int  hora;
        int temperatura;
        char letra;
        double promedio;
        int claveIngresada;
        int segundaClave;
        int digitoMayorPesoAlmacenada = CLAVE_ALMACENADA;
        int contador;
        Scanner scanner = new Scanner(System.in);
        

        // Solicitar hora del día
        System.out.print("Ingrese la hora del día (valor entero): ");
        int hora = scanner.nextInt();
        
        // Caso a: 0-5
        if (hora >= 0 && hora <= 5) {
            System.out.print("Ingrese la temperatura: ");
            int temperatura = scanner.nextInt();
            if (temperatura < 20) {
                System.out.println("Encender la calefacción.");
            } else if (temperatura > 25) {
                System.out.println("Apagar la calefacción.");
            } else {
                System.out.println("Calefacción encendida, no abra las ventanas!!!");
            }
        }
        
        // Caso b: 6-11
        else if (hora >= 6 && hora <= 11) {
            scanner.nextLine(); // Limpiar el buffer del scanner
            System.out.print("Ingrese una letra minúscula: ");
            char letra = scanner.nextLine().charAt(0);
            if (esVocal(letra)) {
                System.out.println("La palabra correspondiente a la hora tiene " + contarVocales(hora) + " vocal(es).");
            } else {
                System.out.println("La palabra correspondiente a la hora tiene " + contarConsonantes(hora) + " consonante(s).");
            }
        }
        
        // Caso c: 12-17
        else if (hora >= 12 && hora <= 17) {
            if (hora % 2 == 0) {
                double promedio = (hora + 12) / 2.0; // Promedio entre la hora ingresada y el límite inferior del rango
                System.out.println("El promedio es: " + promedio);
            } else {
                double promedio = (hora + 17) / 2.0; // Promedio entre la hora ingresada y el límite superior del rango
                System.out.println("El promedio es: " + promedio);
            }
        }
        
        // Caso d: 18-23
        else if (hora >= 18 && hora <= 23) {
            System.out.print("Ingrese la clave numérica: ");
            int claveIngresada = scanner.nextInt();
            if (claveIngresada == CLAVE_ALMACENADA) {
                System.out.print("Ingrese una segunda clave de verificación (entre 100 y 999): ");
                int segundaClave = scanner.nextInt();
                int digitoMayorPesoAlmacenada = CLAVE_ALMACENADA / 100;
                int digitoMayorPesoIngresada = segundaClave / 100;
                if (digitoMayorPesoIngresada % digitoMayorPesoAlmacenada == 0) {
                    System.out.println("Clave correcta.");
                } else {
                    System.out.println("Clave incorrecta.");
                }
            } else {
                System.out.println("Clave incorrecta.");
            }
        }
        
        scanner.close();
    }
    
    // Función para verificar si un carácter es una vocal
    public static boolean esVocal(char letra) {
        return "aeiou".indexOf(letra) != -1;
    }
    
    // Función para contar vocales en una palabra según la hora
    public static int contarVocales(int hora) {
        String palabra = obtenerPalabra(hora);
        int contador = 0;
        for (char letra : palabra.toCharArray()) {
            if (esVocal(letra)) {
                contador++;
            }
        }
        return contador;
    }
    
    // Función para contar consonantes en una palabra según la hora
    public static int contarConsonantes(int hora) {
        String palabra = obtenerPalabra(hora);
        int contador = 0;
        for (char letra : palabra.toCharArray()) {
            if (!esVocal(letra) && Character.isLetter(letra)) {
                contador++;
            }
        }
        return contador;
    }
    
    // Función para obtener la palabra correspondiente a una hora del día
    public static String obtenerPalabra(int hora) {
        String[] palabras = {"doce", "una", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once"};
        return palabras[hora % 12];
    }
}