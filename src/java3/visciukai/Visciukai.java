package java3.visciukai;

import java.io.*;

public class Visciukai {
    public static void main(String[] args) {
        String duomenuFailoPath = new File("").getAbsolutePath()
                + "/src/java3/visciukai/duomenys.txt";
        skaityti(duomenuFailoPath);
    }

    public static void skaityti(String failas) {
        int[] mases = new int[4];
        int[] amziai = new int[4];
        String rezultatuFailoPath = new File("").getAbsolutePath()
                + "/src/java3/visciukai/rezultatai.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String eilute = br.readLine();
            Integer eiluciuSkaicius = Integer.parseInt(eilute);
            eilute = br.readLine();
            for (int i = 0; i < eiluciuSkaicius; i++) {
                String[] eilutesSkaiciai = eilute.split(" ");
                mases[i] = Integer.parseInt(eilutesSkaiciai[0]);
                amziai[i] = Integer.parseInt(eilutesSkaiciai[1]);
                eilute = br.readLine();
            }
            rasyti(rezultatuFailoPath, mases, amziai);
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
    }

    public static void rasyti(String failas, int[] mases, int[] amziai) {
        int storiausioIndeksas = 0;
        int storiausioSvoris = 0;
        int jauniausioIndeksas = 0;
        int jauniausioAmzius = 100;
        for (int i = 0; i < mases.length; i++) {
            if (storiausioSvoris < mases[i]) {
                storiausioSvoris = mases[i];
                storiausioIndeksas = i;
            }
            if (jauniausioAmzius > amziai[i]) {
                jauniausioAmzius = amziai[i];
                jauniausioIndeksas = i;
            }
        }
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            output.write("Pradiniai duomenys:\n");
            for (int i = 0; i < mases.length; i++) {
                output.write("Visciukas Nr." + (i + 1) + " mase: " + mases[i] +
                        " amzius: " + amziai[i] + "\n");
            }
            output.write("Rezultatai:\n");
            output.write("Didziausias visciukas: Nr." + (storiausioIndeksas+1) + "\n");
            output.write("Jauniausias visciukas: Nr." + (jauniausioIndeksas+1) + "\n");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
