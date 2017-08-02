package jroadie.jplayground;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Immutable {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("one");
        List<String> list2 = Collections.unmodifiableList(list1);
        list2.add("two");
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
    }

}
