package Java17.Studentai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String studFailas = new File("").getAbsolutePath() + "/src/java17/Studentai/Studentai.txt";
        Map<String, List<Studentas>> nuskaityti = skaitytiZaidejus(studFailas);
        System.out.println(nuskaityti);
        System.out.println(daugiausiaStudentuTurintiGrupe(nuskaityti));
    }

    public static Map<String, List<Studentas>> skaitytiZaidejus(String failas) {
        Map<String, List<Studentas>> objektuMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            while (line != null) {
                String[] objektas = line.split(" ");
                String vardas = objektas[0];
                String pavarde = objektas[1];
                String grupe = objektas[2];
                if(objektuMap.containsKey(grupe)) {
                    objektuMap.get(grupe).add(new Studentas(vardas,
                            pavarde, grupe));
                } else {
                    objektuMap.put(grupe, new ArrayList<>());
                    objektuMap.get(grupe).add(new Studentas(vardas,
                            pavarde, grupe));
                }

                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMap;
    }


    public static String daugiausiaStudentuTurintiGrupe(Map<String, List<Studentas>> studMap) {
        String didziausiaGrupe = "";
        Integer max = 0;
        for (List<Studentas> entry : studMap.values()) {
            if(entry.size() > max) {
                max = entry.size();
                didziausiaGrupe = entry.get(0).getGrupe();
            }
        }
        return didziausiaGrupe;
    }
}
