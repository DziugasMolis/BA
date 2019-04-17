package Java17.ButoPaieska;

public class Butas implements Comparable<Butas>{
    private Integer butoNr;
    private String adresas;
    private Integer kambariuSk;
    private Double kvadratura;
    private Double nuomosKaina;

    public Butas(Integer butoNr, String adresas, Integer kambariuSk, Double kvadratura, Double nuomosKaina) {
        this.butoNr = butoNr;
        this.adresas = adresas;
        this.kambariuSk = kambariuSk;
        this.kvadratura = kvadratura;
        this.nuomosKaina = nuomosKaina;
    }

    @Override
    public String toString() {
        return "Butas{" +
                "butoNr=" + butoNr +
                ", adresas='" + adresas + '\'' +
                ", kambariuSk=" + kambariuSk +
                ", kvadratura=" + kvadratura +
                ", nuomosKaina=" + nuomosKaina +
                '}';
    }

    public Integer getButoNr() {
        return butoNr;
    }

    public void setButoNr(Integer butoNr) {
        this.butoNr = butoNr;
    }

    public String getAdresas() {
        return adresas;
    }

    public void setAdresas(String adresas) {
        this.adresas = adresas;
    }

    public Integer getKambariuSk() {
        return kambariuSk;
    }

    public void setKambariuSk(Integer kambariuSk) {
        this.kambariuSk = kambariuSk;
    }

    public Double getKvadratura() {
        return kvadratura;
    }

    public void setKvadratura(Double kvadratura) {
        this.kvadratura = kvadratura;
    }

    public Double getNuomosKaina() {
        return nuomosKaina;
    }

    public void setNuomosKaina(Double nuomosKaina) {
        this.nuomosKaina = nuomosKaina;
    }

    @Override
    public int compareTo(Butas o) {
        return o.getKvadratura().compareTo(getKvadratura());
    }
}
