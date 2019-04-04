package Java8.Figuros;

public interface Metodai {

    Double plotas();

    Double perimetras();

    String sudetiStringus(String a, String b);

    default String spausdinti() {
        return "Perimetras = " + perimetras() + " plotas = " + plotas();
    }
}
