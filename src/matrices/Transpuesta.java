package matrices;

public class Transpuesta {
    
    public static void main(String[] args) {
        int[][] matriz = inicializarMatriz();
        imprimirMatriz("Matriz original", matriz);

        int[][] transpuesta = calcularTranspuesta(matriz);
        imprimirMatriz("Matriz transpuesta", transpuesta);
    }

    private static int[][] inicializarMatriz() {
        return new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
    }

    private static int[][] calcularTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }

    private static void imprimirMatriz(String titulo, int[][] matriz) {
        System.out.println(titulo + ":");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
        System.out.println();
    }
}