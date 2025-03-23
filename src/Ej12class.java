import java.util.Scanner;

public class Ej12class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese cantidad de trabajadores");
        int n = input.nextInt();
        int num1 = 0;
        int num2 = 0;
        for(int i=0; i < n; i++){
            System.out.println("Ingrese el sueldo");
            int sueldo = input.nextInt();
            if (sueldo>=100 && sueldo<=300) {
                num1++;
            } else if (sueldo>300) {
                num2++;
            }    
            
        }

        System.out.println("Empleados que ganan entre 100 y 300: "+num1);
        System.out.println("Empleados que ganan mas de 300: " + num2);
        input.close();
        

    }
}
