import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] nombres = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        System.out.print("Introduce el número de mes (1-12): ");
        mes = sc.nextInt();

        if (mes >= 1 && mes <= 12) {
            System.out.println("El mes de " + nombres[mes - 1] + " tiene " + dias[mes - 1] + " días.");
        } else {
            System.out.println("Mes inválido.");
        }
    }
}
