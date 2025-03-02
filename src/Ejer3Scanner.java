// Realiza un programa que convierta de grados Celsius a grados Fahrenheit.
import java.util.Scanner;
public class Ejer3Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
        input.close();
    }
    
}
