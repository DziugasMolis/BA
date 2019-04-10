package java13.Uzduotis;


import java.util.Arrays;

public class Container<T> {
    private int size;     // number of elements
    private T[] elements;

    public Container() {         // constructor
        elements = (T[]) new Object[2];  // allocate initial capacity of 10
        size = 0;
    }

    public void add(T obj) {
        if (size < elements.length) {
            elements[size] = obj;
        } else {
            // allocate a larger array and add the element, omitted
            elements = Arrays.copyOf(elements, elements.length + 10);
            elements[size] = obj;
        }
        ++size;
    }

    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    public int size() {
        return size;
    }

    public T[] getAll() {
        return elements;
    }

    private static <E> void swap(E[] a, int i, int j) {
        if (i != j) {
            E temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    public <T extends Comparable<T>> void selectionSort(T[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // find index of smallest element
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[smallest]) <= 0) {
                    smallest = j;
                }
            }
            swap(a, i, smallest);  // swap smallest to front
        }
    }



    public void set(Integer index, T value) {
        if (elements.length >= index) {
            elements[index] = value;
        }
    }
}
