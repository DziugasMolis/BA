package Java7.Human;

public class Human {
    private String vardas;
    private String pavarde;
    private Integer amzius;
    private Integer[] pazymiai;

    public Human(String vardas) {
        this.vardas = vardas;
    }

    public Human(String vardas, String pavarde) {
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public Human(String vardas, String pavarde, Integer amzius, Integer[] pazymiai) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.amzius = amzius;
        this.pazymiai = pazymiai;
    }

    public Integer maxPaz() {
        Integer max = 0;
        for (Integer paz : pazymiai) {
            if (paz > max) {
                max = paz;
            }
        }
        return max;
    }

    public Double sum() {
        Double suma = 0.0;
        for (Integer paz : pazymiai) {
            suma += paz;
        }
        return suma;
    }

    public Double avg() {
        return sum() / pazymiai.length;
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

    public Integer getAmzius() {
        return amzius;
    }

    public void setAmzius(Integer amzius) {
        this.amzius = amzius;
    }
}
