
//Escribir un programa que pida se ingresen datos necesarios para
//emitir una factura por la compra de dos artículos de librería (tipo
//factura, número, nombre cliente, producto 1, importe 1, producto 2,
//importe 2, importe total). Como salida debe imprimir por pantalla la
//factura en un formato similar al del siguiente ejemplo:
//Factura C N 249
//Nombre: Juan Perez
//Producto Importe
//Lápiz 15.5
//Papel 20.6
//Importe total 36.1
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ejercicio_6{
    public static void main(String[] args){
        char tipo_factura;
        int numero_factura;
        String nombre_cliente;
        String producto_1;
        float importe_1;
        String producto_2;
        float importe_2;
        float importe_total;
        try{
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Ingrese el tipo de factura: ");
                tipo_factura = entrada.readLine().charAt(0);
            System.out.println("Ingrese numero de factura: ");
                numero_factura = Integer.valueOf(entrada.readLine());
            System.out.println("Ingrese nombre de cliente: ");
                nombre_cliente = entrada.readLine();
            System.out.println("Ingrese el tipo de producto ingresado: ");
                producto_1 = entrada.readLine();
            System.out.println("Ingrese el importe: ");
                importe_1 = Float.valueOf(entrada.readLine());
             System.out.println("Ingrese el tipo de producto ingresado: ");
                producto_2 = entrada.readLine();
             System.out.println("Ingrese el importe del producto ingresado: ");
                importe_2 = Float.valueOf(entrada.readLine());
                importe_total = importe_1 + importe_2;

            System.out.println("El tipo de factura es: "+ tipo_factura);
            System.out.println("El numero de factura es: N"+ numero_factura);
            System.out.println("El nombre del cliente es: " +nombre_cliente);
            System.out.println("El producto es: " + producto_1);
            System.out.println("El importe es:  "+importe_1);
            System.out.println("El producto es: "+ producto_2);
            System.out.println("El importe es: "+ importe_2);
            System.out.println("Importe total: " + importe_total);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

}