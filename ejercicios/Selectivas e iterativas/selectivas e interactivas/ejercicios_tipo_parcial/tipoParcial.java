package ejercicios_tipo_parcial;
public class tipoParcial {
    /*
     * Un reconocido supermercado de venta online ha decidido incorporar productos a
     * modo de
     * promoción en aquellos pedidos que cumplen con ciertos requisitos. Cada
     * producto está
     * identificado con un valor numérico mayor a 0. Los pedidos recibidos se
     * almacenan en un
     * arreglo P de tamaño MAXP que comienza y finaliza con uno o más 0. Cada pedido
     * está
     * compuesto por una serie de productos y separados entre sí también por uno o
     * más 0. A
     * modo de ejemplo, en el siguiente arreglo P, el primer pedido está compuesto
     * por los
     * productos 12, 9 y 18. En total hay 4 pedidos.
     */

    public static final int MAX = 25;
    public static final int SEPARADOR = 0;

    public static final int MAXT = 2;
    public static int R = 22;
  public static int cantidad =2;
  public static int[] arregloT =  {8,9};
    public static void main(String[] args) {
        int[] arreglo = { 0, 0, 12, 9, 18, 0, 15, 5, 4, 7, 10, 0, 8, 9, 12, 0, 19, 10, 9, 0, 0, 0, 0, 0, 0 };

        /*0 0 12 9 18 22 0 15 5 4 7 10 0 8 9 12 22 0 19 10 9 0 0 0 0 */
        int ini = 0;
        int fin = -1;


        while (ini < MAX-1) {
            ini = buscarIni(arreglo, fin + 1);
            System.out.println(ini);
            fin = buscarFin(arreglo, ini);
            System.out.println(fin);


            recorrerSecuencia(arreglo, ini, fin);
        }

        
        System.out.println("LOS PRODUCTOS RESTANTES R SON: " + cantidad);

    }

    public static void recorrerSecuencia(int[] arreglo, int ini, int fin) {

        while(ini < fin && arreglo[ini] != SEPARADOR) {
            if (arreglo[ini] == arregloT[0] || arreglo[ini] == arregloT[1]) {

                if(cantidad > 0) {
                    corrimientoDerecha(arreglo, fin);
                    cantidad--;
                } 
               
            }

            ini++;
        }
    }

    public static void corrimientoDerecha(int []arreglo, int fin) {

        for(int i = MAX-1; i>fin; i--) {
            arreglo[i] = arreglo[i-1];
        }

        arreglo[fin+1] = R;
        mostrarArreglo(arreglo);
      
    }

    public static void mostrarArreglo(int [] arregloNuevo) {
        for (int i =0; i<MAX; i++) {
            System.out.print(arregloNuevo[i] + " ||");
        }
        System.out.println("------------");
    }
    /*
     * Se pide realizar un programa en Java que permita incorporar un producto
     * promocionado R
     * en aquellos pedidos que posean al menos uno de los productos almacenados en
     * un arreglo
     * T de tamaño MAXT (ordenado en forma ascendente). Debido a que solo se cuenta
     * con una
     * cantidad C del producto promocionado R, sólo serán incorporados en los
     * primeros pedidos
     * que cumplan con el requisito antes mencionado. La incorporación del producto
     * se realiza al
     * final del pedido.
     * Continuando con el ejemplo, dado un arreglo T = {8, 9} con MAXT = 2, un
     * producto
     * promocionado R = 22 y una cantidad C = 2, el arreglo resultante será:
     */

    public static int buscarIni(int[] arreglo, int pos) {

        while (pos < MAX-1 && arreglo[pos] == 0) {
            pos++;
        }

        return pos;
    }

    public static int buscarFin(int[] arreglo, int ini) {

        while (ini < MAX-1 && arreglo[ini] != SEPARADOR) {
            ini++;
        }

        return ini - 1;
    }
}