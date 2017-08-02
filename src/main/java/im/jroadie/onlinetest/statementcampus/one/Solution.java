package im.jroadie.onlinetest.statementcampus.one;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String readString = scanner.nextLine();
        while(true) {
            System.out.println(readString);

            if (readString.isEmpty()) {
                System.out.println("Read Enter Key.");
            }

            readString = scanner.nextLine();
            /*if (scanner.hasNextLine()) {
            } else {
                readString = null;
            }*/
        }
    }
}