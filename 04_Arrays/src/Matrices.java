import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        //MATRICES
        // Son vectores bidimensionales, con filas y columnas

        // Declaración
        int matriz[][] = new int[2][2]; // primero cantidad de filas (horizontales) y segundo columnas (verticales)

        //Asignacion manual
//        matriz[0][0] = 5; //Fila 0, columna 0
//        matriz[0][1] = 15; //Fila 0, columna 1
//        matriz[1][1] = 10; //Fila 1, columna 2
        Scanner cargarMatriz = new Scanner(System.in);

        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 2; c++) {
                System.out.println("Carga el valor para la fila " + f + ", columna " + c);
                matriz[f][c] = cargarMatriz.nextInt();
            }
        }

        //recorrido (no hacerlo con .length ya que si no es cuadrada no funcionaria)
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 2; c++) {
                System.out.print("| F" + f + ", C" + c + " | ");
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}
