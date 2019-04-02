package Java8.Paveldimumas;

public class Human {
    private String vardas;
    private String pavarde;

    public Human() {

    }

    public Human(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }


    public String toString() {
        return vardas + " " + pavarde;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }
}
