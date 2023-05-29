public class Main {
    public static void main(String[] args) {
        Pracownia pracownia = new Pracownia();

        Uczen uczen = new Uczen("Marek","Gorzyla","26482672689","3C");
        Komputer pc = new Komputer(2,false);
        pracownia.dodajKomputerDoUcznia(uczen,pc);

        uczen = new Uczen("Marcel","Mikulski","2y672689","5B");
        pc = new Komputer(4,false);
        pracownia.dodajKomputerDoUcznia(uczen,pc);

        pracownia.wyswietlPracownie();
    }
}