import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Pracownia {
    private Map<Osoba, Komputer> przypisania = new HashMap<>();
    public void dodajKomputerDoUcznia(Uczen uczen, Komputer komputer){
        przypisania.put(uczen, komputer);
    }
    public void wyswietlPracownie(){
        Set<Map.Entry<Osoba, Komputer>> entries = przypisania.entrySet();

        for (Map.Entry<Osoba, Komputer> entry : entries) {

            System.out.println(entry.getKey().getImie() + ", " + entry.getKey().getNazwisko() + " -> " + entry.getValue().getNumer());
        }
    }
}
