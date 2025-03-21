import java.util.Scanner;

public class Ej4class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el sueldo");
        int sueldo = input.nextInt();

        if (sueldo>=3000) {
            System.out.println("Debe abonar impuestos");
        } else  {
            System.out.println("No debe abonar impuesto");
               
        }
        input.close();

    }
}
