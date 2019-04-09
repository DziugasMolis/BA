package Java12;

public class BendrineKlase<T> {
    private T kintamasis;
    private String pav;
    private Integer amzius;

    public BendrineKlase(T kintamasis) {
        this.kintamasis = kintamasis;
    }

    public BendrineKlase(T kintamasis, String pav, Integer amzius) {
        this.kintamasis = kintamasis;
        this.pav = pav;
        this.amzius = amzius;
    }

    public T getKintamasis() {
        return kintamasis;
    }

    public void setKintamasis(T kintamasis) {
        this.kintamasis = kintamasis;
    }
}
