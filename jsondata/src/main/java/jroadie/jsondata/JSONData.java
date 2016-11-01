package jroadie.jsondata;

import java.io.Serializable;

public interface JSONData<T> extends Serializable {

    T parseJSON();
    String toJSON();
    String toPrettyJSON();

}
