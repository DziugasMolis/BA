package Java8.Figuros;

public class Kvadratas extends Figura implements Metodai {
    public Double krastine;

    public Kvadratas(Double krastine) {
        this.krastine = krastine;
    }

    @Override
    public Double plotas() {
        return krastine * krastine;
    }

    @Override
    public Double perimetras() {
        return krastine * 4;
    }

    @Override
    public String sudetiStringus(String pirmas, String antras) {
        return pirmas + antras;
    }

    public Double getKrastine() {
        return krastine;
    }

    public void setKrastine(Double krastine) {
        this.krastine = krastine;
    }
}
