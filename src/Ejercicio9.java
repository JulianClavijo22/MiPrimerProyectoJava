import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] minTemp = new int[5];
        int[] maxTemp = new int[5];
        int sumaTemperaturas = 0;
        int diaMinimo = 0, minTempDia = 100, diaMaximo = 0, maxTempDia = -100;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce la temperatura mínima del día " + (i + 1) + ": ");
            minTemp[i] = sc.nextInt();
            System.out.print("Introduce la temperatura máxima del día " + (i + 1) + ": ");
            maxTemp[i] = sc.nextInt();

            sumaTemperaturas += (minTemp[i] + maxTemp[i]);

            if (minTemp[i] < minTempDia) {
                minTempDia = minTemp[i];
                diaMinimo = i + 1;
            }

            if (maxTemp[i] > maxTempDia) {
                maxTempDia = maxTemp[i];
                diaMaximo = i + 1;
            }
        }

        System.out.println("Temperatura media: " + (sumaTemperaturas / 10.0));
        System.out.println("El día con menor temperatura fue el día " + diaMinimo + " con " + minTempDia + " grados.");
        System.out.println("El día con mayor temperatura fue el día " + diaMaximo + " con " + maxTempDia + " grados.");
    }
}
