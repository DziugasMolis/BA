package Java9.Filmai;

public class Filmas {
    private Integer metai;
    private String pavadinimas;
    private Integer valandos;
    private Integer minutes;
    private Integer ziurovia;

    public Filmas(Integer metai, String pavadinimas, Integer valandos, Integer minutes, Integer ziurovia) {
        this.metai = metai;
        this.pavadinimas = pavadinimas;
        this.valandos = valandos;
        this.minutes = minutes;
        this.ziurovia = ziurovia;
    }

    @Override
    public String toString() {
        return "Filmas{" +
                "metai=" + metai +
                ", pavadinimas='" + pavadinimas + '\'' +
                ", valandos=" + valandos +
                ", minutes=" + minutes +
                ", ziurovia=" + ziurovia +
                '}';
    }

    public Integer getMetai() {
        return metai;
    }

    public void setMetai(Integer metai) {
        this.metai = metai;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public Integer getValandos() {
        return valandos;
    }

    public void setValandos(Integer valandos) {
        this.valandos = valandos;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getZiurovia() {
        return ziurovia;
    }

    public void setZiurovia(Integer ziurovia) {
        this.ziurovia = ziurovia;
    }
}
