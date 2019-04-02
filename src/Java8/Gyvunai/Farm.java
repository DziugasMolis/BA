package Java8.Gyvunai;

public class Farm {

    private Animal[] gyvunuMasyvas;

    public Farm(Animal[] gyvenuMasyvas) {
        this.gyvunuMasyvas = gyvenuMasyvas;
    }

    @Override
    public String toString() {
        Integer sunuSkaicius = 0;
        Integer kaciuSkaicius = 0;
        for (int i = 0; i < gyvunuMasyvas.length; i++) {
            if (gyvunuMasyvas[i] instanceof Dog) {
                sunuSkaicius++;
            } else if (gyvunuMasyvas[i] instanceof Cat) {
                kaciuSkaicius++;
            }
        }
        return "Sunu skaicius = " + sunuSkaicius + " skleidzia garsa "
                + Dog.garsas() + "\n Kaciu skaicius = " + kaciuSkaicius;
    }



    public Animal[] getGyvenuMasyvas() {
        return gyvunuMasyvas;
    }

    public void setGyvenuMasyvas(Animal[] gyvenuMasyvas) {
        this.gyvunuMasyvas = gyvenuMasyvas;
    }
}
