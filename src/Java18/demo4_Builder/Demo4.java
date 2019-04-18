package Java18.demo4_Builder;

public class Demo4 {

    public static void main(String[] args) {

        Car car = Car.builder()
                .setColor("black")
                .setWheels(6)
                .build();
        System.out.println(Car.builder().setColor("red").build());
        Car kitaMasina = Car.builder().setColor("red").setWheels(4).build();
        System.out.println(car);


        System.out.println(kitaMasina);
    }
}
