package Java4.VeiksmaiSuMasyvais;

import java.io.*;
import java.util.Arrays;

public class MasyvoApsukimas {
    public static void main(String[] args) {
        String duomenuFailoPath = new File("").getAbsolutePath()
                + "/src/java4/VeiksmaiSuMasyvais/duomenys.txt";
        skaityti(duomenuFailoPath);
    }

    public static void skaityti(String failas) {
        Integer[] skaiciai = new Integer[0];
        String rezultatuFailoPath = new File("").getAbsolutePath()
                + "/src/java4/VeiksmaiSuMasyvais/rezultatai.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String eilute = br.readLine();

            while (eilute != null) {
                String[] isskirtiSkaiciai = eilute.split(" ");
                for(int i = 0; i < isskirtiSkaiciai.length; i++) {
                    skaiciai = pridetiElementa(skaiciai,
                            Integer.parseInt(isskirtiSkaiciai[i]));
                }
                eilute = br.readLine();
            }
            rasyti(rezultatuFailoPath, skaiciai);
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
    }

    public static void rasyti(String failas, Integer[] skaiciai) {
        Integer suma = 0;
        Integer[] didesniUzVidurki = new Integer[0];
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            for(int i = 0; i < skaiciai.length;i++) {
                output.write(skaiciai[i] + " ");
                suma += skaiciai[i];
            }
            output.write("\n");
            Double vid = (double)suma / skaiciai.length;
            output.write("Vidurkis = " + vid);

            for(int i = 0; i < skaiciai.length; i++) {
                if(skaiciai[i] > vid) {
                    didesniUzVidurki = pridetiElementa(didesniUzVidurki, skaiciai[i]);
                }
            }
            output.write("\n");
            output.write("Skaiciai didesni uz vidurki: ");
            for(int i = 0; i < didesniUzVidurki.length;i++) {
                output.write(didesniUzVidurki[i] + " ");
            }

            Integer min = 100;
            Integer max = -100;
            for (int i = 0; i < skaiciai.length; i++) {
                if (skaiciai[i] < min) {
                    min = skaiciai[i];
                }
                if(skaiciai[i] > max) {
                    max = skaiciai[i];
                }
            }
            output.write("\n");
            output.write("Minimum = " + min + " Maximum = " + max);
            output.write("\n");
            Integer[] buveSkaiciai = new Integer[0];
            for(int i = 0; i < skaiciai.length - 1; i++) {
                if(!arEgzistuojaMasyve(buveSkaiciai, skaiciai[i])) {
                    buveSkaiciai = pridetiElementa(buveSkaiciai, skaiciai[i]);
                    Integer kiekKartuRastas = 1;
                    for (int j = i + 1; j < skaiciai.length; j++) {
                        if (skaiciai[i] == skaiciai[j]) {
                            kiekKartuRastas++;
                        }
                    }
                    output.write("Skaicius = " + skaiciai[i] +
                            " Kartojosi " + kiekKartuRastas + " kartu.\n");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Integer[] rikiuotiBurbuliuku() {

    }

    public static Boolean arEgzistuojaMasyve(Integer[] skaiciai,
                                             Integer tikrinamasSkaicius) {
        for(int i = 0; i < skaiciai.length;i++) {
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
