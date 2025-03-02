//Realizar un programa que pida un número entero y que muestre si el número es par o impar. 
import java.util.Scanner;
public class Ejer4Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        System.out.println("Ingresa un numero entero:");
        int num = input.nextInt();
        if (num % 2 == 0) {
        System.out.println("El numero es par");
        } else {
            System.out.print("El numero es impar");
        }    
        input.close();
    }
    

}
