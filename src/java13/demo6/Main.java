package java13.demo6;

public class Main {

    @FunctionalInterface
    interface Calculate<N> {

        N calc(N n1, N n2);

    }

    static class A {

        void calculate() {
            // Lambda israiskos interfaco aprasymas
            // klasė::metodas
            Calculate<Double> c = Math::max;

            Double result = c.calc(2.9, 3.0);
            System.out.println("result = " + result);
            Calculate<Double> c2 = (x1, x2) -> Math.max(x1, x2);

            Double result2 = c2.calc(3.0,5.0);
            System.out.println("result = " + result2);
        }

    }

    public static void main(String[] args) {

        new A().calculate();
    }

}
