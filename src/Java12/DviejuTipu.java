package Java12;

public class DviejuTipu <K, V> implements Pora<K, V> {

    private K key;
    private V value;

    public DviejuTipu(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "DviejuTipu{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

}
