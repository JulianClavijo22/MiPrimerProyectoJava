import java.util.Scanner;

public class Ej8class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el numero de preguntas");
        int totalPre = input.nextInt();

        System.out.println("Ingrese el numero de pregunta correctas");
        int preCorrec = input.nextInt();

        

        double total = ((double) preCorrec/totalPre)*100;

        if (total >= 90) {
            System.out.println("Nivel maximo");
        
        } else if (total >= 75 && total <90 ) {
            System.out.println("Nivel regular");
        }else if (total>=50 && total <75) {
            System.out.println("Nivel medio");
        }else if (total < 50) {
            System.out.println("nivel minimo");
        } 
            
        }        
        }

    
        


    

