package Java8.Figuros;

public class Figuros {
    private Figura[] arr;

    public Figuros(Figura[] arr) {
        this.arr = arr;
    }


    public Figura maxPlotas() {
        Double max = 0d;
        Integer maxIndeksas = 0;
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i].plotas()) {
                max = arr[i].plotas();
                maxIndeksas = i;
            }
        }
        return arr[maxIndeksas];
    }

    public Figura[] getArr() {
        return arr;
    }

    public void setArr(Figura[] arr) {
        this.arr = arr;
    }
}
