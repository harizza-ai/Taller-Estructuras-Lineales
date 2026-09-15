package matrices;

import java.util.Random;
import java.util.Scanner;

public class BuscarEnMatriz {
    
    private static final int LIMITE_INFERIOR = 0;
    private static final int LIMITE_SUPERIOR = 99;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el número de filas (m): ");
        int filas = sc.nextInt();
        System.out.print("Ingrese el número de columnas (n): ");
        int columnas = sc.nextInt();

        int[][] matriz = generarMatriz(filas, columnas, LIMITE_INFERIOR, LIMITE_SUPERIOR);
        imprimirMatriz(matriz);

        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscado = sc.nextInt();
        buscarNumero(matriz, numeroBuscado);

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

    private static void buscarNumero(int[][] matriz, int numero) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    System.out.println("El número " + numero + " se encontró en la posición ["
                            + i + "][" + j + "].");
                    return;
                }
            }
        }
        System.out.println("El número " + numero + " no se encontró en la matriz.");
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
