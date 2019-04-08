package Java10.AnonimineKlase;

public interface Skaiciavimai {
    void suma(Integer a, Integer b);

    default Double plotas(Integer a, Integer b) {
        return (double)a*b;
    }
}
