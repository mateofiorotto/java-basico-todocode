import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        // Realizar un programa que dado por teclado un limite numerico
        // muestre los numeros hasta ese limite

        //Definicion vars:
        int limite;
        // int contador = 1; para el while

        // Pedimos los datos
        System.out.println("Por favor ingrese un numero del 1 al 100");
        Scanner ingresar = new Scanner(System.in);
        limite = ingresar.nextInt();

        // Validacion
        while (limite < 1 || limite > 100) {
            System.out.println("Incorrecto. Ingrese un numero del 1 al 100");
            limite = ingresar.nextInt();
        }

        for (int i = 1; i <= limite ; i++) {
            System.out.println("Esta es la vuelta: " + i);
        }

        //forma con el while
        //while (contador <= limite) {
        //    System.out.println("Esta es la vuelta: " + contador);
        //    contador++;
        //}

    }
}
