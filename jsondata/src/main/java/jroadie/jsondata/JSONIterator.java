package jroadie.jsondata;

import java.util.Iterator;

public class JSONIterator<T> implements Iterator<T> {

    private final Iterator<T> stringIterator;

    public JSONIterator(Iterator<T> iterator) {
        this.stringIterator = iterator;
    }

    @Override
    public boolean hasNext() {
        return stringIterator.hasNext();
    }

    @Override
    public T next() {
        return stringIterator.next();
    }

    @Override
    public void remove() {
        stringIterator.remove();
    }

}
