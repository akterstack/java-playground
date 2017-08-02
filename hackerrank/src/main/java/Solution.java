import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        String result = s.substring(0, s.length() - 2);
        String[] slop = result.split(":");
        int hh = Integer.valueOf(slop[0]);
        if(s.contains("AM")) {
            slop[0] = hh == 12 ? "00" : slop[0];
        } else {
            slop[0] = (hh == 12 ? hh : hh + 12) + "";
        }
        return String.join(":", slop);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}