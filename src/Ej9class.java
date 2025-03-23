import java.util.Scanner;

public class Ej9class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la primera nota: ");
        int not1 = input.nextInt();

        System.out.print("Ingrese la segunda nota: ");
        int not2 = input.nextInt();

        System.out.print("Ingrese la tercera nota: ");
        int not3 = input.nextInt();

        int prom = ((not1+not2+not3)/3);

        if (prom>=7) {
            System.out.println("Promocionado");
        } else {
        System.out.print("No promocionado");
        } else if (prom>=4 && prom<7) {
            System.out.println("Regular");
        }    
        }

        input.close();



        
    }
}