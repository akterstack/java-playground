import java.util.*;

public class Office {

    public static Map<String, String> inputMap = new HashMap<String, String>();

    public static void main(String[] args) {

// map to hold input
        Map<String, String> inputMap = new HashMap<String, String>();
        inputMap.put("Person[name]", "Matt Demon");
        inputMap.put("Person[city][cityName]", "New York");
        inputMap.put("Person[country][countryName]", "USA");
        inputMap.put("Person[country][countryCode][A]", "+112");
        inputMap.put("PersonAddress[AddressString][]", "BARIDHARA");
        inputMap.put("PersonAddress[AddressLine1]", "Baridhara");

        // getting all keys from input map

        // maps to hold result
        Map finalMap = new HashMap();

        for(String key : inputMap.keySet()) {
            String[] parts = key.replace("]", "").split("\\[");
            buildMap(0, parts, inputMap.get(key), finalMap);
        }

        System.out.println("final map: " + finalMap);
    }

    public static void buildMap(Integer idx, String[] parts, Object value, Map finalMap) {
        if(idx == parts.length - 1) {
            finalMap.put(parts[idx], value);
        } else {
            Map param = (Map)finalMap.get(parts[idx]);
            if(param == null) {
                param = new HashMap();
                finalMap.put(parts[idx], param);
            }
            buildMap(idx + 1, parts, value, param);
        }
    }

}


