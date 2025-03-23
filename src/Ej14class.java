public class Ej14class {
    public static void main(String[] args) {
        for (int tabla = 5; tabla <= 50; tabla++) {
            System.out.println("Tabla de multipicar del "+tabla+" :");
            for (int j = 1; j <= 10; j++) {
                int resultado = tabla * j;
                System.out.println(tabla + " x " + j + " = " + resultado);
                
            }

            
        }
    }
}
