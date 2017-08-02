import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int el, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        long total = 0;
        for (int i = 0; i < 5; i++) {
            el = in.nextInt();
            if (el < min) min = el;
            if (el > max) max = el;
            total += el;
        }
        System.out.println((total - max) + " " + (total - min));
    }
}
