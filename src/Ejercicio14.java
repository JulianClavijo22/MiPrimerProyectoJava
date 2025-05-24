import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float[] precios = new float[5];
        int[][] cantidades = new int[5][4];
        float[] recaudacionSucursal = new float[4];
        float recaudacionTotal = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el precio del artículo " + (i + 1) + ": ");
            precios[i] = sc.nextFloat();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Introduce la cantidad vendida del artículo " + (i + 1) + " en la sucursal " + (j + 1) + ": ");
                cantidades[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                recaudacionSucursal[j] += precios[i] * cantidades[i][j];
                recaudacionTotal += precios[i] * cantidades[i][j];
            }
        }

        System.out.println("
Recaudación total de cada sucursal:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Sucursal " + (i + 1) + ": " + recaudacionSucursal[i]);
        }
        System.out.println("Recaudación total de la empresa: " + recaudacionTotal);
    }
}
