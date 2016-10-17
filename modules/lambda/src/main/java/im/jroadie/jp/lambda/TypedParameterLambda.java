package im.jroadie.jp.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

interface MapHandler {
    void handle(Map map);
}

interface ListHandler {
    void handle(List list);
}



public class TypedParameterLambda {

    static void doit(MapHandler mapHandler) {
        mapHandler.handle(new HashMap());
    }

    static void doit(ListHandler listHandler) {
        listHandler.handle(new ArrayList());
    }

    public static void main(String[] args) {
        doit((List list) -> {
            System.out.println("from list");
        });
        doit((Map map) -> {
            System.out.println("from map");
        });
    }

}
