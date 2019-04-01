package Java2;

import Java7.Human.Metodai;

import java.util.Scanner;

public class Main { //    Patikrinti ar įvestas skaičius teigiamas ar neigiamas
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite skaiciu");
        Integer skaicius = reader.nextInt();
        if(skaicius > 0) {
            System.out.println("Skaicius teigiamas");
        } else {
            System.out.println("Skaicius neigiamas");
        }

        System.out.println(Metodai.gautiIlgesniZodi("vienas", "du"));
    }

}
