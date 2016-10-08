package jroadie.jsondata;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractJSONData<T> implements JSONData<T> {

    protected List<String> keys;
    protected List<Object> vals = new ArrayList<>();

    public T parseJSON() {
        return null;
    }

    public String toJSON() {
        return toString();
    }

    public String toPrettyJSON() {
        return toString();
    }

    public Iterator<String> iterator() {
        return null;
    }

    public String toString() {
        return JSONDataUtil.encode();
    }
}
