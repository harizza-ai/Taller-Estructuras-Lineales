package arreglos;

import java.util.Random;
import java.util.Scanner;

public class Factoriales {

    private static final int LIMITE_INFERIOR = 1;
    private static final int LIMITE_SUPERIOR = 12;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a generar : ");
        int n = sc.nextInt();

        int[] numeros = generarNumeros(n);
        long[] factoriales = calcularFactoriales(numeros);

        imprimirArreglo("Números generados", numeros);
        imprimirArreglo("Factoriales del numero", factoriales);

        sc.close();
    }

    private static int[] generarNumeros(int n) {
        Random random = new Random();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = random.nextInt(LIMITE_SUPERIOR - LIMITE_INFERIOR + 1) + LIMITE_INFERIOR;
        }
        return numeros;
    }

    private static long[] calcularFactoriales(int[] numeros) {
        long[] factoriales = new long[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = factorial(numeros[i]);
        }
        return factoriales;
    }

    private static long factorial(int numero) {
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    private static void imprimirArreglo(String titulo, int[] arreglo) {
        System.out.println(titulo + ":");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }

    private static void imprimirArreglo(String titulo, long[] arreglo) {
        System.out.println(titulo + ":");
        for (long valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
