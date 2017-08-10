import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
            unsorted[unsorted_i] = in.next();
        }
        // your code goes here
        Arrays.sort(unsorted, (a, b) -> {
            if(a.length() != b.length()) return a.length() - b.length();
            for (int i = 0; i < a.length(); i++) {
                int diff = a.charAt(i) - b.charAt(i);
                if(diff != 0) return diff;
            }
            return 0;
        });
        System.out.println(String.join("\n", unsorted));
    }
}
