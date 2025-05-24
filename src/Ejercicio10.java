public class Ejercicio10 {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        int sumaFila, sumaColumna;

        System.out.println("Introduce los elementos de la matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = new java.util.Scanner(System.in).nextInt();
            }
        }

        System.out.println("
Suma de filas:");
        for (int i = 0; i < 5; i++) {
            sumaFila = 0;
            for (int j = 0; j < 5; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de fila " + (i + 1) + ": " + sumaFila);
        }

        System.out.println("
Suma de columnas:");
        for (int j = 0; j < 5; j++) {
            sumaColumna = 0;
            for (int i = 0; i < 5; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma de columna " + (j + 1) + ": " + sumaColumna);
        }
    }
}
