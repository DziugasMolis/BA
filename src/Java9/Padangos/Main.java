package Java9.Padangos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String failas = new File("").getAbsolutePath() + "/src/java9/Padangos/Duomenys.txt";
        Padanga[] arr = skaityti(failas);
        Padanga[] atrinktos = tinkamosPadangos(arr);
        System.out.println("Tinkamu padangu skaicius " + atrinktos.length);
        System.out.println("Jos kainuotu: " + suma(atrinktos) + "Lt");
    }

    public static Double suma(Padanga[] arr) {
        Double suma = 0d;
        for(Padanga obj: arr) {
            suma += obj.getKaina();
        }
        return suma;
    }

    public static Padanga[] skaityti(String failas) {
        Padanga[] objektuArr = null;
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            Padanga obj = nuskaitytiEilute(line);
            line = br.readLine();
            Integer padanguKiekis = Integer.parseInt(line);
            objektuArr = new Padanga[padanguKiekis+1];
            objektuArr[0] = obj;
            line = br.readLine();
            for (int i = 1; i < padanguKiekis + 1; i++) {
                obj = nuskaitytiEilute(line);
                objektuArr[i] = obj;
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuArr;
    }

    public static Padanga nuskaitytiEilute(String eil) {
        String[] objektas = eil.split(" ");
        Integer atstumas = Integer.parseInt(objektas[0]);
        Integer aukstis = Integer.parseInt(objektas[1]);
        Character greicioIndeksas = objektas[2].charAt(0);
        Character padangosKonstrukcija = objektas[2].charAt(1);
        String skersmuo = String.valueOf(objektas[2].charAt(2))
                + String.valueOf(objektas[2].charAt(3));
        Double kaina = 0.0;
        if (objektas.length == 4) {
            kaina = Double.parseDouble(objektas[3]);
        }
        return new Padanga(atstumas, aukstis, greicioIndeksas,
                padangosKonstrukcija, skersmuo, kaina);
    }

    public static Padanga[] tinkamosPadangos(Padanga[] arr) {
        Padanga[] tarpinisArr = new Padanga[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[0].getAtstumas().equals(arr[i].getAtstumas()) &&
                    arr[0].getAukstis().equals(arr[i].getAukstis()) &&
                    arr[0].getGreicioIndeksas().equals(arr[i].getGreicioIndeksas()) &&
                    arr[0].getPadangosKonstrukcija().equals(arr[i].getPadangosKonstrukcija()) &&
                    arr[0].getRatlankioSkersmuo().equals(arr[i].getRatlankioSkersmuo())) {
                tarpinisArr = pridetiElementa(tarpinisArr, arr[i]);
            }
        }
        return tarpinisArr;
    }

    public static Padanga[] pridetiElementa(Padanga[] masyvas, Padanga obj) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = obj;
        return masyvas;
    }
}
