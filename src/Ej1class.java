import java.util.Scanner;

public class Ej1class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un número entero: ");
        int num1 = input.nextInt();
        System.out.println("Ingresa un número entero: ");
        int num2 = input.nextInt();

        if (num1>num2) {
            System.out.println("la suma es: " + (int) (num1 + num2));
            System.out.println("La diferencia es: " + (int) (num1-num2));
        } else {
            System.out.println("EL producto es: " + (int) (num1*num2));
            System.out.println("La division es: " + (int) (num1/num2));   


            
        }

        input.close();
        
    }
}
