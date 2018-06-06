// https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 1;
        String s;

        while (scanner.hasNext()) {
            s = scanner.nextLine();
            System.out.println(n + " " + s);
            n++;
        }
    }
}
