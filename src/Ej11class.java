import java.util.Scanner;

public class Ej11class {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        Scanner input = new Scanner(System.in);
        for ( int i = 1; i <= 10; i++) {
        System.out.println("Ingrese las notas " + i + ":");
        int nota =input.nextInt();
        if (nota>=7) {
            num1++;
        } else if (nota<7) {
            num2++;
        }    
        }
        System.out.println("El numero de estudiantes con notas superiores es: "+num1);
        System.out.println("El numero de estudiantes con notas inferiores es: "+num2);
        

        

        input.close();
        }
        


    }

