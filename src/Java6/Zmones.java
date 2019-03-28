package Java6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Zmones {
    public static void main(String[] args) {
        String duomenu1FailoPath = new File("").getAbsolutePath()
                + "/src/java6/Duomenys1.txt";
        String duomenu2FailoPath = new File("").getAbsolutePath()
                + "/src/java6/Duomenys2.txt";
        String[] vardai1 = skaitytiStringus(duomenu1FailoPath, 0);
        String[] pavardes1 = skaitytiStringus(duomenu1FailoPath, 1);
        String[] profesijos1 = skaitytiStringus(duomenu1FailoPath, 3);
        Integer[] amzius1 = skaitytiInteger(duomenu1FailoPath, 2);

        String[] vardai2 = skaitytiStringus(duomenu2FailoPath, 0);
        String[] pavardes2 = skaitytiStringus(duomenu2FailoPath, 1);
        String[] profesijos2 = skaitytiStringus(duomenu2FailoPath, 3);
        Integer[] amzius2 = skaitytiInteger(duomenu2FailoPath, 2);

        String[] vardai = concat(vardai1, vardai2);
        String[] pavardes = concat(pavardes1, pavardes2);
        Integer[] amziai = concat(amzius1, amzius2);
        String[] profesijos = concat(profesijos1, profesijos2);
//        Atspausdinti i rezultatu faila tokia pat struktura kaip nuskaitem
//        Rasti seniausia zmogu
//        Rasti santechniku, vadybininku, statybininku skaiciu

    }

    public static String[] concat(String[] first, String[] second) {
        String[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    public static Integer[] concat(Integer[] first, Integer[] second) {
        Integer[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }


    public static String[] skaitytiStringus(String failas, Integer stulpelis) {
        String[] reiksmes = new String[0];
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String eilute = br.readLine();
            while (eilute != null) {
                String[] eilutesReiksmes = eilute.split(" ");
                reiksmes = pridetiElementa(reiksmes, eilutesReiksmes[stulpelis]);
                eilute = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return reiksmes;
    }

    public static Integer[] skaitytiInteger(String failas, Integer stulpelis) {
        Integer[] reiksmes = new Integer[0];
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String eilute = br.readLine();
            while (eilute != null) {
                String[] eilutesReiksmes = eilute.split(" ");
                reiksmes = pridetiElementa(reiksmes,
                        Integer.parseInt(eilutesReiksmes[stulpelis]));
                eilute = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return reiksmes;
    }

    public static Integer[] pridetiElementa(Integer[] masyvas, Integer skaicius) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = skaicius;
        return masyvas;
    }

    public static String[] pridetiElementa(String[] masyvas, String zodis) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = zodis;
        return masyvas;
    }
}
