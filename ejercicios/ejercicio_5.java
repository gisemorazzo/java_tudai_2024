
//Escribir un programa que solicite nombre, edad, altura y ocupación, y
//los imprima por pantalla.
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_5 {
    public static void main(String[] args) {
        String nombre;
        int edad;
        float altura;
        String ocupacion;

        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese su nombre:");
            nombre = entrada.readLine();
            System.out.println("Ingrese su edad: ");
            edad = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese su altura: ");
            altura = Float.valueOf( entrada.readLine());
            System.out.println("Ingrese su ocupacion: ");
            ocupacion = entrada.readLine();

            System.out.println("Su nombre es: \n"+ nombre);
            System.out.println("Su edad es: \n" + edad);
            System.out.println("Su altura es: \n"+ altura);
            System.out.println("Su ocupacion es: \n" + ocupacion);

        }
        catch(Exception exception) {
            
            System.out.println(exception);
        }
    }

}
