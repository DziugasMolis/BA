package Java8.Gyvunai;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("miau", 2);
        Dog dog = new Dog("au", 6);

        Animal[] arr = {cat, dog, cat, dog, cat, dog, dog, dog};
        Farm ferma = new Farm(arr);
        System.out.println(ferma);
    }
}
