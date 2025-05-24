import java.util.Random;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] vector = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            vector[i] = rand.nextInt(100);
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }

        System.out.println("Vector ordenado:");
        for (int i = 0; i < 10; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
}
