package Java9.Filmai;

import Java10.Kintamieji;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String failas = new File("").getAbsolutePath()
                + "/src/java9/Filmai/Duomenys.txt";
        Filmas[] arr = skaityti(failas);
        System.out.println(Arrays.toString(arr));

        final String a = "aaa";
        System.out.println(Kintamieji.skaicius);
    }

    public static Filmas[] skaityti(String failas) {
        Filmas[] objektuArr = null;
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            Integer eilKiekis = Integer.parseInt(line);
            objektuArr = new Filmas[eilKiekis];
            line = br.readLine();
            for(int i = 0; i < eilKiekis; i++) {
                objektas = line.split(" ");
                Integer metai = Integer.parseInt(objektas[0]);
                Integer indeksas = 1;
                String pav = "";
                while (indeksas < objektas.length - 3) {
                    pav += objektas[indeksas] + " ";
                    indeksas++;
                }
                Integer valandos = Integer.parseInt(objektas[indeksas++]);
                Integer minutes= Integer.parseInt(objektas[indeksas++]);
                Integer ziurovai = Integer.parseInt(objektas[indeksas++]);
                Filmas obj = new Filmas(metai, pav,
                        valandos,minutes,ziurovai);
                objektuArr[i] = obj;
                line = br.readLine();
//                try{
//                    Integer.valueOf(str);
//                } catch (NumberFormatException e) {
//                    //not an integer
//                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuArr;
    }
}
