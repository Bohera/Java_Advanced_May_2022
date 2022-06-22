package GenericsExercises.CustomList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> values;

    public CustomList() {
        values = new ArrayList<>();
    }

    public void add(T element) {
        values.add(element);
    }

    public T remove(int index) {
        return values.remove(index);
    }

    public boolean contains(T element) {
        return values.contains(element);
    }

    public void swap(int indexOne, int indexTwo) {
        Collections.swap(values, indexOne, indexTwo);
    }

    public long countGreaterThan(T element) {
        return values.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax() {
        return values.stream().max(Comparator.naturalOrder()).get();
    }

    public T getMin() {
        return values.stream().min(Comparator.naturalOrder()).get();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s%n", value.toString()));
        }
        return sb.toString().trim();
    }
}
