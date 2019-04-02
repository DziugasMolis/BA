package Java8.Gyvunai;

public class Dog extends Animal{
    private String garsas;

    public Dog(String garsas, Integer amzius) {
        super(amzius);
        this.garsas = garsas;
    }

    public static String garsas() {
        return "Au";
    }

    @Override
    public String toString() {
        return getClass().getName() + " skleidzia garsa "
                + this.garsas + super.toString();
    }
}
