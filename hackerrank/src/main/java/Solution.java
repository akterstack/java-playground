import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int len = size, el, pos = 0, neg = 0, zro = 0;
        while (size > 0) {
            el = scanner.nextInt();
            if (el > 0) pos++;
            else if (el < 0) neg++;
            else zro++;
            size--;
        }
        String precision = "%.6f\n";
        System.out.printf(precision, (double)pos / (double)len);
        System.out.printf(precision, (double)neg / (double)len);
        System.out.printf(precision, (double)zro / (double)len);
    }

}