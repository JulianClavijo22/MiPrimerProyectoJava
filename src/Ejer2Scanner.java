//realiza un programa que calcule el area de un circulo
import java.util.Scanner;

public class Ejer2Scanner {
    public static void main(String[] args) {
        double pi= 3.1416;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el radio del circulo: ");
        int radio = input.nextInt();
        double area = pi * radio * radio;
        System.out.println("El area del circulo es:" + area);
        

    }

    
}
