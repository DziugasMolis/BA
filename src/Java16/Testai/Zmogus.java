package Java16.Testai;

public class Zmogus {
    private String vardas;
    private String pavarde;
    private Integer amzius;

    public Zmogus(String vardas, String pavarde, Integer amzius) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
    }

    public String getVardasPavarde() {
        return vardas + " " + pavarde;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public Integer getAmzius() {
        return amzius;
    }

    @Override
    public String toString() {
        return "Zmogus{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", amzius=" + amzius +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return (this.vardas.equals(((Zmogus) obj).vardas)) &&
                (this.pavarde.equals(((Zmogus) obj).pavarde))
                && (this.amzius.equals(((Zmogus) obj).amzius));
    }
}
