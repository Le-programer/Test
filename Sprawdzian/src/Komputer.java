public class Komputer {
    private int numer;
    private boolean czyDziala;
    public Komputer(int numer, boolean works){
        this.numer = numer;
        this.czyDziala = works;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public boolean isCzyDziala() {
        return czyDziala;
    }

    public void setCzyDziala(boolean czyDziala) {
        this.czyDziala = czyDziala;
    }
}
