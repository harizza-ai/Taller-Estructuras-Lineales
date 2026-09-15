package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ListaHastaDiez {
    
    private static final int LIMITE_INFERIOR = -10;
    private static final int LIMITE_SUPERIOR = 10;
    private static final int VALOR_CENTINELA = 10;

    public static void main(String[] args) {
        ArrayList<Integer> numeros = generarNumerosHastaDiez();

        imprimirLista(numeros);
        System.out.println("Suma: " + calcularSuma(numeros));
        System.out.println("Media: " + calcularMedia(numeros));
    }

    private static ArrayList<Integer> generarNumerosHastaDiez() {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        int numero;
        do {
            numero = random.nextInt(LIMITE_SUPERIOR - LIMITE_INFERIOR + 1) + LIMITE_INFERIOR;
            numeros.add(numero);
        } while (numero != VALOR_CENTINELA);
        return numeros;
    }

    private static int calcularSuma(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    private static double calcularMedia(ArrayList<Integer> numeros) {
        return (double) calcularSuma(numeros) / numeros.size();
    }

    private static void imprimirLista(ArrayList<Integer> numeros) {
        System.out.println("Numeros leídos: " + numeros);
    }
}
