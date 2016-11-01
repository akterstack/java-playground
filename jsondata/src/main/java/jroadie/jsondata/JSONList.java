package jroadie.jsondata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JSONList extends AbstractJSONData<JSONList> implements Iterable<Object> {

    protected List<Object> objectList = new ArrayList<>();

    public <T> T get(int idx) {
        return (T)objectList.get(idx);
    }

    public JSONList add(Object el) {
        objectList.add(el);
        return this;
    }

    public JSONList addAll(List<Object> list) {
        objectList.addAll(list);
        return this;
    }

    public JSONList remove(int idx) {
        objectList.remove(idx);
        return this;
    }

    public JSONList remove(Object val) {
        objectList.remove(val);
        return this;
    }

    public boolean contains(Object val) {
        return objectList.contains(val);
    }

    public Iterator<Object> iterator() {
        return new JSONIterator<>(objectList.iterator());
    }

}
