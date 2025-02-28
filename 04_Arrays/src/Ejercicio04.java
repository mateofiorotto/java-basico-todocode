public class Ejercicio04 {
    public static void main(String[] args) {
        // Ejercicio 04
        // Rellenar una matriz y mostrar por consola

        //Variable
        int matriz[][] = new int[4][5];

        //relleno
        for (int f = 0 ; f <  4 ; f++) {
            for (int c = 0 ; c <  5 ; c++) {
                matriz[f][c] = 1;
            }
        }

        //mostrar
        for (int f = 0 ; f <  4 ; f++) {
            for (int c = 0 ; c <  5 ; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}
