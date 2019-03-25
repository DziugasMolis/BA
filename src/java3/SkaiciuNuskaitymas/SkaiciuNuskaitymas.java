package java3.SkaiciuNuskaitymas;

import java.io.*;

public class SkaiciuNuskaitymas {

    public static void main(String[] args) {
        String duomenuFailoPath = new File("").getAbsolutePath()
                + "/src/java3/SkaiciuNuskaitymas/duomenys.txt";
        skaityti(duomenuFailoPath);
    }

    public static void skaityti(String failas) {
        String visosEilutes = "";
        String rezultatuFailoPath = new File("").getAbsolutePath()
                + "/src/java3/SkaiciuNuskaitymas/rezultatai.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String eilute = br.readLine();
            while (eilute != null) {
                visosEilutes += eilute + " ";
//                String[] eilutesSkaiciai = eilute.split(" ");
//                for(int i = 0; i < eilutesSkaiciai.length; i++) {
////                    System.out.println(eilutesSkaiciai[i]);
//                    skaiciai[indeksas] = Integer.parseInt(eilutesSkaiciai[i]);
//                    indeksas++;
//                }
                eilute = br.readLine();
            }
            rasyti(rezultatuFailoPath, visosEilutes);
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
    }

    public static void rasyti(String failas, String visosEilutes) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            output.write(visosEilutes.split(" ").length + "\n");
            output.write(visosEilutes);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
