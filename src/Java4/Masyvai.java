package Java4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Masyvai {

    public static void main(String[] args) {
        Integer[] skaiciai = {2, 4, 6, 8};
//        for (Integer sk: skaiciai) {
//            System.out.print(sk + " ");
//        }
//        System.out.println();
//        skaiciai = pridetiElementa(skaiciai, 9);
//        for (Integer sk: skaiciai) {
//            System.out.print(sk + " ");
//        }

        skaiciai = iterptiElementaPagalIndeksa(skaiciai, 0, 1);

        Integer[] skaiciai2 = {9,5,6,8,1};
        for (Integer sk: skaiciai2) {
            System.out.print(sk + " ");
        }
        System.out.println();
        Integer[] surikiuotiSkaiciai = MinMaxRikiavimas(skaiciai2);
        for (Integer sk: surikiuotiSkaiciai) {
            System.out.print(sk + " ");
        }

        Integer[][] matrica = new Integer[2][2];
    }

    public static Integer[] pridetiElementa(Integer[] masyvas, Integer skaicius) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = skaicius;
        return masyvas;
    }

    public static Integer[] iterptiElementaPagalIndeksa(Integer[] masyvas,
                                                        Integer skaicius,
                                                        Integer indeksas) {
        Integer[] tmp = new Integer[masyvas.length + 1];
        int pridejimoIndeksas = 0;
        for (int i = 0; i < masyvas.length; i++) {
            if (i == indeksas) {
                tmp[pridejimoIndeksas++] = skaicius;
            }
            tmp[pridejimoIndeksas++] = masyvas[i];

        }
        return tmp;
    }

    public static Integer[] MinMaxRikiavimas(Integer[] masyvas) {
        int temp;
        for (int i = 0; i < masyvas.length - 1; i++) {
            /* find the min element in the unsorted a[j .. n-1] */
            /* assume the min is the first element */
            int minIndeksas = i;
            /* test against elements after j to find the smallest */
            for (int j = i + 1; j < masyvas.length; j++) {
                /* if this element is less, then it is the new minimum */
                if (masyvas[j] < masyvas[minIndeksas]) {
                    /* found new minimum; remember its index */
                    minIndeksas = j;
                }
            }
            if (minIndeksas != i) {
                temp = masyvas[i];
                masyvas[i] = masyvas[minIndeksas];
                masyvas[minIndeksas] = temp;
            }
        }
        return masyvas;
    }
}
