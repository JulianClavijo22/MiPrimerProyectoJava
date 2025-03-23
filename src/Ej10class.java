import java.util.Scanner;

public class Ej10class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese sueldo");
        int sueldo = input.nextInt();
        System.out.println("Ingrese su antiguedad");
        int ant = input.nextInt();

        double aum = ((double)(sueldo*0.20));
        double total = ((double)(aum+sueldo));

        double aum1 = ((double)(sueldo*0.05));
        double total1 = ((double)(aum1+sueldo));

        if (sueldo<500 && ant>=10) {
            System.out.println("Aumento del sueldo es " + aum + "y el sueldo total es: " + total );

        } else if (sueldo<500 && ant< 10) {
            System.out.println("Aumento del sueldo es "+aum1+" y el sueldo total es: "+total1 );
        }  
        input.close();
        }
        
        
    }

