package Java10.Employee;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee.Address ad1 = new Employee.Address("Kaunas",
                "Savanoriu", 10);
        Employee.Address ad2 = new Employee.Address("Vilnius",
                "Savanoriu", 11);
        Employee.Address ad3 = new Employee.Address("Siauliai",
                "Vilniaus", 11);
        Employee.Address ad4 = new Employee.Address("Klaipeda",
                "Savanoriu", 11);
        Employee.Address ad5 = new Employee.Address("Panevezys",
                "Vilniaus", 11);


        Employee obj1 = new Employee("Jonas", 1000d,
                ad1);
        Employee obj2 = new Employee("Jonas", 1000d,
                ad2);
        Employee obj3 = new Employee("Jonas", 1000d,
                ad3);
        Employee obj4 = new Employee("Jonas", 1000d,
                ad4);
        Employee obj5 = new Employee("Jonas", 1000d,
                ad5);
        Employee obj6 = new Employee("Jonas", 1000d,
                ad1);
        Employee obj7 = new Employee("Jonas", 1000d,
                ad2);
        Employee obj8 = new Employee("Jonas", 1000d,
                ad3);
        Employee obj9 = new Employee("Jonas", 1000d,
                ad4);
        Employee obj10 = new Employee("Jonas", 1000d,
                ad5);
        Employee obj11 = new Employee("Jonas", 1000d,
                ad1);
        Employee[] arr = {obj1, obj2, obj3, obj4, obj5,
                obj6, obj7, obj8, obj9, obj10, obj11};

        System.out.println("Skirtingu miestu kiekis = " + skirtingiMiestai(arr));
        System.out.println("Skirtingu gatviu kiekis = " + skirtingosGatves(arr));

        AlguSkaiciavimai proc10 = new AlguSkaiciavimai() {
            @Override
            public Double pakeltiAlga(Double alga) {
                return alga * 1.1;
            }
        };
        pakeltiAlga(arr, proc10);
        System.out.println(Arrays.toString(arr));
    }


    public static void pakeltiAlga(Employee[] arr, AlguSkaiciavimai obj) {
        for(Employee em: arr) {
            em.setSalary(obj.pakeltiAlga(em.getSalary()));
        }
    }


    public static Integer skirtingiMiestai(Employee[] arr) {
        Integer skirtinguKiekis = 1;
        String[] skirtingiMiestai = {arr[0].getAddress().getCity()};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < skirtingiMiestai.length; j++) {
                if (!arEgzistuojaMasyve(skirtingiMiestai, arr[i].getAddress().getCity())) {
                    skirtingiMiestai = pridetiElementa(skirtingiMiestai,
                            arr[i].getAddress().getCity());
                    break;
                }
            }
        }
        return skirtingiMiestai.length;
    }

    public static Integer skirtingosGatves(Employee[] arr) {
        Integer skirtinguKiekis = 1;
        String[] skirtingosGatves = {arr[0].getAddress().getStreet()};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < skirtingosGatves.length; j++) {
                if (!arEgzistuojaMasyve(skirtingosGatves, arr[i].getAddress().getStreet())) {
                    skirtingosGatves = pridetiElementa(skirtingosGatves,
                            arr[i].getAddress().getStreet());
                    break;
                }
            }
        }
        return skirtingosGatves.length;
    }

    public static Boolean arEgzistuojaMasyve(String[] arr, String miestas) {
        for (String el : arr) {
            if (el.equals(miestas)) {
                return true;
            }
        }
        return false;
    }

    public static String[] pridetiElementa(String[] masyvas, String obj) {
        masyvas = Arrays.copyOf(masyvas, masyvas.length + 1);
        masyvas[masyvas.length - 1] = obj;
        return masyvas;
    }
}
