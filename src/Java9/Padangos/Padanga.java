package Java9.Padangos;

public class Padanga {
    private Integer atstumas;
    private Integer aukstis;
    private Character greicioIndeksas;
    private Character padangosKonstrukcija;
    private String ratlankioSkersmuo;
    private Double kaina;


    public Padanga(Integer atstumas, Integer aukstis, Character greicioIndeksas, Character padangosKonstrukcija, String ratlankioSkersmuo, Double kaina) {
        this.atstumas = atstumas;
        this.aukstis = aukstis;
        this.greicioIndeksas = greicioIndeksas;
        this.padangosKonstrukcija = padangosKonstrukcija;
        this.ratlankioSkersmuo = ratlankioSkersmuo;
        this.kaina = kaina;
    }

    public String toString() {
        return this.atstumas + " " + this.aukstis + " " + this.greicioIndeksas +
                this.padangosKonstrukcija + this.ratlankioSkersmuo +
                " " + this.kaina;
    }

    public Integer getAtstumas() {
        return atstumas;
    }

    public void setAtstumas(Integer atstumas) {
        this.atstumas = atstumas;
    }

    public Integer getAukstis() {
        return aukstis;
    }

    public void setAukstis(Integer aukstis) {
        this.aukstis = aukstis;
    }

    public Character getGreicioIndeksas() {
        return greicioIndeksas;
    }

    public void setGreicioIndeksas(Character greicioIndeksas) {
        this.greicioIndeksas = greicioIndeksas;
    }

    public Character getPadangosKonstrukcija() {
        return padangosKonstrukcija;
    }

    public void setPadangosKonstrukcija(Character padangosKonstrukcija) {
        this.padangosKonstrukcija = padangosKonstrukcija;
    }

    public String getRatlankioSkersmuo() {
        return ratlankioSkersmuo;
    }

    public void setRatlankioSkersmuo(String ratlankioSkersmuo) {
        this.ratlankioSkersmuo = ratlankioSkersmuo;
    }

    public Double getKaina() {
        return kaina;
    }

    public void setKaina(Double kaina) {
        this.kaina = kaina;
    }
}
