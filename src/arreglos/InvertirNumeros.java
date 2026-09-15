package arreglos;

import java.util.Random;

public class InvertirNumeros {

    private static final int CANTIDAD = 20;
    private static final int LIMITE_INFERIOR = 1;
    private static final int LIMITE_SUPERIOR = 9999;

    public static void main(String[] args) {
        int[] numeros = generarNumeros(CANTIDAD, LIMITE_INFERIOR, LIMITE_SUPERIOR);
        int[] invertidos = invertirArreglo(numeros);

        imprimirArreglo("Numeros originales", numeros);
        imprimirArreglo("Numeros invertidos", invertidos);
    }

    private static int[] generarNumeros(int cantidad, int inferior, int superior) {
        Random random = new Random();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(superior - inferior + 1) + inferior;
        }
        return numeros;
    }

    private static int[] invertirArreglo(int[] numeros) {
        int[] invertidos = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            invertidos[i] = invertirNumero(numeros[i]);
        }
        return invertidos;
    }

    private static int invertirNumero(int numero) {
        int invertido = 0;
        int resto = numero;
        while (resto != 0) {
            invertido = invertido * 10 + resto % 10;
            resto /= 10;
        }
        return invertido;
    }

    private static void imprimirArreglo(String titulo, int[] arreglo) {
        System.out.println(titulo + ":");
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
}
