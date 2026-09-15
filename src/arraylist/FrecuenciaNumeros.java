package arraylist;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeMap;

public class FrecuenciaNumeros {
    
    private static final int CANTIDAD = 100;
    private static final int LIMITE_INFERIOR = 1;
    private static final int LIMITE_SUPERIOR = 20;

    public static void main(String[] args) {
        ArrayList<Integer> numeros = generarNumeros(CANTIDAD, LIMITE_INFERIOR, LIMITE_SUPERIOR);
        TreeMap<Integer, Integer> frecuencias = calcularFrecuencias(numeros);

        imprimirTablaFrecuencias(frecuencias);
        imprimirNumeroMasFrecuente(frecuencias);
    }

    private static ArrayList<Integer> generarNumeros(int cantidad, int inferior, int superior) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            numeros.add(random.nextInt(superior - inferior + 1) + inferior);
        }
        return numeros;
    }

    private static TreeMap<Integer, Integer> calcularFrecuencias(ArrayList<Integer> numeros) {
        TreeMap<Integer, Integer> frecuencias = new TreeMap<>();
        for (int numero : numeros) {
            frecuencias.merge(numero, 1, Integer::sum);
        }
        return frecuencias;
    }

    private static void imprimirTablaFrecuencias(TreeMap<Integer, Integer> frecuencias) {
        System.out.println("Numero\tFrecuencia");
        for (var entrada : frecuencias.entrySet()) {
            System.out.println(entrada.getKey() + "\t" + entrada.getValue());
        }
    }

    private static void imprimirNumeroMasFrecuente(TreeMap<Integer, Integer> frecuencias) {
        int numeroMasFrecuente = -1;
        int mayorFrecuencia = -1;
        for (var entrada : frecuencias.entrySet()) {
            if (entrada.getValue() > mayorFrecuencia) {
                mayorFrecuencia = entrada.getValue();
                numeroMasFrecuente = entrada.getKey();
            }
        }
        System.out.println("El numero que más se repite es " + numeroMasFrecuente
                + " con " + mayorFrecuencia + " apariciones.");
    }
    
}
