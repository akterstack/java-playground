package jroadie.jsondata;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class JSONObject extends AbstractJSONData<JSONObject> {

    protected Map<String, Object> objectMap = new HashMap<>();

    public <T> T get(String key) {
        Objects.requireNonNull(key, "Key must not be null");
        return (T)objectMap.get(key);
    }

    public JSONObject put(String key, Object val) {
        Objects.requireNonNull(key, "Key must not be null");
        objectMap.put(key, val);
        return this;
    }

    public JSONObject remove(String key) {
        Objects.requireNonNull(key, "Key must not be null");
        objectMap.remove(key);
        return this;
    }

    public boolean contains(String key) {
        return objectMap.containsKey(key);
    }

}
