package Java17.ButoPaieska;

public class Kriterijus {

    private Integer nuoKambariuSk;
    private Integer ikiKambariuSk;

    private Double nuoPlotas;
    private Double ikiPlotas;

    private Double nuoKaina;
    private Double ikiKaina;

    public Kriterijus(Integer nuoKambariuSk, Integer ikiKambariuSk, Double nuoPlotas, Double ikiPlotas, Double nuoKaina, Double ikiKaina) {
        this.nuoKambariuSk = nuoKambariuSk;
        this.ikiKambariuSk = ikiKambariuSk;
        this.nuoPlotas = nuoPlotas;
        this.ikiPlotas = ikiPlotas;
        this.nuoKaina = nuoKaina;
        this.ikiKaina = ikiKaina;
    }

    @Override
    public String toString() {
        return "Kriterijus{" +
                "nuoKambariuSk=" + nuoKambariuSk +
                ", ikiKambariuSk=" + ikiKambariuSk +
                ", nuoPlotas=" + nuoPlotas +
                ", ikiPlotas=" + ikiPlotas +
                ", nuoKaina=" + nuoKaina +
                ", ikiKaina=" + ikiKaina +
                '}';
    }

    public Integer getNuoKambariuSk() {
        return nuoKambariuSk;
    }

    public void setNuoKambariuSk(Integer nuoKambariuSk) {
        this.nuoKambariuSk = nuoKambariuSk;
    }

    public Integer getIkiKambariuSk() {
        return ikiKambariuSk;
    }

    public void setIkiKambariuSk(Integer ikiKambariuSk) {
        this.ikiKambariuSk = ikiKambariuSk;
    }

    public Double getNuoPlotas() {
        return nuoPlotas;
    }

    public void setNuoPlotas(Double nuoPlotas) {
        this.nuoPlotas = nuoPlotas;
    }

    public Double getIkiPlotas() {
        return ikiPlotas;
    }

    public void setIkiPlotas(Double ikiPlotas) {
        this.ikiPlotas = ikiPlotas;
    }

    public Double getNuoKaina() {
        return nuoKaina;
    }

    public void setNuoKaina(Double nuoKaina) {
        this.nuoKaina = nuoKaina;
    }

    public Double getIkiKaina() {
        return ikiKaina;
    }

    public void setIkiKaina(Double ikiKaina) {
        this.ikiKaina = ikiKaina;
    }
}
