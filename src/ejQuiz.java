import java.util.Scanner;

public class ejQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        System.out.println("El numero es: ");
        for (int k = 1; k <= num; k++) {
            for (int j = 1; j <= k; j++) { 
                System.out.print(j);
            }
            if (k % 2 == 1) { 
                System.out.print(k);
            } else {
                System.out.print(k * -1);
            }
            System.out.println(); 
        }
        input.close();
    }
}
