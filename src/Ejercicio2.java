import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vector_cadenas = new String[5];
        String[] vector_invertido = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce una cadena: ");
            vector_cadenas[i] = sc.next();
        }

        for (int i = 0; i < 5; i++) {
            vector_invertido[i] = vector_cadenas[4 - i];
        }

        System.out.println("Vector invertido:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vector_invertido[i]);
        }
    }
}
