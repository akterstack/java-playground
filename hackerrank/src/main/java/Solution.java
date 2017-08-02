import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int dim = scanner.nextInt();
        int[][] matrix = new int[dim][dim];
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int a = 0, b = 0;
        for (int i = 0, j = 0, k = dim -1; i < dim; i++, j++, k--) {
            a += matrix[i][j];
            b += matrix[i][k];
        }
        System.out.println(Math.abs(a - b));
    }

}