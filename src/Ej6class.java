import java.util.Scanner;

public class Ej6class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa un numero entero");
        int num = input.nextInt();

        if (num>0) {
            System.out.println("El numero es positivo");
        } else if (num<0) {
            System.out.println("El numero es negativo");
        } else if (num==0) {
            System.out.println("El numero es nulo");
            
        }
        
        
        input.close(); 

        
        
    }
}
