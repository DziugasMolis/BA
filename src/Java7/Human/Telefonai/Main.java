package Java7.Human.Telefonai;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String telefonuFailas = new File("").getAbsolutePath() + "/src/java7/Human/Telefonai/Duomenys.txt";
        Telefonas[] telefonai = skaitytiTelefonus(telefonuFailas);
        Integer populiariausioId = gautiMaziausiaiPopuliariausioIndeksa(telefonai);
        System.out.println("Populiariausias: " + telefonai[populiariausioId]);
//        System.out.println(Arrays.toString(telefonai));
    }

    public static Integer gautiMaziausiaiPopuliariausioIndeksa(Telefonas[] telefonai) {
        Integer maxId = 0;
        Integer max = 0;
        for(int i = 0; i < telefonai.length; i++) {
            if(telefonai[i].getPardavimuSkaicius() > max) {
                max = telefonai[i].getPardavimuSkaicius();
                maxId = telefonai[i].getId();
            }
        }
        return maxId;
    }

    public static Telefonas[] skaitytiTelefonus(String failas) {
        Telefonas[]  objektuArr = null;
        String[] objektas = null;
        try (BufferedReader br = new BufferedReader(new FileReader(failas))) {
            String line = br.readLine();
            Integer telefonuSkaicius = Integer.parseInt(line);
            objektuArr = new Telefonas[telefonuSkaicius];
            for(int i = 0; i < telefonuSkaicius; i++) {
                line = br.readLine();
                if(line != null) {
                    objektas = line.split(" ");
                    Integer id = Integer.parseInt(objektas[0]);
                    String pav = objektas[1] + objektas[2] + objektas[3];
                    Double kaina = Double.parseDouble(objektas[4]);
                    Telefonas obj = new Telefonas(id, pav, kaina);
                    objektuArr[i] = obj;
                }
            }
            line = br.readLine();
            Integer pardavimuEiluciuSkaicius=Integer.parseInt(line);
            for(int i = 0; i < pardavimuEiluciuSkaicius; i++) {
                line = br.readLine();
                if(line != null) {
                    objektas = line.split(" ");
                    Integer telefonoId = Integer.parseInt(objektas[0]);
                    Integer pardavimuSkaicius = Integer.parseInt(objektas[1]);
                    Integer telefonoIndeksas = grazintiTelefonoIndeksa(telefonoId,
                            objektuArr);
                    if(telefonoIndeksas != null) {
                        objektuArr[telefonoIndeksas].setPardavimuSkaicius(
                                objektuArr[telefonoIndeksas].getPardavimuSkaicius() + pardavimuSkaicius);
                    }
                }
            }
            line = br.readLine();

        } catch (FileNotFoundException ex) {
            System.out.println("Failas nerastas");
        } catch (Exception e) {
            System.out.println("something else went wrong");
        }
        return objektuArr;
    }

    public static Integer grazintiTelefonoIndeksa(Integer id, Telefonas[] arr) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static Telefonas[] pridetiElementa(Telefonas[] masyvas, Telefonas obj) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = obj;
        return masyvas;
    }
}
