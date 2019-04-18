package Java18.Buitine_Technika;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String skaitymoFailas = new File("").getAbsolutePath() + "/src/java18/Buitine_Technika/duomenys.txt";
        String uzsakymuFailas = new File("").getAbsolutePath() + "/src/java18/Buitine_Technika/uzsakymai.txt";
        Map<Integer, Preke> prekes = skaitytiPrekes(skaitymoFailas);
        Map<Integer, Integer> uzsakymai = skaitytiUzsakymus(uzsakymuFailas);
//        System.out.println(prekes);
//        System.out.println(uzsakymai);

        Map<Integer, Preke> isfiltruoti = isfiltruoti(prekes, uzsakymai);
        System.out.println(isfiltruoti);
        System.out.println(prekes);
    }

    public static Map<Integer, Preke> isfiltruoti(Map<Integer, Preke> prekes, Map<Integer, Integer> uzsakymai) {
        Map<Integer, Preke> neberaSandelyje = new HashMap<>();
        for (Map.Entry<Integer, Integer> entry : uzsakymai.entrySet()) {
            if(prekes.get(entry.getKey()) != null) {
                Preke obj = prekes.get(entry.getKey());
                obj.setKiekis(obj.getKiekis() - entry.getValue());
                if(obj.getKiekis() < 0) {
                    prekes.remove(entry.getKey());
                    obj.setKiekis(Math.abs(obj.getKiekis()));
                    neberaSandelyje.put(entry.getKey(), obj);
                } else if(obj.getKiekis() == 0) {
                    prekes.remove(entry.getKey());
                }
            }
        }
        return neberaSandelyje;
    }


    public static Map<Integer, Preke> skaitytiPrekes(String failas) {
        Map<Integer, Preke> prekiuMap = new HashMap();
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            Integer prekiuSkaicius = Integer.parseInt(br.readLine());
            String line = br.readLine();
            for (int i = 0; i < prekiuSkaicius; i++) {
                String[] objektas = line.split(" ");
                String pavadinimas = objektas[0];
                Integer ID = Integer.parseInt(objektas[1]);
                Integer kiekis = Integer.parseInt(objektas[2]);
                Double kaina = Double.parseDouble(objektas[3]);
                prekiuMap.put(ID, new Preke(pavadinimas, ID, kiekis, kaina));
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println(e);
        }
        return prekiuMap;
    }

    public static Map<Integer, Integer> skaitytiUzsakymus(String failas) {
        Map<Integer, Integer> uzsakymuMap = new HashMap();
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            Integer uzsakymuSk = Integer.parseInt(br.readLine());
            String line = br.readLine();
            for (int i = 0; i < uzsakymuSk; i++) {
                String[] objektas = line.split(" ");
                Integer ID = Integer.parseInt(objektas[0]);
                Integer kiekis = Integer.parseInt(objektas[1]);
                uzsakymuMap.put(ID, kiekis);
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println(e);
        }
        return uzsakymuMap;
    }
}
