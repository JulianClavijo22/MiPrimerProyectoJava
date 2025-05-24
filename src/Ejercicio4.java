import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[10];
        int num, i = 0;

        while (i < 10) {
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
            if (num < 0) break;
            vector[i++] = num;
        }

        System.out.println("Elementos del vector:");
        for (int j = 0; j < i; j++) {
            System.out.print(vector[j] + " ");
        }
        System.out.println();
    }
}
