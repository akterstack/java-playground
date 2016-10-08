package jroadie.jsondata;

public abstract class AbstractJSONData<T> implements JSONData<T> {

    public T parseJSON() {
        return null;
    }

    public String toJSON() {
        return toString();
    }

    public String toPrettyJSON() {
        return toString();
    }

    public String toString() {
        return JSONDataUtil.encode();
    }
}
