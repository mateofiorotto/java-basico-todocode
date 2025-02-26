public class Main {
    public static void main(String[] args) {
        // TIPOS DE DATOS

        // Enteros, decimales
        int num1 = 10;
        System.out.println("Entero: " + num1);

        double num2 = 3.5;
        System.out.println("Doble: " + num2);

        long numLargo = 983483483;
        System.out.println("Long (largo): " + numLargo);

        // Booleanos
        boolean verdadero = true;
        System.out.println("verdadero?: " + verdadero);

        boolean falso = false;
        System.out.println("falso?: " + falso);

        // Caracteres, textos
        char letra = 'a';
        System.out.println("Mi letra es: " + letra);

        String texto = "hola";
        System.out.println("Mi texto es: " + texto);

        // Hay otros como short, byte, etc pero que no se usan mucho

        //CONSTANTES
        // se escriben con final al principio
        final int IVA = 21;
        System.out.println("Constante del iva en ARG: " + IVA);

        //OPERADORES ARITMETICOS
        int rta;
        //Suma, resta, división y multiplicación

        // Suma
        rta = num1 + 5;
        System.out.println("Suma (num1 + 5): " + rta);

        // Resta
        rta = num1 - 5;
        System.out.println("Resta (num1 - 5): " + rta);

        // División
        rta = num1 / 5;
        System.out.println("División (num1 / 5): " + rta);

        // Multiplicación
        rta = num1 * 5;
        System.out.println("Multiplicación (num1 * 5): " + rta);

        // Esos son solo aritmeticos, luego existen relacionales:
        // == (= =)     --> Equivale a
        // <, >         --> Menor, Mayor
        // <=, >= (< =) --> Menor o igual, Mayor o igual
        // != (! =)     --> Distinto

        // Y también condicionales:
        // && (AND / y)
        // || (OR / o)
        // ! (NOT / negación)

        /*
        * EJERCICIO 1:
        * Realizar un programa que permita intercambiar dos variables, ejemplo:
        * si una variable vale 35 y la otra 20, realizar acciones para que el primero valga 20
        * y el segundo 35. Mostrar el resultado.
        * */
        System.out.println("");
        System.out.println("");
        System.out.println("");
        int primerNumero = 35;
        int segundoNumero = 20;
        int aux;

        System.out.println("Valor original de primerNumero: " + primerNumero + ", Valor original de segundoNumero: " + segundoNumero);

        aux = segundoNumero; //Ahora vale 20
        segundoNumero = primerNumero; // ahora segundonum = 35 (antes 20)
        primerNumero = aux; // primer numero toma el valor de 20 e intercambiamos

        //mostrar
        System.out.println("Valor intercambiado de primerNumero: " + primerNumero + ", Valor intercambiado de segundoNumero: " + segundoNumero);

    }
}