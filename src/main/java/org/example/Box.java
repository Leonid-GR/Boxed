package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Box<T> {
    private final List<T> items = new ArrayList<>();

    public void put(T item) {
        items.add(item);
    }

    public T get() {
        if (items.isEmpty()) {
            throw new NoSuchElementException("Box is empty");
        }
        return items.remove(0);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        items.clear();
    }
}
