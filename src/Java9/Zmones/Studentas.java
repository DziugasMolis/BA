package Java9.Zmones;

public class Studentas extends Zmogus {
    private Integer kursas;
    private String kryptis;

    public Studentas(String vardas, String pavarde, Integer amzius,
                     Integer kursas, String kryptis) {
        super(vardas, pavarde, amzius);
        this.kursas = kursas;
        this.kryptis = kryptis;
    }

    @Override
    public String toString() {
        return "Vardas: " + getVardas() + " Pavarde: " + getPavarde() +
                " Amzius: " + getAmzius() + " Kursas: " + this.kursas +
                "Studiju kryptis: " + this.kryptis;
    }
}
