package Java9.Zmones;

public class ZmoniuKonteineris {
    private Zmogus[] arr;

    public ZmoniuKonteineris(Zmogus[] arr) {
        this.arr = arr;
    }

    public void spausdinti() {
        for(Zmogus obj: arr) {
            System.out.println(obj);
        }
    }

    public Zmogus rastiVyriausia() {
        Integer max = 0;
        Integer maxIndeksas = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i].getAmzius()) {
                max = arr[i].getAmzius();
                maxIndeksas = i;
            }
        }
        return arr[maxIndeksas];
    }

    public Integer kiekis(String koIeskau) {
        Integer kiekis = 0;
        for(int i = 0; i < arr.length; i++) {
            if(koIeskau.equals("S")) {
                if(arr[i] instanceof Studentas) {
                    kiekis++;
                }
            } else {
                if(arr[i] instanceof Darbuotojas) {
                    kiekis++;
                }
            }
        }
        return kiekis;
    }
}
