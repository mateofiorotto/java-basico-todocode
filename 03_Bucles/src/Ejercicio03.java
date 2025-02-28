import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        // Realizar un programa que muestre en pantalla palabras ingresadas por teclado hasta que se
        // ingrese la palabra "salir".

        //Definimos vars: FORMA CON 2 VARS
//        String palabra = "";
//        String continuarOSalir = "";
//
//        //bucle
//        while (!continuarOSalir.equals("salir")) {
//
//            //palabra
//            System.out.print("Ingrese una palabra: ");
//            Scanner tecladoPalabra = new Scanner(System.in);
//            palabra = tecladoPalabra.nextLine();
//            System.out.println("La palabra ingresada fue: " + palabra);
//
//            // salir o no
//            System.out.println("Si quiere salir escriba 'salir', si no, da enter o escribe otra cosa");
//            Scanner tecladoSalir = new Scanner(System.in);
//            continuarOSalir = tecladoSalir.nextLine();
//            System.out.println(continuarOSalir);
//
//
//        }

        // FORMA SENCILLA:
        System.out.println("Ingrese una palabra. Para salir, ingrese 'salir'");
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.next();

        while(!palabra.equals("salir")){
            System.out.println("Palabra ingresada: " + palabra);
            System.out.println("Ingrese otra o digite 'salir': ");
            palabra = teclado.next();
        }

    }
}
