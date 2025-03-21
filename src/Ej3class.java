import java.util.Scanner;

public class Ej3class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo: ");
        int num = input.nextInt();

        if (num>9) {
            System.out.print("El numero tiene dos digitos");
        } else if (num<=9) {
            System.out.print("El numero tiene un digito");
        } {
                
        }

        input.close();


    }
    
}
