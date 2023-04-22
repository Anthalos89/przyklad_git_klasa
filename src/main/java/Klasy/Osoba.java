package Klasy;

public class Osoba {
    private String imie;
    private String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String getInfo(){
        return "Imie: " + this.imie + "\n" + "Nazwisko: " + this.nazwisko;
    }
}
