import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];
        int suma = 0, maxima = 0, minima = 10;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce la nota " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
            suma += notas[i];
            if (notas[i] > maxima) maxima = notas[i];
            if (notas[i] < minima) minima = notas[i];
        }

        float media = suma / 5.0f;
        System.out.print("Notas: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println();
        System.out.println("Nota media: " + media);
        System.out.println("Nota más alta: " + maxima);
        System.out.println("Nota más baja: " + minima);
    }
}
