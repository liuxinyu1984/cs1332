package a10;

import java.util.Comparator;

public class testComparator<T> implements Comparator<T> {
    private final Comparator<T> comp;

    public testComparator(Comparator<T> comp) {
        this.comp = comp;
    }

    @Override
    public int compare(T obj1, T obj2) {
        return comp.compare(obj1, obj2);
    }

    @Override
    public boolean equals(Object obj) {
        return comp.equals(obj);
    }
}
