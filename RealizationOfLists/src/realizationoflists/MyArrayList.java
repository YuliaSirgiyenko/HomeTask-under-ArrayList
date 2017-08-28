package realizationoflists;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MyArrayList<T> {

    Object[] data;
    int size;
    final static int INITIAL_CAPACITY = 10;

    MyArrayList() {
        data = new Object[INITIAL_CAPACITY];
    }

    MyArrayList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        } else {
            data = new Object[capacity];
        }
    }

    MyArrayList(Collection<? extends T> a) {
        data = a.toArray();
    }

    boolean add(Object ob) {
        if (size < data.length) {
            data[size] = ob;
            size++;
        } else {
            copyArray();
            data[size] = ob;
            size++;
        }
        return true;
    }

    boolean addAll(Collection<? extends T> a) {
        Object[] temp = new Object[a.toArray().length];
        temp = a.toArray();

        if ((size + a.toArray().length) <= data.length) {
            System.arraycopy(temp, 0, data, size, a.toArray().length);
            size = size + a.toArray().length;
        } else {
            while ((size + a.toArray().length) > data.length) {
                copyArray();
            }
            System.arraycopy(temp, 0, data, size, a.toArray().length);
            size = size + a.toArray().length;
        }
        return true;
    }

    Object get(int index) {
        return data[index];
    }
    
    int indexOf(Object a) {
        int index = -1;

        for (int i = 0; i < data.length; i++) {
            if (a.equals(data[i])) {
                index = i;
            }
        }
        return index;
    }

    Object[] copyArray() {
        data = Arrays.copyOf(data, capacityIncrease(data.length));
        return data;
    }

    int capacityIncrease(int cap) {
        int res = cap * 3 / 2 + 1;
        return res;
    }

    @Override
    public String toString() {
        String res = "[";

        try {
            for (int i = 0; i < data.length; i++) {
                if (i == data.length - 1) {
                    res += data[i];
                } else {
                    res += data[i] + "; ";
                }
            }
        } catch (IllegalArgumentException e) {
        }

        res += "]";
        return res;
    }

}
