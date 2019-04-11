package java14.demo5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Collection<String> set = new ArrayList<>();

        set.add("Kaunas");
        set.add("Vilnius");
        set.add("Kaunas");
        set.add("Alytus");
        set.add("Klaipėda");
        set.add("Vilnius");
        set.add("Kaunas");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if(s.equals("Kaunas")) {
                iterator.remove();
            }
        }

        System.out.println(set);

//        for(String obj: set) {
//            if(obj.equals("Kaunas")) {
//                set.remove(obj);
//            }
//        }
//        System.out.println(set);
    }
}
