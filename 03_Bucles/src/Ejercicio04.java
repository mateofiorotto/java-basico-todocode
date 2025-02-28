import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
         /*En la ciudad de oberá, misiones, se realiza año a año una maraton. El evento cuenta con
           un dia de inscripciones el dia anterior a la carrera, por lo que se desconoce la cantidad exacta
           de inscriptos que pueda llegar a haber.
           Desde la federacion, solicitan los siguientes datos para la inscripcion de cada participante
           DNI, nombre y edad.

           En cuanto a las categorias posibles para una inscripcion se manejan:
           - Menores A (6 a 10 años)
           - Menores B (11 a 17 años)
           - Juveniles (de 18 a 30 años)
           - Adultos  (de 31 a 50 años)
           - Adultos Mayores (mayores a 50 años)

           Se necesita un programa que a partir del ingreso de datos de cada participante se muestre
           x pantalla a que categoria debe estar inscrito. Cabe destacar que al finalizar el dia,
           para finalizar las inscripciones se debe ingresar un dni con valor 0 o un nombre con la palabra
           fin
        */

        String categoria = "";

        //ingrese DNI
        System.out.print("Ingrese su DNI (en caso de ser 0, la inscripcion se cierra): ");
        Scanner tecladoDNI = new Scanner(System.in);
        String DNI = tecladoDNI.next();

        //Ingrese nombre
        System.out.print("Ingrese su nombre (en caso de ser fin, la inscripcion se cierra): ");
        Scanner tecladoNombre = new Scanner(System.in);
        String nombre = tecladoNombre.next();

        //ingrese edad
        System.out.print("Ingrese su edad: ");
        Scanner tecladoEdad = new Scanner(System.in);
        int edad = tecladoEdad.nextInt();

        // si una es V y la otra F entra igual por la tabla de verdad del OR
        while ((!DNI.equals("0")) && ((!nombre.equalsIgnoreCase("fin")))){

            if (edad < 6 || edad > 100) {
                categoria = "No puede participar";
            } else if (edad >= 6 && edad<=10){
                categoria = "Menores A";
            } else if (edad >= 11 && edad<=17) {
                categoria = "Menores B";
            } else if (edad >= 18 && edad<=30) {
                categoria = "Juveniles";
            } else if (edad >= 31 && edad<=50) {
                categoria = "Adulto";
            } else if (edad > 50) {
                categoria = "Adulto Mayor";
            }

            System.out.println("###############################");
            System.out.println("El nombre del participante es: " + nombre);
            System.out.println("La edad del participante es: " + edad);
            System.out.println("El dni del participante es: " + DNI);
            System.out.println("Pertenece a la CATEGORIA: " + categoria);
            System.out.println("###############################");
            System.out.println();

            System.out.print("Ingrese su DNI (en caso de ser 0, la inscripcion se cierra): ");
            DNI = tecladoDNI.next();

            System.out.print("Ingrese su nombre (en caso de ser fin, la inscripcion se cierra): ");
            nombre = tecladoNombre.next();

            System.out.print("Ingrese su edad: ");
            edad = tecladoEdad.nextInt();



        }
    }
}
