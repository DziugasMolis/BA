package Java8.Paveldimumas;

public class Teacher extends Human {
    private String dalykas;

    public Teacher(String dalykas, String vardas, String pavarde) {
        super(vardas, pavarde);
        this.dalykas = dalykas;
    }

    public String toString() {
        return super.toString() + " " + dalykas;
    }

    public String getDalykas() {
        return dalykas;
    }

    public void setDalykas(String dalykas) {
        this.dalykas = dalykas;
    }
}
