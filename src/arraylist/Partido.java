package arraylist;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Partido {

    private static  final String NOMBREFICHERO= "/home/harzzld/Proyectos/GitHub/Taller-Estructuras-Lineales/src/arraylist/PartidoLiga.txt";
    public static void main(String[] args) throws Exception {
        ArrayList<PartidoFutbol> partidos = leerPartidos(NOMBREFICHERO);
        System.out.println("Partidos leídos: " + partidos.size());

        mostrarPartidosGanadosPorVisitante(partidos);
        contarVictoriasDeEquipo(partidos, "Barcelona");
        contarVictoriasLocal(partidos);
        eliminarPartidosSinEmpate(partidos);

        System.out.println("Partidos restantes tras eliminar los que no son empate: " + partidos.size());
        imprimirPartidos(partidos);
    }


    private static ArrayList<PartidoFutbol> leerPartidos(String nombreFichero) {
        ArrayList<PartidoFutbol> partidos = new ArrayList<>();
        File fichero = new File(nombreFichero);

        try (Scanner leer = new Scanner(fichero)) {
            while (leer.hasNextLine()) {
                String linea = leer.nextLine();
                if (linea.isBlank()) {
                    continue;
                }
                String[] cortarString = linea.split("::");

                PartidoFutbol partido = new PartidoFutbol();
                partido.setEquipoLocal(cortarString[0]);
                partido.setEquipoVisitante(cortarString[1]);
                partido.setGolLocal(Integer.parseInt(cortarString[2]));
                partido.setGolVisitante(Integer.parseInt(cortarString[3]));

                partidos.add(partido);
            }
        } catch (Exception e) {
            System.out.println("El fichero no se pudo leer: " + e.getMessage());
        }

        return partidos;
    }


    private static void mostrarPartidosGanadosPorVisitante(ArrayList<PartidoFutbol> partidos) {
        System.out.println("Partidos ganados por el visitante:");
        for (PartidoFutbol partido : partidos) {
            if (partido.ganoVisitante()) {
                System.out.println(partido);
            }
        }
    }


    private static void contarVictoriasDeEquipo(ArrayList<PartidoFutbol> partidos, String equipo) {
        int victorias = 0;
        for (PartidoFutbol partido : partidos) {
            if (partido.gano(equipo)) {
                victorias++;
            }
        }
        System.out.println(equipo + " ganó " + victorias + " partido(s).");
    }


    private static void contarVictoriasLocal(ArrayList<PartidoFutbol> partidos) {
        int victoriasLocal = 0;
        for (PartidoFutbol partido : partidos) {
            if (partido.ganoLocal()) {
                victoriasLocal++;
            }
        }
        System.out.println("El equipo local ganó " + victoriasLocal + " partido(s).");
    }


    private static void eliminarPartidosSinEmpate(ArrayList<PartidoFutbol> partidos) {
        Iterator<PartidoFutbol> iterador = partidos.iterator();
        while (iterador.hasNext()) {
            PartidoFutbol partido = iterador.next();
            if (!partido.esEmpate()) {
                iterador.remove();
            }
        }
    }

    private static void imprimirPartidos(ArrayList<PartidoFutbol> partidos) {
        for (PartidoFutbol partido : partidos) {
            System.out.println(partido);
        }
    }
}

