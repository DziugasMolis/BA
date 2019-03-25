package java3;

import java.io.*;


public class SkaitymasIrRasymas {

    public static void main(String[] args) {
        String duomenuFailoPath = new File("").getAbsolutePath() + "/src/java3/duomenys.txt";
        skaityti(duomenuFailoPath);

        String rezultatuFailoPath = new File("").getAbsolutePath() + "/src/java3/rezultatai.txt";
        rasyti(rezultatuFailoPath);
    }


    public static void skaityti(String failas) {
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String eilute = br.readLine();
            while (eilute != null) {
                System.out.println(eilute);
                eilute = br.readLine();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
    }

    public static void rasyti(String failas) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            output.write("parasem i faila");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
