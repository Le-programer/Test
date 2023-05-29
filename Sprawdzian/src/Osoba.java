public class Osoba {
        private String imie;
        private String nazwisko;
        private String PESEL;
        public Osoba(String imie, String nazwisko, String pesel){
                this.imie = imie;
                this.nazwisko = nazwisko;
                this.PESEL = pesel;
        }
        public Osoba(Osoba osoba){
                this.imie = osoba.getImie();
                this.nazwisko = osoba.getNazwisko();
                this.PESEL = osoba.getPESEL();
        }

        public String getPESEL() {
                return PESEL;
        }

        public void setPESEL(String PESEL) {
                this.PESEL = PESEL;
        }

        public String getImie() {
                return imie;
        }

        public void setImie(String imie) {
                this.imie = imie;
        }

        public String getNazwisko() {
                return nazwisko;
        }

        public void setNazwisko(String nazwisko) {
                this.nazwisko = nazwisko;
        }
}
