// https://www.hackerrank.com/challenges/java-datatypes/problem

import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution {

    public static void main(String[] argh) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = scanner.nextLong();
                
                System.out.println(x + " can be fitted in:");
                if (x <= 127 && x >= -128) {
                    System.out.println("* byte \n* short \n* int \n* long");
                } else if (x <= 32767 && x >= -32768) {
                    System.out.println("* short \n* int \n* long");
                } else if (x <= Math.pow(2, 31) - 1 && x >= -Math.pow(2, 31)) {
                    System.out.println("* int \n* long");
                } else if (x >= -Math.pow(2, 63) - 1 && x <= Math.pow(2, 63)) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }

        }
    }
}
