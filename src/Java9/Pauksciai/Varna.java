package Java9.Pauksciai;

public class Varna extends Paukstis {

    public Varna() {
        super("Juoda");
    }

    @Override
    public String gautiPavadinima() {
        return "Varna";
    }

    @Override
    public Integer gautiGyvenimoAmziu() {
        return 2;
    }

    @Override
    public Double gautiSvori() {
        return 2.5;
    }
}
