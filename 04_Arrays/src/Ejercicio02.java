import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {

        // EJERCICIO 2
        /*
         * En una tabla de 4 Filas y 4 columnas se guardan las notas de 4 alumnos de secundaria.
         * Cada fila corresponde a las notas y promedio de cada alumno.
         * Se necesita un programa que permita al profesor cargar en las 3 posiciones (columnas) de cada
         * fila, las notas del alumno y que en la ultima se calculen los promedios. Una vez realizado los
         * calculos, mostrar las 3 notas de cada alumno y el promedio correspondiente
         * */

        //Vars
        double notas[][] = new double[4][4];
        Scanner teclado = new Scanner(System.in);
        double suma = 0.0;

        //Pedir notas - cargar
        //CARGAMOS HASTA 3 cols PARA ASI NO CARGAR EL PROMEDIO
        for (int f = 0 ; f < 4 ; f++) {
            for (int c = 0 ; c < 3 ; c++) {
                System.out.print("Ingrese nota " + (c+1) + " del alumno " + (f+1) + ": ");
                notas[f][c] = teclado.nextDouble();

                suma += notas[f][c];
            }
            notas[f][3] = (suma / 3);

            suma = 0;
            System.out.println();
        }

        //recorrer
        for (int f = 0 ; f < 4 ; f++) {
            System.out.print("Notas del alumno " + (f+1) + ": ");
            for (int c = 0 ; c < 3 ; c++) {
                System.out.print(notas[f][c] + ", ");
            }
            System.out.println("Su promedio es: " + notas[f][3]);
            System.out.println();
        }


    }
}
