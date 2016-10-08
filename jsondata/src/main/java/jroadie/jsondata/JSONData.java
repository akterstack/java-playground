package jroadie.jsondata;

import java.io.Serializable;

public interface JSONData<T> extends Iterable<String>, Serializable {

    T parseJSON();
    String toJSON();
    String toPrettyJSON();

}
