package Java9.Zmones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String failas = new File("").getAbsolutePath() + "/src/java9/Zmones/Duomenys.txt";
        Zmogus[] arr = skaityti(failas);
        ZmoniuKonteineris obj = new ZmoniuKonteineris(arr);
        System.out.println(obj.kiekis("D"));
    }

    public static Zmogus[] skaityti(String failas) {
        Zmogus[] objektuArr = new Zmogus[0];
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                objektas = line.split(" ");
                Zmogus obj;
                if(objektas[0].equals("S")) {
                    obj = new Studentas(objektas[1], objektas[2],
                            Integer.parseInt(objektas[3]), Integer.parseInt(objektas[4]),
                            objektas[5]);
                } else {
                    obj = new Darbuotojas(objektas[1], objektas[2],
                            Integer.parseInt(objektas[3]), Integer.parseInt(objektas[4]),
                            objektas[5]);
                }
                objektuArr = pridetiElementa(objektuArr, obj);
                line = br.readLine();
            }


        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuArr;
    }

    public static Zmogus[] pridetiElementa(Zmogus[] masyvas, Zmogus obj) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = obj;
        return masyvas;
    }
}
