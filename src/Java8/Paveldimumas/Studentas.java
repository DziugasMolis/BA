package Java8.Paveldimumas;

public class Studentas extends Human {
    private Integer klase;

    public Studentas() {
        this(0, "tuscia", "tuscia");
    }

    public Studentas(Integer klase, String vardas, String pavarde) {
        super(vardas, pavarde);
        this.klase = klase;
    }

    @Override
    public String toString() {
        return super.getVardas() + " " + super.getPavarde() + " " + klase;
    }

    public Integer getKlase() {
        return klase;
    }

    public void setKlase(Integer klase) {
        this.klase = klase;
    }
}
