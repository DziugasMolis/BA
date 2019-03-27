package Java5;

import java.util.Arrays;

public class Uzdaviniai {

    public static void main(String[] args) {
        Integer[] skaiciai = {2,3,5,6,8,9,10};
        spausdinti(skaiciai, "Skaiciai");
        Integer[] skaiciai2 = {99,15,8, 25, 5,10, 7, 66};
        spausdinti(skaiciai2, "Kiti skaiciai");

        System.out.println("Suma = " + dviejuSkaiciuSuma(2,2));

        spausdinti(skaiciaiMazesniUz10(skaiciai2), "Skaiciai mazesni uz 10 ");


        String[] zodziai = {"aaaaa", "bbbbbb", "te51515151515stas", "123456789"};
        System.out.println(ilgiausiasZodis(zodziai));
    }

    private static void spausdinti(Integer[] skaiciai, String pav) {
        System.out.println(pav);
        for (Integer skaicius: skaiciai) {
            System.out.print(skaicius + " ");
        }
        System.out.println();
    }

    private static Integer dviejuSkaiciuSuma(Integer vienas, Integer du) {
        return vienas + du;
    }

    private static void arLyginis(Integer skaicius) {

    }

    private static Integer[] skaiciaiMazesniUz10(Integer[] skaiciai) {
        Integer[] mazesniSkaiciai = new Integer[0];
        for(Integer skaicius: skaiciai) {
            if(skaicius < 10) {
                mazesniSkaiciai = pridetiElementa(mazesniSkaiciai, skaicius);
            }
        }
        return  mazesniSkaiciai;
    }

    public static Integer[] pridetiElementa(Integer[] masyvas, Integer skaicius) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = skaicius;
        return masyvas;
    }

    public static String ilgiausiasZodis(String[] zodziai) {
        Integer ilgiausioZodzioIlgis = 0;
        Integer ilgiausioZodzioIndeksas = 0;
        for(int i = 0; i < zodziai.length; i++) {
            if (zodziai[i].length() > ilgiausioZodzioIlgis) {
                ilgiausioZodzioIlgis = zodziai[i].length();
                ilgiausioZodzioIndeksas = i;
            }
        }
        return zodziai[ilgiausioZodzioIndeksas];
    }

}
