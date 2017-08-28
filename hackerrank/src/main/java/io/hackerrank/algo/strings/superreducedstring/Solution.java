package io.hackerrank.algo.strings.superreducedstring;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s) {
        String emptyString = "Empty String";
        String result = "";
        if (s == null || s.isEmpty()) return emptyString;
        boolean pairFound = true;
        while (true) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                char a = s.charAt(i);
                char b = s.charAt(i+1);
                if (a == b) {
                    i++;
                } else {
                    tmp.append(a);
                }
                if(i == s.length() - 2 && s.length() > i + 1) {
                    tmp.append(s.charAt(s.length() - 1));
                }
            }
            if (tmp.length() == s.length()) {
                s = tmp.toString();
                break;
            }
            s = tmp.toString();
        }
        return s.isEmpty() ? emptyString : s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
