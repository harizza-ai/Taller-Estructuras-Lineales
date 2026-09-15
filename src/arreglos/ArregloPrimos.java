package arreglos;

public class ArregloPrimos {

    public static void main(String[] args) {
        int[] primos = inicializarPrimos();
        imprimirArreglo(primos);
    }

    private static int[] inicializarPrimos() {
        return new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
    }

    private static void imprimirArreglo(int[] arreglo) {
        System.out.println("Los Primero 10 numeros primos son:");
        for (int numero : arreglo){
            System.out.print(numero + " ");
        }
        System.out.println();
    }
}