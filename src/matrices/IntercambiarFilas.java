package matrices;

import java.util.Random;
import java.util.Scanner;

public class IntercambiarFilas {
    
    private static final int LIMITE_INFERIOR = 0;
    private static final int LIMITE_SUPERIOR = 99;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas (m): ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int columnas = sc.nextInt();

        int[][] matriz = generarMatriz(filas, columnas, LIMITE_INFERIOR, LIMITE_SUPERIOR);
        imprimirMatriz("Matriz original", matriz);

        intercambiarFilas(matriz, 0, 1);
        imprimirMatriz("Matriz con la fila 1 y 2 intercambiadas", matriz);

        sc.close();
    }

    private static int[][] generarMatriz(int filas, int columnas, int inferior, int superior) {
        Random random = new Random();
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(superior - inferior + 1) + inferior;
            }
        }
        return matriz;
    }

    private static void intercambiarFilas(int[][] matriz, int filaA, int filaB) {
        if (matriz.length <= Math.max(filaA, filaB)) {
            System.out.println("La matriz no tiene suficientes filas para intercambiar.");
            return;
        }
        int[] temporal = matriz[filaA];
        matriz[filaA] = matriz[filaB];
        matriz[filaB] = temporal;
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
