import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] equipos = new String[15][2];
        int[][] resultados = new int[15][2];

        for (int i = 0; i < 15; i++) {
            System.out.print("Introduce el nombre del equipo 1 para el partido " + (i + 1) + ": ");
            equipos[i][0] = sc.next();
            System.out.print("Introduce el nombre del equipo 2 para el partido " + (i + 1) + ": ");
            equipos[i][1] = sc.next();

            System.out.print("Introduce el resultado del partido " + (i + 1) + " (goles equipo 1 - goles equipo 2): ");
            resultados[i][0] = sc.nextInt();
            resultados[i][1] = sc.nextInt();
        }

        System.out.println("
Quiniela:");
        for (int i = 0; i < 15; i++) {
            System.out.println(equipos[i][0] + " vs " + equipos[i][1] + ": " + resultados[i][0] + "-" + resultados[i][1]);
        }
    }
}
