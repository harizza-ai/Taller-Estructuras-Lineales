package matrices;

import java.util.Random;
import java.util.Scanner;

public class DiagonalSecundaria {
    
    private static final int LIMITE_INFERIOR = -50;
    private static final int LIMITE_SUPERIOR = 50;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño n de la matriz (n x n): ");
        int n = sc.nextInt();

        int[][] matriz = generarMatriz(n, LIMITE_INFERIOR, LIMITE_SUPERIOR);
        imprimirMatriz(matriz);

        int suma = sumarDiagonalSecundaria(matriz);
        System.out.println("La suma de la diagonal secundaria es: " + suma);

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

    private static int sumarDiagonalSecundaria(int[][] matriz) {
        int n = matriz.length;
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }
        return suma;
    }

    private static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz generada:");
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.printf("%5d", valor);
            }
            System.out.println();
        }
    }
}
