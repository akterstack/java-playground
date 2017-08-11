import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scanner = new Scanner(System.in);
        int s = 0, r = 0, o = 0;
        do {
            String input = scanner.nextLine();
            String[] lines = input.split(" ");
            String a = lines[0];
            String b = lines[1];
            String c = lines[2];
            String d = lines[3];
            if( a.equals(b) && b.equals(c) && c.equals(d) && d.equals(a)) s++;
            else if (a.equals(c) && b.equals(d)) r++;
            else o++;
        } while (scanner.hasNextLine());
        System.out.println(s + " " + r + " " + o);
    }
}