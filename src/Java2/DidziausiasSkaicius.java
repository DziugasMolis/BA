package Java2;

import java.util.Scanner;

public class DidziausiasSkaicius {
// Įvedate 3 skaičius ir atvaizduojate didžiausią
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite pirma skaiciu");
        Integer skaicius1 = reader.nextInt();
        System.out.println("Iveskite antra skaiciu");
        Integer skaicius2 = reader.nextInt();
        System.out.println("Iveskite trecia skaiciu");
        Integer skaicius3 = reader.nextInt();

        if(skaicius1 > skaicius2 && skaicius1 > skaicius3) {
            System.out.println("Pirmas skaicius " + skaicius1  + " didziausias");
        } else if(skaicius2 > skaicius1 && skaicius2 > skaicius3) {
            System.out.println("Antras skaicius " + skaicius2  + " didziausias");
        } else {
            System.out.println("Trecias skaicius " + skaicius3  + " didziausias");
        }
    }
}
