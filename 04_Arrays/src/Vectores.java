import java.util.Scanner;

public class Vectores {
    public static void main(String[] args) {

        // VECTORES: Declaracion y asignacion
        // Conjunto de datos que se almacenan con el mismo nombre, pero distinto numero
        // Mantienen su tamaño
        // Hay unidimensionales: unicamente filas o columna, los vectores
        // Bidimensionales: matrices (varias filas y columnas)

        // Declarar
        int vector[] = new int [4]; // 4 posiciones: 0, 1, 2, 3

        // Asignar manualmente
//        vector[0] = 2; // Posicion 1 - indice 0 : num 2
//        vector[1] = 35;
//        vector[2] = 5;
//        vector[3] = 1;

        //Carga
        Scanner cargar = new Scanner(System.in);

        for (int i = 0 ; i < vector.length ; i++){
            System.out.println("Ingresa el valor para el indice " + i);
            vector[i] = cargar.nextInt();
        }
        //recorrido
        for (int i = 0 ; i < vector.length ; i++){
            System.out.println("Posicion " + i + ": " + vector[i]);
            System.out.println("------------------");
        }


    }
}