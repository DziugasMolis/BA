package Java2;

import java.util.Scanner;

public class SavaitesDiena {

    // Įvesta skaičių nuo 1-7 grąžintų atitinkamą dienos pavadinimą
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite savaites dienos skaiciu");
        Integer skaicius = reader.nextInt();

            switch (skaicius) {
                case 1: {
                    System.out.println("Pirmadienis");
                    break;
                }
                case 2: {
                    System.out.println("Antradienis");
                    break;
                }
                case 3: {
                    System.out.println("Treciadienis");
                    break;
                }
                case 4: {
                    System.out.println("Ketvirtadienis");
                    break;
                }
                case 5: {
                    System.out.println("Penktadienis");
                    break;
                }
                case 6: {
                    System.out.println("Sestadienis");
                    break;
                }
                case 7: {
                    System.out.println("Sekmadienis");
                    break;
                }
                default: {
                    System.out.println("Tokios savaites dienos nera");
                }
            }

    }
}
