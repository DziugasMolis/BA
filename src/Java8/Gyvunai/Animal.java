package Java8.Gyvunai;

public class Animal {
    private Integer amzius;

    public Animal(Integer amzius) {
        this.amzius = amzius;
    }

    @Override
    public String toString() {
        return " Amzius = " + this.amzius;
    }
    public Integer getAmzius() {
        return amzius;
    }

    public void setAmzius(Integer amzius) {
        this.amzius = amzius;
    }
}
