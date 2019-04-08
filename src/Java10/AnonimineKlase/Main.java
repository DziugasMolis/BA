package Java10.AnonimineKlase;

public class Main {

    public static void main(String[] args) {
        Skaiciavimai obj = new Skaiciavimai() {
            @Override
            public void suma(Integer a, Integer b) {
                System.out.println("Suma = " + (a + b));
            }


        };

        obj.suma(2,2);
        System.out.println("Plotas = " + obj.plotas(6,3));
    }
}
