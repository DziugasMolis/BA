package Java2;

import java.util.Scanner;

public class PirmaIrPaskutineRaides {
    // Atspausdinti pirmą ir paskutinę žodžio raides
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Iveskite zodi");
        String zodis = reader.next();

//        char[] raides = zodis.toCharArray();
//        System.out.println("Pirma raide " + raides[0] + " Paskutine raide " + raides[raides.length - 1]);
        System.out.println("Pirma raide " + zodis.charAt(0) +
                " Paskutine raide " + zodis.charAt(zodis.length() - 1));

    }
}
