package Java7.Human.Temperaturos;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String duomenys = new File("").getAbsolutePath()
                + "/src/java7/Human/Temperaturos/Duomenys.txt";
        String rez = new File("").getAbsolutePath()
                + "/src/java7/Human/Temperaturos/Rezultatai.txt";
        Menuo[] menesiai = skaityti(duomenys);
        rasyti(rez, menesiai);
    }

    public static Menuo[] skaityti(String failas) {
        Integer eiluciuKiekis = 0;
        Integer matavimuKiekis = 0;
        Menuo[] arr = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String eilute = br.readLine();
            String[] splitReiksmes = eilute.split(" ");
            eiluciuKiekis = Integer.parseInt(splitReiksmes[0]);
            arr = new Menuo[eiluciuKiekis];
            matavimuKiekis = Integer.parseInt(splitReiksmes[1]);
            eilute = br.readLine();
            for (int i = 0; i < eiluciuKiekis; i++) {
                splitReiksmes = eilute.split(" ");
                String menuo = splitReiksmes[0];
                Double[] temp = new Double[matavimuKiekis];
                for (int j = 1; j < splitReiksmes.length; j++) {
                    temp[j - 1] = Double.parseDouble(splitReiksmes[j]);
                }
                Menuo obj = new Menuo(menuo, temp);
                arr[i] = obj;
                eilute = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return arr;
    }

    public static void rasyti(String failas, Menuo[] arr) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            for (Menuo obj : arr) {
                output.write(obj.toString() + "\n");
            }
            output.write("Bendras matavimu vidurkis = " + String.format("%.2f", bendrasVid(arr)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Double bendrasVid(Menuo[] arr) {
        Double suma = 0d;
        for (Menuo obj : arr) {
            suma += obj.avg();
        }
        return suma / arr.length;
    }
}
