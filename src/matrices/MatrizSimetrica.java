package matrices;

import java.util.Random;
import java.util.Scanner;

public class MatrizSimetrica {
    
    private static final int LIMITE_INFERIOR = 0;
    private static final int LIMITE_SUPERIOR = 9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño n de la matriz (n x n): ");
        int n = sc.nextInt();

        int[][] matriz = generarMatriz(n, LIMITE_INFERIOR, LIMITE_SUPERIOR);
        imprimirMatriz(matriz);

        if (esSimetrica(matriz)) {
            System.out.println("La matriz SÍ es simétrica.");
        } else {
            System.out.println("La matriz NO es simétrica.");
        }

        imprimirEsquinas(matriz);

        sc.close();
    }

    private static int[][] generarMatriz(int n, int inferior, int superior) {
        Random random = new Random();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(superior - inferior + 1) + inferior;
            }
        }
        return matriz;
    }

    private static boolean esSimetrica(int[][] matriz) {
        int n = matriz.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static void imprimirEsquinas(int[][] matriz) {
        int n = matriz.length;
        System.out.println("Esquinas de la matriz:");
        System.out.println("Superior izquierda: " + matriz[0][0]);
        System.out.println("Superior derecha: " + matriz[0][n - 1]);
        System.out.println("Inferior izquierda: " + matriz[n - 1][0]);
        System.out.println("Inferior derecha: " + matriz[n - 1][n - 1]);
    }

    private static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%4d", valor);
            }
            System.out.println();
        }
    }
}
