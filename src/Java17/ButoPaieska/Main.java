package Java17.ButoPaieska;

import Java17.Studentai.Studentas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String butuFailas = new File("").getAbsolutePath()
                + "/src/java17/ButoPaieska/Duomenys.txt";
        String kriterijuFailas = new File("").getAbsolutePath()
                + "/src/java17/ButoPaieska/Kriterijai.txt";

        List<Butas> butai = skaitytiButus(butuFailas);
        System.out.println(butai);

        Kriterijus kriterijai = skaitytiKriterijus(kriterijuFailas);
//        System.out.println(kriterijai);

//        List<Butas> atrinktiButai = filtruotiTinkamusButus(butai, kriterijai);
//        System.out.println(atrinktiButai);
//        Collections.sort(atrinktiButai);
//        System.out.println(atrinktiButai);
        Collections.sort(butai, (o1, o2) -> o1.getKambariuSk().compareTo(o2.getKambariuSk()));
        System.out.println(butai);
    }

    public static List<Butas> filtruotiTinkamusButus(List<Butas> sarasas, Kriterijus kriterijai) {
        List<Butas> atrinktiButai = new ArrayList<>();

        for(Butas obj: sarasas) {
            if (obj.getKambariuSk() >= kriterijai.getNuoKambariuSk() &&
            obj.getKambariuSk() <= kriterijai.getIkiKambariuSk() &&
            obj.getKvadratura() >= kriterijai.getNuoPlotas() &&
            obj.getKvadratura() <= kriterijai.getIkiPlotas() &&
            obj.getNuomosKaina() >= kriterijai.getNuoKaina() &&
            obj.getNuomosKaina() <= kriterijai.getIkiKaina()) {
                atrinktiButai.add(obj);
            }
        }
        return atrinktiButai;
    }

    public static List<Butas> skaitytiButus(String failas) {
        List<Butas> objektuMasyvas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            Integer eilKiekis = Integer.parseInt(line);
            line = br.readLine();
            for(int i = 0; i < eilKiekis; i++) {
                String[] objektai = line.split(" ");
                Integer butoNr = Integer.parseInt(objektai[0]);
                String gatve = objektai[1] + objektai[2] + objektai[3];
                Integer kambariuSk = Integer.parseInt(objektai[4]);
                Double kvadratura = Double.parseDouble(objektai[5]);
                Double kaina = Double.parseDouble(objektai[6]);
                objektuMasyvas.add(new Butas(butoNr, gatve,
                        kambariuSk, kvadratura, kaina));
                line = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuMasyvas;
    }

    public static Kriterijus skaitytiKriterijus(String failas) {
        Kriterijus obj = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            String[] objektas = line.split(" ");
            Integer minKambariuSk = Integer.parseInt(objektas[0]);
            Integer maxKambariuSk = Integer.parseInt(objektas[1]);

            line = br.readLine();
            objektas = line.split(" ");
            Double minPlotas = Double.parseDouble(objektas[0]);
            Double maxPlotas = Double.parseDouble(objektas[1]);

            line = br.readLine();
            objektas = line.split(" ");
            Double minKaina = Double.parseDouble(objektas[0]);
            Double maxKaina = Double.parseDouble(objektas[1]);

            obj = new Kriterijus(minKambariuSk, maxKambariuSk,
                    minPlotas, maxPlotas, minKaina, maxKaina);
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return obj;
    }
}
