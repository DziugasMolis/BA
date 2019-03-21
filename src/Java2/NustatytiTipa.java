package Java2;

public class NustatytiTipa {
    // Nustatyti kintamojo tipą naudojant IF

    public static void main(String[] args) {
        Double skaicius = 2.0;
        tikrinaTipa(skaicius);

        String tekstas = "Labas rytas";
        tikrinaTipa(tekstas);
    }

    public static void tikrinaTipa(Object kintamasis) {
        if(kintamasis instanceof Integer) {
            System.out.println("Kintamasis integer tipo");
        } else if (kintamasis instanceof Double) {
            System.out.println("Kintamasis double tipo");
        } else if (kintamasis instanceof String) {
            System.out.println("Kintamasis string tipo");
        }
    }
}
