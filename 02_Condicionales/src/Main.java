import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        // Condicional simple: IF (si)
        // Si se cumple, mostraremos lo de dentro del if
        if (num2 > num1) {
            System.out.println("El numero 2 es mayor al numero 1 (if)");
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
        if (mateCebado == true) {
            System.out.println("El mate está listo para tomar (if mateCebado == true)");
        } else if (yerbaEnElMate) {
            System.out.println("La yerba está en el mate, pero tenés que cebar (matecebado == false | yerbaenelmate == true)");
        } else {
            System.out.println("Tenés que poner la yerba en el mate y cebar (matecebado y yerbaenelmate == false)");
        }

        // SWITCH: a partir de una condicion, multiples opciones
        int numeroDia = 5;
        String nombreDia;

        switch (numeroDia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("N° de Día no válido");
                break;
        }
        //tambien podriamos asignar y luego hacer fuera el sout pero es casi lo mismo,
        //en este caso no quiero asignar nada porque mi programa no lo necesita

        // TERNARIOS
        //decisiones basadas en una condicion en funcion si la condicion es
        //verdadera o falsa en una sola linea de codigo
        // var = (condicion) ? valor_si_verdadero : valor_si_falso;
        // se asigna uno u otro

        double promedio;
        String condicionFinal;

        // ingresar datos
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa el promedio del alumno: ");
        promedio = teclado.nextDouble();

        //Si el promedio ingresado es menor a 6 desaprueba, si es mayor o igual aprueba
        condicionFinal = promedio >= 6 ? "aprobado" : "desaprobado";
        System.out.println("El alumno esta " + condicionFinal);

        System.out.println();
        System.out.println();
        System.out.println();

        /*
        * EJERCICIO INTEGRADOR DE TODOS LOS TEMAS VISTOS HASTA EL MOMENTO
        *
        * Una despensa desea calcular sueldos de los empleados. Hay 3 categorias para los puestos
        * 1. Repositor, 2. Cajero y 3. Supervisor
        *
        * 1. Los repositores cobran 15890 + un bono del 10%
        * 2. Los cajeros cobran 25630,89 fijos
        * 3. Los supervisores cobran 35560,20 en bruto al cual se le descuenta un 11% en jubilación
        *
        * Calcular y mostrar en pantalla el tipo correspondiente de sueldo segun el empleado del que
        * se trate
         */

        // DEFINIR VARS
        double sueldo = 0;
        int categoria;

        System.out.println("###### problema de la unidad #####");
        System.out.println("Ingrese categoria del sueldo.");
        System.out.println("1. para repositor, 2. para cajero y 3. para supervisor");

        Scanner teclado2 = new Scanner(System.in);
        categoria = teclado2.nextInt();

        if (categoria == 1) {
            sueldo = 15890 + (15890 * 0.10);
            System.out.println("El sueldo del repositor es: " + sueldo);
        } else if (categoria == 2) {
            sueldo = 25630.89;
            System.out.println("El sueldo del cajero es: " + sueldo);
        } else if (categoria == 3) {
            sueldo = 35560.20 - (35560.20 * 0.11);
            System.out.println("El sueldo del supervisor es: " + sueldo);
        } else {
            System.out.println("Categoria de empleado no encontrada");
        }
        // PD: Para este problema tambien podemos utilizar un SWITCH.
        // tambien podriamos mostrar un solo mensaje en vez de 4 distintos:

//        if (categoria == 1 || categoria == 2 || categoria == 3) {
//            System.out.println("El sueldo de la categoria " + categoria + " es: " + sueldo);
//        } else {
//            System.out.println("La categoria no es valida");
//        }

        //podemos hacer si la categoria es mayor que 3 o menor que tambien, pero asi anda
    }
}