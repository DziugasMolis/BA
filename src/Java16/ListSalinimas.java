package Java16;

import Java16.Testai.Zmogus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListSalinimas {

    public static void main(String[] args) {
        List<Zmogus> zodziai = new ArrayList<>();
        zodziai.add(new Zmogus("Jonas", "Jonaitis", 12));
        zodziai.add(new Zmogus("Jonas", "Jonaitis", 13));
        zodziai.add(new Zmogus("Jonas", "Jonaitis", 14));
        zodziai.add(new Zmogus("Jonas", "Jonaitis", 15));
        zodziai.add(new Zmogus("Jonas", "Jonaitis", 16));
        zodziai.add(new Zmogus("Jonas", "Jonaitis", 19));


        System.out.println(zodziai);
        Iterator iter = zodziai.iterator();
        Zmogus lyginamas = new Zmogus("Jonas", "Jonaitis", 16);
        while (iter.hasNext()) {
            if (iter.next().equals(lyginamas)) {
                iter.remove();
            }
        }
        System.out.println(zodziai);

    }
}
