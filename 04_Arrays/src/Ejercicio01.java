import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {

        // EJERCICIO 1
        // Realizar un programa que permita cargar 5 numeros en un vector. Una vez cargados, se necesita
        // que el programa cuente e informe por pantalla cuantas veces se cargo el numero 3.

        //definir vars
        int vector[] = new int[5];
        int contador = 0;

        Scanner teclado = new Scanner(System.in);

        //For para cargar el array
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Cargar num en el indice del vector " + i + ": ");
            vector[i] = teclado.nextInt();

            // si el numero cargado fue 3, sumar 1 al contador
            if (vector[i] == 3) {
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("El numero 3 no se cargo nunca");
        } else if (contador == 1) {
            System.out.println("El numero 3 se cargo " + contador + " vez");
        } else {
            System.out.println("El numero 3 fue cargado " + contador + " veces");
        }



    }
}
