package Java8.Paveldimumas;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human();

        Human stud = new Studentas();
        Human teacher = new Teacher("dalykas", "Jonas", "jonaitis");


//        System.out.println(stud);

        Human[] arr = {stud, teacher};
        System.out.println(Arrays.toString(arr));

        for (Human obj: arr) {
            if(obj instanceof Studentas) {
                System.out.println("Studentas" + ((Studentas)obj).getKlase());
            } else if (obj instanceof Teacher) {
                System.out.println("Mokytojas " + ((Teacher)obj).getDalykas());
            }
        }
    }

}
