package Java18.Buitine_Technika;

public class Preke {
    private String pavadinimas;
    private Integer prekesID;
    private Integer kiekis;
    private Double kaina;

    public Preke(String pavadinimas, Integer prekesID, Integer kiekis, Double kaina) {
        this.pavadinimas = pavadinimas;
        this.prekesID = prekesID;
        this.kiekis = kiekis;
        this.kaina = kaina;
    }

    @Override
    public String toString() {
        return "Preke{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", prekesID=" + prekesID +
                ", kiekis=" + kiekis +
                ", kaina=" + kaina +
                '}' + "\n";
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Integer getPrekesID() {
        return prekesID;
    }

    public void setPrekesID(Integer prekesID) {
        this.prekesID = prekesID;
    }

    public Integer getKiekis() {
        return kiekis;
    }

    public void setKiekis(Integer kiekis) {
        this.kiekis = kiekis;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }
}
