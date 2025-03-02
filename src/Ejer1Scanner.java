//Realiza un programa que pida dos números enteros y que luego muestre la suma de los dos.
import java.util.Scanner;

public class Ejer1Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un número entero: ");
        int num1 = input.nextInt();
        System.out.println("Ingresa un número entero: ");
        int num2 = input.nextInt();
        int suma = num1 * num2;
        System.out.println("La suma de los dos numeros es: " + suma);
        input.close();
    }
   
}
