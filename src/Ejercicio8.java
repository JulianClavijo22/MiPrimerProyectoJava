import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        int mayoresEdad = 0, edadMaxima = 0;
        String nombreMayor = "";

        System.out.print("Introduce el nombre del alumno (o * para finalizar): ");
        while (true) {
            nombre = sc.next();
            if (nombre.equals("*")) break;

            System.out.print("Introduce la edad de " + nombre + ": ");
            edad = sc.nextInt();

            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
                mayoresEdad++;
            }

            if (edad > edadMaxima) {
                edadMaxima = edad;
                nombreMayor = nombre;
            }
        }

        System.out.println("Alumnos mayores de edad: " + mayoresEdad);
        System.out.println("El alumno más mayor es " + nombreMayor + " con " + edadMaxima + " años.");
    }
}
