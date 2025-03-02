//Realiza un programa en el que se pida al usuario tres números enteros y que luego muestre el promedio de los tres números.
import java.util.Scanner;
public class Ejer5Scanner {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa el primer numero: ");
        int num1 = input.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int num2 = input.nextInt();
        System.out.println("Ingresa el tercer numero: ");
        int num3 = input.nextInt();
        int promedio = (num1 + num2 + num3) / 3;
        System.out.println("El promedio de los tres numeros es: " + promedio);
        input.close();
    }
}
