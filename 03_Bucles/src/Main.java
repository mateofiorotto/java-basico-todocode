public class Main {
    public static void main(String[] args) {

        // ESTRUCTURAS REPETITIVAS - BUCLES

        // WHILE
        // Ejecutar bloque de codigo mientras se cumpla una condicion.
        // la conidcion se evalua al inicio del bucle
        // si es valida, ingresa al bucle, cuando deja de cumplirse sale del bucle
        //puede controlarse x centinela o contador
        int cont = 0;

        while (cont <= 5) {
            System.out.println("BUCLE WHILE - Esta es la vuelta: " + cont);
            cont++; // Si no sumariamos el contador en cada bucle, entrariamos en un bucle infinito
        }

        System.out.println();

        // FOR
        // usado principalmente para matrices/vectores
        // Se compone por la inicializacion de la variable que usaremos en la condicion,
        // condicion de fin de ciclo y modificacion de la variable (el contador)
        // solo funciona con un contador
        for (int i = 0 ; i <= 5 ; i++) {
            System.out.println("BUCLE FOR - Esta es la vuelta: " + i);
        }


    }
}