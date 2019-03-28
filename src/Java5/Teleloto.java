package Java5;

import java.io.*;
import java.util.Arrays;

public class Teleloto {

    public static void main(String[] args) {
        String duomenuFailoPath = new File("").getAbsolutePath()
                + "/src/java5/Duomenys.txt";
        skaityti(duomenuFailoPath);
    }

    public static void skaityti(String failas) {
        Integer[] isleistaAntBilietu = new Integer[0];
        Integer[] laimetaPinigu = new Integer[0];
        String rezultatuFailoPath = new File("").getAbsolutePath()
                + "/src/java5/Rezultatai.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String eilute = br.readLine();
            Integer kiekKartuPirkta = Integer.parseInt(eilute);
            eilute = br.readLine();
            for (int i = 0; i < kiekKartuPirkta; i++) {
                String[] reiksmes = eilute.split(" ");
                isleistaAntBilietu = pridetiElementa(isleistaAntBilietu,
                        Integer.parseInt(reiksmes[0]));
                laimetaPinigu = pridetiElementa(laimetaPinigu,
                        Integer.parseInt(reiksmes[1]));
                eilute = br.readLine();
            }
            rasyti(rezultatuFailoPath, isleistaAntBilietu, laimetaPinigu);
        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
    }

    public static void rasyti(String failas, Integer[] isleistaAntBilietu,
                              Integer[] laimetaPinigu) {
        try (BufferedWriter output = new BufferedWriter(new FileWriter(failas))) {
            Integer isleistasPiniguKiekisAntBilietu = suma(isleistaAntBilietu);
            Integer laimetaPiniguSuma = suma(laimetaPinigu);
        output.write( isleistasPiniguKiekisAntBilietu + " Lt " + laimetaPiniguSuma + " Lt\n");
        output.write("Didziausias laimejimas " + max(laimetaPinigu)+"\n");
        output.write("Petras pirko " +
                pirktuBilietuKiekis(isleistasPiniguKiekisAntBilietu) + " bilietus\n");
        if(laimetaPiniguSuma - isleistasPiniguKiekisAntBilietu > 0) {
            output.write("Pelnas " + (laimetaPiniguSuma - isleistasPiniguKiekisAntBilietu)
                    + " Lt");
        } else if(laimetaPiniguSuma - isleistasPiniguKiekisAntBilietu == 0) {
            output.write("Lygiosios " + (laimetaPiniguSuma - isleistasPiniguKiekisAntBilietu)
                    + " Lt");
        } else {
            output.write("Nuostolis " + (laimetaPiniguSuma - isleistasPiniguKiekisAntBilietu)
                    + " Lt");
        }
        output.write("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Integer pirktuBilietuKiekis(Integer suma) {
        return suma/2;
    }

    public static Integer suma(Integer[] skaiciai) {
        Integer suma = 0;
        for (Integer skaicius: skaiciai) {
            suma += skaicius;
        }
        return suma;
    }

    public static Integer max(Integer[] skaiciai) {
        Integer max = 0;
        for(Integer skaicius: skaiciai) {
            if(max < skaicius) {
                max = skaicius;
            }
        }
        return max;
    }

    public static Integer[] pridetiElementa(Integer[] masyvas, Integer skaicius) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = skaicius;
        return masyvas;
    }
}
