package Java7.Human;

import java.util.Arrays;

public class Mokinys {
    private String vardas;
    private String pavarde;
    private String klase;
    private Integer[] pazymiai;

    public Mokinys(String vardas, String pavarde, String klase, Integer[] pazymiai) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.pazymiai = pazymiai;
    }

    @Override
    public String toString() {
        return "Vardas: " + vardas + " Pavarde: " + pavarde + " Klase: "+ klase +
                " Pazymiai: " + Arrays.toString(pazymiai);
    }

    public Double sum() {
        Double suma = 0.0;
        for (Integer paz : pazymiai) {
            suma += paz;
        }
        return suma;
    }

    public Double avg() {
        return sum() / pazymiai.length;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getKlase() {
        return klase;
    }

    public void setKlase(String klase) {
        this.klase = klase;
    }

    public Integer[] getPazymiai() {
        return pazymiai;
    }

    public void setPazymiai(Integer[] pazymiai) {
        this.pazymiai = pazymiai;
    }
}
