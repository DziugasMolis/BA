package Java8;

public class Suma {
    private Integer pirmasSkaicius;
    private Integer antrasSkaicius;

    public Suma(Integer pirmasSkaicius, Integer antrasSkaicius) {
        this.pirmasSkaicius = pirmasSkaicius;
        this.antrasSkaicius = antrasSkaicius;
    }

    @Override
    public String toString() {
        return "Suma = " + (this.pirmasSkaicius + this.antrasSkaicius);
    }

    public Integer getPirmasSkaicius() {
        return pirmasSkaicius;
    }

    public void setPirmasSkaicius(Integer pirmasSkaicius) {
        this.pirmasSkaicius = pirmasSkaicius;
    }

    public Integer getAntrasSkaicius() {
        return antrasSkaicius;
    }

    public void setAntrasSkaicius(Integer antrasSkaicius) {
        this.antrasSkaicius = antrasSkaicius;
    }
}
