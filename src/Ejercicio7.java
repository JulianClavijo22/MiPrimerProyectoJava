import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el valor para el vector1[" + i + "]: ");
            vector1[i] = sc.nextInt();
            System.out.print("Introduce el valor para el vector2[" + i + "]: ");
            vector2[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }

        System.out.print("Resultado de la suma (vector3): ");
        for (int i = 0; i < 5; i++) {
            System.out.print(vector3[i] + " ");
        }
        System.out.println();
    }
}
