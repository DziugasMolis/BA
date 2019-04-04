package Java8.Figuros;

public class Staciakampis extends Figura implements Metodai {

    private Double krastine1;
    private Double krastine2;

    public Staciakampis(Double krastine1, Double krastine2) {
        this.krastine1 = krastine1;
        this.krastine2 = krastine2;
    }

    @Override
    public Double plotas() {
        return krastine1 * krastine2;
    }

    @Override
    public Double perimetras() {
        return krastine1 * 2 + krastine2 * 2;
    }

    @Override
    public String sudetiStringus(String pirmas, String antras) {
        return pirmas + antras;
    }

    public Double getKrastine1() {
        return krastine1;
    }

    public void setKrastine1(Double krastine1) {
        this.krastine1 = krastine1;
    }

    public Double getKrastine2() {
        return krastine2;
    }

    public void setKrastine2(Double krastine2) {
        this.krastine2 = krastine2;
    }
}
