package Java12;

import java.util.Arrays;

public class Mapas {

    private DviejuTipu[] arr;

    public Mapas() {
        this.arr = new DviejuTipu[0];
    }

    public void add(Object key, Object value) {
        DviejuTipu<Object, Object> obj = new DviejuTipu<>(key, value);
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = obj;
    }

    public Object getValueByKey(Object key) {
        for (DviejuTipu obj : this.arr) {
            if (obj.getKey().equals(key)) {
                return obj.getValue();
            }
        }
        return null;
    }

    public void spausdinti() {
        System.out.println(Arrays.toString(this.arr));
    }

    public DviejuTipu[] getArr() {
        return arr;
    }

    public void setArr(DviejuTipu[] arr) {
        this.arr = arr;
    }
}
