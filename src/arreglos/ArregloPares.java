package arreglos;

public class ArregloPares {

    private static final int CANTIDAD = 100;
    private static final int LINEA = 10;

    public static void main(String[] args) {
        int[] pares = generarPares(CANTIDAD);
        imprimirPares(pares);
        imprimirParesLineas(pares, LINEA);
    }

    private static int[] generarPares(int cantidad) {
        int[] pares = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            pares[i] = i*2;
        }
        return pares;
    }

    private static void imprimirPares(int[] arreglo) {
        System.out.println("Arreglo en una sola linea:");
        StringBuilder sb = new StringBuilder();
        for (int numero : arreglo) {
            sb.append(numero).append(" ");
        }
        System.out.println(sb.toString().trim());
        System.out.println();
    }

    private static void imprimirParesLineas(int[] arreglo, int numLineas) {
        System.out.println("Arreglo en " + numLineas + " lineas:");
        int porLinea = arreglo.length / numLineas;
        int indice = 0;
        for (int linea = 1; linea <= numLineas; linea++) {
            StringBuilder sb = new StringBuilder("Linea " + linea + ": ");
            for (int i = 0; i < porLinea && indice < arreglo.length; i++, indice++) {
                sb.append(arreglo[indice]).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }

}