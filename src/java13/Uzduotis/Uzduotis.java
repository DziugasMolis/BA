package java13.Uzduotis;

import java13.data.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface Check<T> {
    int sort(T e1, T e2);
}

public class Uzduotis {
    public static void main(String[] args) {
        Container<Employee> box = new Container<>();
        box.add(new Employee("Pertras", 1000));
        box.add(new Employee("Stasys", 1200));
        box.add(new Employee("Jonas", 1100));
        for(int i = 0; i < box.size(); i++) {
            System.out.println(box.get(i));
        }
//        filter(box.selectionSort(box));
        System.out.println();

        List<Employee> tuscias = new ArrayList<>();
        tuscias.add(new Employee("Pertras", 1000));
        tuscias.add(new Employee("Stasys", 1200));
        tuscias.add(new Employee("Jonas", 1100));
        Collections.sort(tuscias, (o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
        tuscias.forEach((employee) -> employee.setSalary(500d));
        tuscias.forEach((employee) -> System.out.println(employee.getSalary()));
//        Check<Employee> check = ((e1, e2) -> {
//            return e1.getSalary().compareTo(e2.getSalary());
//        });
//        filterByFilter(box, check);
//        for(int i = 0; i < box.size(); i++) {
//            System.out.println(box.get(i));
//        }
//        tuscias.sort((Employee e1, Employee e2) -> (int) (e1.getAlga() - e2.getAlga()));
//        tuscias.forEach((employee) -> System.out.println(employee));
//        tuscias.iterator();



//        Check<Employee> check2 = ((e1, e2) -> {
//            return e1.getName().compareTo(e2.getName());
//        });
//        filterByFilter(box, check2);
//        System.out.println();
//        for(int i = 0; i < box.size(); i++) {
//            System.out.println(box.get(i));
//        }
//
//        System.out.println();
//        box.selectionSort(box.getAll());
    }


    public static void filterByFilter(Container<Employee> list,
                                      Check<Employee> filter) {
        Integer min = 0;
        for(int i = 0; i < list.size(); i++) {
            min = i;
            for(int j = i + 1; j < list.size(); j++) {
                if(filter.sort(list.get(i), list.get(j)) >= 0){
                    min = j;
                }
            }
            if (i != min) {
                Employee temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);
            }
        }
    }

}
