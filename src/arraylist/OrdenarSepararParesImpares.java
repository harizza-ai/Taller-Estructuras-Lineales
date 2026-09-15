package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OrdenarSepararParesImpares {
    
    private static final int CANTIDAD = 20;
    private static final int LIMITE_INFERIOR = 1;
    private static final int LIMITE_SUPERIOR = 100;

    public static void main(String[] args) {
        ArrayList<Integer> numeros = generarNumeros(CANTIDAD, LIMITE_INFERIOR, LIMITE_SUPERIOR);
        imprimirLista("Lista original", numeros);

        ArrayList<Integer> ascendente = new ArrayList<>(numeros);
        Collections.sort(ascendente);
        imprimirLista("Lista ordenada ascendente", ascendente);

        ArrayList<Integer> descendente = new ArrayList<>(numeros);
        descendente.sort(Collections.reverseOrder());
        imprimirLista("Lista ordenada descendente", descendente);

        ArrayList<Integer> pares = filtrarPares(numeros);
        ArrayList<Integer> impares = filtrarImpares(numeros);
        imprimirLista("Numeros pares", pares);
        imprimirLista("Numeros impares", impares);
    }

    private static ArrayList<Integer> generarNumeros(int cantidad, int inferior, int superior) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            numeros.add(random.nextInt(superior - inferior + 1) + inferior);
        }
        return numeros;
    }

    private static ArrayList<Integer> filtrarPares(ArrayList<Integer> numeros) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }
        return pares;
    }

    private static ArrayList<Integer> filtrarImpares(ArrayList<Integer> numeros) {
        ArrayList<Integer> impares = new ArrayList<>();
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                impares.add(numero);
            }
        }
        return impares;
    }

    private static void imprimirLista(String titulo, ArrayList<Integer> lista) {
        System.out.println(titulo + ": " + lista);
    }
}