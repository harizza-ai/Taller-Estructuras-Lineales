package arreglos;

import java.util.Random;

public class MinMax {
    
    private static final int CANTIDAD = 25;
    private static final int LIMITE_INFERIOR = -50;
    private static final int LIMITE_SUPERIOR = 50;

    public static void main(String[] args) {
        int[] numeros = generarNumeros(CANTIDAD, LIMITE_INFERIOR, LIMITE_SUPERIOR);
        imprimirArreglo(numeros);

        int menor = encontrarMenor(numeros);
        int mayor = encontrarMayor(numeros);

        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero mayor es: " + mayor);
    }

    private static int[] generarNumeros(int cantidad, int inferior, int superior) {
        Random random = new Random();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(superior - inferior + 1) + inferior;
        }
        return numeros;
    }

    private static int encontrarMenor(int[] numeros) {
        int menor = numeros[0];
        for (int numero : numeros) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }

    private static int encontrarMayor(int[] numeros) {
        int mayor = numeros[0];
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }

    private static void imprimirArreglo(int[] arreglo) {
        System.out.println("Numeros generados:");
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}
