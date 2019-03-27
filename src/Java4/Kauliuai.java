package Java4;

import java.io.*;
import java.util.Arrays;

public class Kauliuai {

    public static void main(String[] args) {
        String duomenuFailoPath = new File("").getAbsolutePath()
                + "/src/java4/DuomenysKauliukai.txt";
        skaityti(duomenuFailoPath);
    }

    public static void skaityti(String failas) {
        Integer[] ismestosAkutes = new Integer[0];
        String rezultatuFailoPath = new File("").getAbsolutePath()
                + "/src/java4/kauliukuRezultatai.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String eilute = br.readLine();
            Integer kiekKartuMesta = Integer.parseInt(eilute);
            eilute = br.readLine();
            for (int i = 0; i < kiekKartuMesta; i++) {
                ismestosAkutes = pridetiElementa(ismestosAkutes, Integer.parseInt(eilute));
                eilute = br.readLine();
            }
            rasyti(rezultatuFailoPath, ismestosAkutes);
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
    }

    public static void rasyti(String failas, Integer[] skaiciai) {
        Integer[] kauliukoAkutes = {1, 2, 3, 4, 5, 6};
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {

            for (int i = 0; i < kauliukoAkutes.length; i++) {
                Integer kiekKartuRastas = 0;
                for (int j = 0; j < skaiciai.length; j++) {
                    if (kauliukoAkutes[i] == skaiciai[j]) {
                        kiekKartuRastas++;
                    }
                }
                output.write("Skaicius = " + kauliukoAkutes[i] +
                        " Kartojosi " + kiekKartuRastas + " kartu.\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Boolean arEgzistuojaMasyve(Integer[] skaiciai,
                                             Integer tikrinamasSkaicius) {
        for (int i = 0; i < skaiciai.length; i++) {
            if (tikrinamasSkaicius == skaiciai[i]) {
                return true;
            }
        }
        return false;
    }

    public static Integer[] pridetiElementa(Integer[] masyvas, Integer skaicius) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = skaicius;
        return masyvas;
    }
}
