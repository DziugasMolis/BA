package Java5;

public class Main {
    public static void main(String[] args) {
//        daugParametru(1);
//        daugParametru(1, 2);
//        daugParametru(1, 2, 3);

//        int a = 100;
//        System.out.println("Pradine reiksme = " + a);
//        a = pakeistiReiksme(a);
//        System.out.println("Pakeista reiksme = " + a);

//        int[] skaiciai = {1,2,3};
//        System.out.println("Pirmas narys " + skaiciai[0]);
//        changeValue(skaiciai);
//        System.out.println("Pirmas narys " + skaiciai[0]);

        String a = "Labas";

        changeString(a);
        String b = a;
        System.out.println("A reiksme " + a);
        System.out.println("B reiksme " + b);
    }

    private static void changeString(String a) {
        a= a + "Vakaras";
        System.out.println(a);
    }


    private static void changeValue(int[] array){
        array = new int[]{9,9,9};
    }


    public static int pakeistiReiksme(int a) {
        return 1;
//        System.out.println("Reiksme metode = " + a);
    }

    public static void daugParametru(Integer... a) {
        if(a.length == 1) {
          System.out.println(a[0]);
        }
        if(a.length == 2) {
            System.out.println(a[1]);
        }
        if(a.length == 3) {
            System.out.println(a[2]);
        }

    }
}
