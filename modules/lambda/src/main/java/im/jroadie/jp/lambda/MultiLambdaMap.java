package im.jroadie.jp.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiLambdaMap {

    public static void main(String... args) {
        List<Integer> all = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> odd = new ArrayList<>();
        List<Integer> evn = new ArrayList<>();


        System.out.println("Odd: " + odd);
        System.out.println("Even: " + evn);
    }

}
