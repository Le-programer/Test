public class Uczen extends Osoba{
    private String klasa;
    private boolean czyZdaje;

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public boolean isCzyZdaje() {
        return czyZdaje;
    }

    public void setCzyZdaje(boolean czyZdaje) {
        this.czyZdaje = czyZdaje;
    }

    public Uczen(String imie, String nazwisko, String pesel, String klasa) {
        super(imie, nazwisko, pesel);
        this.klasa = klasa;
    }
}
