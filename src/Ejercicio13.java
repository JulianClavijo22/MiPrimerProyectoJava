import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];
        int[][] kms = new int[5][7];
        int[] total_kms = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el nombre del conductor " + (i + 1) + ": ");
            nombres[i] = sc.next();
            for (int j = 0; j < 7; j++) {
                System.out.print("Introduce los kilómetros conducidos por " + nombres[i] + " el día " + (j + 1) + ": ");
                kms[i][j] = sc.nextInt();
                total_kms[i] += kms[i][j];
            }
        }

        System.out.println("
Kilómetros totales de cada conductor:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nombres[i] + ": " + total_kms[i] + " km");
        }
    }
}
