package Java12;

import Java9.Filmai.Filmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BendriniaiMetodai {

    public static void main(String[] args) {
        Integer[] skaiciai = {8, 1, 2, 5, 3, 4, 5, 6, 7};
        Double[] skaiciai2 = {10d, 20d, 30d, 40d, 50d};
        Character[] charai = {'z', 'y', 'a', 'b', 'c', 'd', 'e'};
        String[] zodziai = {"aa", "bb", "cc", "dd", "cc", "cc", "ee"};
//        spausdinti(skaiciai2);
//        spausdinti(charai);
//        BendrineKlase<Integer[]> obj = new BendrineKlase<>(skaiciai);
//        spausdinti(obj.getKintamasis());
//        Filmas filmas = new Filmas(1, "a", 1, 1, 1);
//        BendrineKlase<Filmas> filmoSaugykla = new BendrineKlase<>(filmas);
//        System.out.println("Kiek kartojasi: " + kiekKartojasi(zodziai, "cc"));

        Person[] arr = {new Person("jonaes", 10), new Person("jomnas", 1),
                new Person("andrius", 11), new Person("jon22as", 11), new Person("jonas", 99)};
//        spausdinti(arr);
//        selectionSort(arr);
//        spausdinti(arr);

        List<Person> listas = new ArrayList<>();
        listas.add(new Person("zandrius", 11));
        listas.add(new Person("bandrius", 15));
        listas.add(new Person("bcandrius", 12));
        Collections.sort(listas);
        System.out.println(listas);

        listas.sort((o1, o2) -> o1.getAge().compareTo(o2.getAge()));
        System.out.println(listas);
    }

    public static <T> void spausdinti(T[] arr) {
        for (T el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }

    public static <T> Integer kiekKartojasi(T[] arr, T reiksme) {
        Integer count = 0;
        for (T el : arr) {
            if (el.equals(reiksme)) {
                count++;
            }
        }
        return count;
    }

    private static <E> void swap(E[] a, int i, int j) {
        if (i != j) {
            E temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public static <E extends Comparable<E>> void selectionSort(E[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // find index of smallest element
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[smallest]) <= 0) {
                    smallest = j;
                }
            }
            swap(a, i, smallest);  // swap smallest to front
        }
    }

}
