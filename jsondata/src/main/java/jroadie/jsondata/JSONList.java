package jroadie.jsondata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JSONList extends AbstractJSONData<JSONList> implements Iterable<Object> {

    protected List<Object> objectList = new ArrayList<>();

    public <T> T get(int idx) {
        return null;
    }

    public JSONList add(Object el) {
        return this;
    }

    public JSONList remove(int idx) {
        return this;
    }

    public JSONList remove(Object val) {
        return this;
    }

    public boolean contains(Object val) {
        return false;
    }

    public Iterator<Object> iterator() {
        return new JSONIterator(objectList.iterator());
    }

}
