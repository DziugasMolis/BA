package Java2;

import java.util.Scanner;

public class Treniruotes {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Kokia treniruotes trukme pirmadieni");
        Double pirm = reader.nextDouble();
        System.out.println("Kokia treniruotes trukme antradieni");
        Double antr = reader.nextDouble();
        System.out.println("Kokia treniruotes trukme treciadieni");
        Double trec = reader.nextDouble();
        System.out.println("Kokia treniruotes trukme ketvirtadieni");
        Double ketv = reader.nextDouble();
        System.out.println("Kokia treniruotes trukme penktadieni");
        Double pnktd = reader.nextDouble();

        Integer minutes = gautiMinutes(pirm+antr+trec+ketv+pnktd);
        System.out.println(gautiMinutes(pirm + antr + trec + ketv + pnktd) + " minuciu");


    }

    public static Integer gautiMinutes(Double valanduKiekis) {
        Integer minutes = (int) Math.floor(valanduKiekis * 60);
        return minutes;
    }

    public static Integer suma(Integer a, Integer b) {
        return a + b;
    }
}
