package Java8.Figuros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String failas = new File("").getAbsolutePath() + "/src/java8/Figuros/Duomenys.txt";
        Figura[] arr = skaityti(failas);
        Figuros konteineris = new Figuros(arr);

        Figura maxPlotas = konteineris.maxPlotas();

        for(Figura obj: arr) {
            System.out.println(obj.spausdinti());
        }
//        System.out.println(Arrays.toString(arr));
    }

    public static Figura[] skaityti(String failas) {
        Figura[] objektuArr = new Figura[2];
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            Integer indeksas = 0;
            while (line != null) {
                objektas = line.split(" ");
                if (objektas.length == 1) {
                    Kvadratas obj = new Kvadratas(Double.parseDouble(objektas[0]));
                    objektuArr[indeksas] = obj;
                } else if (objektas.length == 2) {
                    Staciakampis obj = new Staciakampis(Double.parseDouble(objektas[0]),
                            Double.parseDouble(objektas[1]));
                    objektuArr[indeksas] = obj;
                }

                line = br.readLine();
                indeksas++;
            }


        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuArr;
    }
}
