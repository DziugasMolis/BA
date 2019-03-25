package java3.Ciklai;

public class Ciklas {
    public static void main(String[] args) {

//        for(int i = 0; i < 100; i++) {
//            System.out.println(i);
//        }
//        for(int i = 100; i > 0; i--) {
//            System.out.println(i);
//        }
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//        i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i < 10);


        Integer suma = 0;
        for(int i = 0; i < 15; i++) {

            suma += i;
        }

        Double vid = suma / 15.0;
        System.out.println(vid);
    }
}
