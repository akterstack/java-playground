import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(), pad = size - 1, hash = size - pad;
        while (pad >= 0) {
            for (int p = pad; p > 0; p--) {
                System.out.print(" ");
            }
            for (int h = 0; h < hash; h++) {
                System.out.print("#");
            }
            System.out.println();
            pad--;
            hash++;
        }
    }

}