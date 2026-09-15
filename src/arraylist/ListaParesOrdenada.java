package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaParesOrdenada {
    
    private static final int CANTIDAD = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> pares = generarPares(CANTIDAD);
        imprimirLista(pares);

        System.out.print("Ingrese un numero a insertar en orden: ");
        int numeroInsertar = sc.nextInt();
        insertarOrdenado(pares, numeroInsertar);
        imprimirLista(pares);

        System.out.print("Ingrese un valor a eliminar de la lista: ");
        int numeroEliminar = sc.nextInt();
        boolean eliminado = pares.remove(Integer.valueOf(numeroEliminar));
        if (!eliminado) {
            System.out.println("El valor " + numeroEliminar + " no se encontraba en la lista.");
        }
        imprimirLista(pares);

        sc.close();
    }

    private static ArrayList<Integer> generarPares(int cantidad) {
        ArrayList<Integer> pares = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            pares.add(i * 2);
        }
        return pares;
    }

    private static void insertarOrdenado(ArrayList<Integer> lista, int numero) {
        int posicion = 0;
        while (posicion < lista.size() && lista.get(posicion) < numero) {
            posicion++;
        }
        lista.add(posicion, numero);
    }

    private static void imprimirLista(ArrayList<Integer> lista) {
        System.out.println("Lista actual: " + lista);
    }   
}
