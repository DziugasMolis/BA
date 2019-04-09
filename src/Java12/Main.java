package Java12;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String args[]) {
        Objektas obj = new Objektas("Testas");
        Objektas obj1 = new Objektas(2);

        koksTipas(obj);
        koksTipas(obj1);

//        DviejuTipu<Integer, String> mapObj1 = new DviejuTipu<>(1, "Jonas");
////        DviejuTipu<Integer, String> mapObj2 = new DviejuTipu<>(999999, "Petras");
////        DviejuTipu<Integer, String>[] arr = new DviejuTipu[2];
////        arr[0] = mapObj1;
////        arr[1] = mapObj2;

        Mapas map = new Mapas();
        map.add(1, "Jonas");
        map.add(2, "Petras");

        map.spausdinti();
        System.out.println(map.getValueByKey(1));

        Map<Integer, String> mapas = new HashMap<>();
        mapas.put(1, "Jonas");
        mapas.put(2, "Petras");
        System.out.println(mapas.get(1));
    }

    public static void koksTipas(Objektas obj) {
        if (obj.get() instanceof Integer) {
            System.out.println("Skaicius");

        } else if (obj.get() instanceof String) {
            System.out.println("raides");
            try {
                Integer suma = (int) obj.get();
            } catch (ClassCastException ex) {
                System.out.println(ex);
                System.out.println("Nepavyko castinti");
            }
        }
    }

}
