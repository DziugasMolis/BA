package Java8.Gyvunai;

public class Cat extends Animal{
    private String garsas;

    public Cat(String garsas, Integer amzius) {
        super(amzius);
        this.garsas = garsas;
    }

    @Override
    public String toString() {
        return getClass().getName() + " skleidzia garsa "
                + this.garsas + super.toString();
    }
}
