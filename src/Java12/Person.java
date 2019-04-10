package Java12;

public class Person {
    String name;
    int age;

    Person(String name, int age){
        this.name=name; this.age=age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vardas: " + name + " amzius: " + age;
    }

//    @Override
//    public int compareTo(Person other) {
//        return this.getName().compareTo(other.getName());
//    }
}
