import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // EJERCICIO
        /*
        * Programar una solucion que incluya un vector que almacene nombres. Cargar los datos y otro
        * para mostrarlos
        *
        * */

        // Variables
        String nombres[] = new String[3];
        Scanner teclado = new Scanner(System.in);

        //asignacion manual (opcional)
//        nombres[0] = "Mateo";
//        nombres[1] = "Lucas";
//        nombres[2] = "Tomas";

        // Carga
        for (int i = 0; i < nombres.length ; i++) {
            System.out.print("Ingrese nombre: ");
            nombres[i] = teclado.next();
        }

        // Recorrida
        for (int i = 0; i < nombres.length ; i++) {
            System.out.println("En la posición: " + i + ", se encuentra el nombre: " + nombres[i]);
        }
    }
}
