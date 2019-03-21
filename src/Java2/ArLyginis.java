package Java2;

import java.util.Scanner;

public class ArLyginis {
// Parašytų ar įvestas skaičius yra lyginis
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        Integer skaicius = reader.nextInt();
        if(skaicius % 2 == 0) {
            System.out.println("Skaicius " + skaicius + " yra lyginis");
        } else {
            System.out.println("Skaicius " + skaicius + " nera lyginis");
        }
    }
}
