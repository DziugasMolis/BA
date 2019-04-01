package Java7.Human;

public class Main {
    public static void main(String[] args) {
        Integer[] paz1 = new Integer[]{8, 7, 6, 4, 7, 8};
        Integer[] paz2 = new Integer[]{4, 3, 2, 4, 7, 8};
        Integer[] paz3 = new Integer[]{4, 5, 4, 4, 4, 4};

        Mokinys mok1 = new Mokinys("Petriukas", "Petraitis", "3b", paz1);
        Mokinys mok2 = new Mokinys("Andrius", "Petraitis", "2b", paz2);
        Mokinys mok3 = new Mokinys("Jonas", "Petraitis", "3b", paz3);
        Mokinys mok4 = new Mokinys("Kazys", "Petraitis", "2b", paz1);

        Mokinys[] arr = new Mokinys[] {mok1, mok2, mok3, mok4};
        spausdinti(arr);

        System.out.println("Geriausias mokinys");
        System.out.println(arr[gautiGeriausioMokinioIndeksa(arr)]);

        daugiausiaMokiniu(arr);
    }

    public static void spausdinti(Mokinys[] arr) {
        for(Mokinys obj: arr) {
            System.out.println(obj);
        }
    }

    public static Integer gautiGeriausioMokinioIndeksa(Mokinys[] arr){
        Integer geriausioIndeksas = 0;
        Double maxAvg = 0d;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i].avg() > maxAvg) {
                maxAvg = arr[i].avg();
                geriausioIndeksas = i;
            }
        }
        return geriausioIndeksas;
    }

    public static void daugiausiaMokiniu(Mokinys[] arr) {
        String maxKlase = arr[0].getKlase();
        Integer maxKiekKartojasi = 1;

        for(int i = 0; i < arr.length; i++) {
            String klase = arr[i].getKlase();
            Integer kartojasi = 1;
            for(int j = i + 1; j < arr.length; j++) {
                if(klase.equals(arr[j].getKlase())) {
                    kartojasi++;
                }
            }
            if(maxKiekKartojasi <= kartojasi) {
                maxKiekKartojasi = kartojasi;
                maxKlase = klase;
            }

        }

        System.out.println("Daugiausia mokiniu turinti klase " + maxKlase);
    }

}
