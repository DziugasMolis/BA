package Java9.Pauksciai;

public abstract class Paukstis {
    private String spalva;

    public Paukstis(String spalva) {
        this.spalva = spalva;
    }

    public abstract String gautiPavadinima();
    public abstract Integer gautiGyvenimoAmziu();
    public abstract Double gautiSvori();

    public String toString() {
        return "Pavadinimas = " + gautiPavadinima() + " Amzius = " + gautiGyvenimoAmziu() +
                " Svoris = " + gautiSvori();
    }
}
