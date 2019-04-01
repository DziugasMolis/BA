package Java7.Human.Temperaturos;

public class Menuo {
    private String menuo;
    private Double[] temperaturos;

    public Menuo(String menuo, Double[] temperaturos) {
        this.menuo = menuo;
        this.temperaturos = temperaturos;
    }

    @Override
    public String toString() {
        return getMenuo() + " " + String.format("%.2f", avg());
    }

    public Double sum() {
        Double suma = 0.0;
        for (Double temp : temperaturos) {
            suma += temp;
        }
        return suma;
    }

    public Double avg() {
        return sum() / temperaturos.length;
    }

    public String getMenuo() {
        return menuo;
    }

    public void setMenuo(String menuo) {
        this.menuo = menuo;
    }

    public Double[] getTemperaturos() {
        return temperaturos;
    }

    public void setTemperaturos(Double[] temperaturos) {
        this.temperaturos = temperaturos;
    }
}
