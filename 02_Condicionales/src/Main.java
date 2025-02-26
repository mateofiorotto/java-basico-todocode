public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        // Condicional simple: IF (si)
        // Si se cumple, mostraremos lo de dentro del if
        if (num2 > num1) {
            System.out.println("El numero 2 es mayor al numero 1");
        }

        // Condicional simple: IF - ELSE (SI - SI NO)
        boolean permiso = false;

        if (permiso == true) {
            System.out.println("Tengo permiso (bool true - if)");
        } else {
            System.out.println("No tengo permiso (bool false - else)");
        }

        // Condicionales anidados (multiple): IF ELSE + IF ELSE
        boolean mateCebado = false;
        boolean yerbaEnElMate = false;

        // podemos solo poner if (matecebado) en caso de negarlo seria !matecebado
        if (mateCebado) {
            System.out.println("El mate está listo para tomar");
        } else if (yerbaEnElMate) {
            System.out.println("La yerba está en el mate, pero tenés que cebar");
        } else {
            System.out.println("Tenés que poner la yerba en el mate y cebar");
        }

        // SWITCH: a partir de una condicion, multiples opciones
        String nombrePersona = "Pedro";
        switch (nombrePersona) {
            case "Mateo"
        }

    }
}