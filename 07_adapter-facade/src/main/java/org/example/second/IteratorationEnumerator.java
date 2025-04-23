package org.example.second;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorationEnumerator implements Enumeration<Object> {

    Iterator<?> iterator;

    public IteratorationEnumerator(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
