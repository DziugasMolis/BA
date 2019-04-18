package Java18.Begikai;

import Java18.Buitine_Technika.Preke;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String skaitymoFailas = new File("").getAbsolutePath() + "/src/java18/Begikai/Duomenys.txt";
        Map<Integer, Begikas> begikai = skaityti(skaitymoFailas);
//        System.out.println(begikai);

        List<Begikas> finisave = finisave(begikai);
//        System.out.println(finisave);

        Collections.sort(finisave);
//        System.out.println(finisave);
        spausdinti(finisave);
    }

    public static void spausdinti(List<Begikas> begikai) {

        System.out.println(begikai.get(0).getVardas() + " " +
                begikai.get(0).getPavarde() + " I vieta");
        begikai.forEach(s -> System.out.println(s));
    }

    public static List<Begikas> finisave(Map<Integer, Begikas> begikai) {
        List<Begikas> filtruoti = new ArrayList<>();
        for(Begikas obj: begikai.values()) {
            if(obj.getPunktai().contains(obj.getPunktuKiekis())) {
                filtruoti.add(obj);
            }
        }
        return filtruoti;
    }


    public static Integer rastiDidziausiaKiekiAplankytuPunktu
            (Map<Integer, Begikas> begikai) {
        Integer max = 0;
        for(Begikas obj : begikai.values()) {
            if(max < obj.getPunktai().size()) {
                max = obj.getPunktai().size();
            }
        }
        return max;
    }


    public static Map<Integer, Begikas> skaityti(String failas) {
        Map<Integer, Begikas> begikuMap = new HashMap();
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            Integer begikuSkaicius = Integer.parseInt(br.readLine());
            String line = br.readLine();

            for(int i = 0; i < begikuSkaicius; i++) {
                begikuMap.put(i+1, nuskaitytiBegika(line.split(" "),i+1));
                line = br.readLine();
            }

            Integer punktuSkaicius = Integer.parseInt(line);
            line = br.readLine();

            for(int i = 0; i < punktuSkaicius; i++) {
                sudetiPunktus(begikuMap, line.split(" "), punktuSkaicius);
                line = br.readLine();
            }


        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println(e);
        }
        return begikuMap;
    }

    public static Begikas nuskaitytiBegika(String[] eilute, Integer begikoNr) {
        return new Begikas(begikoNr, eilute[0], eilute[1], eilute[2], eilute[3], 0);
    }

    public static void sudetiPunktus(Map<Integer, Begikas> begikuMap, String[] eilute, Integer punktuKiekis) {
        Integer punktoNr = Integer.parseInt(eilute[0]);
        Integer begikuKiekis = Integer.parseInt(eilute[1]);
        for(int i = 2;i < begikuKiekis + 2; i++) {
            Integer begikoNr = Integer.parseInt(eilute[i]);
            begikuMap.get(begikoNr).getPunktai().add(punktoNr);
            begikuMap.get(begikoNr).setPunktuKiekis(punktuKiekis);
        }
    }
}
