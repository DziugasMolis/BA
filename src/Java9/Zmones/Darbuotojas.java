package Java9.Zmones;

public class Darbuotojas extends Zmogus {
    private Integer patirtis;
    private String specialybe;

    public Darbuotojas(String vardas, String pavarde,
                       Integer amzius, Integer patirtis, String specialybe) {
        super(vardas, pavarde, amzius);
        this.patirtis = patirtis;
        this.specialybe = specialybe;
    }

    @Override
    public String toString() {
        return "Vardas: " + getVardas() + " Pavarde: " + getPavarde() +
                " Amzius: " + getAmzius() + " Specialybe: " + this.specialybe+
                "Patirtis: " + this.patirtis;
    }
}
