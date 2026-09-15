package arraylist;

public class PartidoFutbol {

    private String equipoLocal;
    private String equipoVisitante;
    private int golLocal;
    private int golVisitante;

    public PartidoFutbol() {
    }

    public PartidoFutbol(String equipoLocal, String equipoVisitante, int golLocal, int golVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golLocal = golLocal;
        this.golVisitante = golVisitante;
    }

    public String getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(String equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public String getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(String equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getGolLocal() {
        return golLocal;
    }

    public void setGolLocal(int golLocal) {
        this.golLocal = golLocal;
    }

    public int getGolVisitante() {
        return golVisitante;
    }

    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }


    public boolean esEmpate() {
        return golLocal == golVisitante;
    }


    public boolean ganoLocal() {
        return golLocal > golVisitante;
    }


    public boolean ganoVisitante() {
        return golVisitante > golLocal;
    }


    public boolean gano(String equipo) {
        return (equipoLocal.equalsIgnoreCase(equipo) && ganoLocal())
                || (equipoVisitante.equalsIgnoreCase(equipo) && ganoVisitante());
    }

    @Override
    public String toString() {
        return equipoLocal + " " + golLocal + " - " + golVisitante + " " + equipoVisitante;
    }
}
