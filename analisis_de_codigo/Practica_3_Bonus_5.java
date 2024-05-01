//Dados dos números positivos y un carácter opción cuyo valor es una letra minúscula ‘s’ o ‘r’ (únicamente puede
//tomar estos dos valores), obtener la suma de ambos números si la opción es ‘s’ o si es ‘r’ se debe restar el
//primero al segundo.
//public class Practica_3_Bonus_5 {
//public static void main(String[] args) {
//int numero1=235; // valor de ejemplo
//int numero2=-5; // valor de ejemplo
//char opcion=’s’;
//resolver(opcion,numero1,numero2);
//}
//public static void resolver(int num1, int num2, char op){
//if (op==’s’){
//System.out.println("La suma es: "+num1+num2);
//}
//else if (op==’r’){
//System.out.println("La resta es:

//"+num1-num2);
//}else
//System.out.println("Opción no válida”);

//}
//}
public class Practica_3_Bonus_5 {
    public static void main(String[] args) {
        int numero1 = 235; // valor de ejemplo
        int numero2 = -5; // valor de ejemplo
        char opcion = 's';
        resolver(numero1, numero2, opcion);
    }

    public static void resolver(int num1, int num2, char op) {
        if (op == 's') {
            System.out.println("La suma es: " + (num1 + num2)); // Suma los números correctamente
        } else if (op == 'r') {
            System.out.println("La resta es: " + (num2 - num1)); // Resta los números correctamente
        } else {
            System.out.println("Opción no válida");
        }
    }
}