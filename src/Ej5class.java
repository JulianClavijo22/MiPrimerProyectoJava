import java.util.Scanner;

public class Ej5class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        int num1 = input.nextInt();

        System.out.println("Ingrese el segundo numero");
        int num2 = input.nextInt();

        if (num1>num2) {
            System.out.println(num1 + " es mayor");
        } else {
            System.out.println( num2 + " es mayor");    
            
        }
        
        input.close();



        
    }
}
