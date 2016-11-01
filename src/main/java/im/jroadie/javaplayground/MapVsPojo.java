package im.jroadie.javaplayground;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Pojo {
    private Integer key;
    private Integer val;

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }
}

public class MapVsPojo {

    private static final Integer TESTCASE = 10000000;
    private static final Integer MAXNUM = 100000;

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            testPojo();
            System.out.print(" - ");
            testMap();
            System.out.println();
        }
    }

    public static void testMap() {
        double now = System.currentTimeMillis();
        Random random = new Random();
        for(int i = 0; i < TESTCASE; i++) {
            Map<String, Integer> map = new HashMap<>();
            map.put("key", random.nextInt(MAXNUM) + 1);
            map.put("val", random.nextInt(MAXNUM) + 1);
            String abc = map.get("key") + " " + map.get("val");
        }
        System.out.print(System.currentTimeMillis() - now);
    }

    public static void testPojo() {
        double now = System.currentTimeMillis();
        Random random = new Random();
        for(int i = 0; i < TESTCASE; i++) {
            Pojo pojo = new Pojo();
            pojo.setKey(random.nextInt(MAXNUM) + 1);
            pojo.setVal(random.nextInt(MAXNUM) + 1);
            String abc = pojo.getKey() + "" + pojo.getVal();
        }
        System.out.print(System.currentTimeMillis() - now);
    }

}
