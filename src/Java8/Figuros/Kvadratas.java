package Java8.Figuros;

public class Kvadratas extends Figura {
    public Double krastine;

    public Kvadratas(Double krastine) {
        this.krastine = krastine;
    }



    public Double plotas() {
        return krastine * krastine;
    }

    public Double perimetras() {
        return krastine * 4;
    }

    public Double getKrastine() {
        return krastine;
    }

    public void setKrastine(Double krastine) {
        this.krastine = krastine;
    }
}
