// https://www.hackerrank.com/challenges/java-string-reverse/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String newString = string.replaceAll("\\s", "");

        char[] str1 = newString.toLowerCase().toCharArray();
        
        if (str1.length == 1) {
            System.out.println("Yes");
        } else {
            for (int i = 0; i < str1.length / 2; i++) {
                if (str1[i] != str1[(str1.length - i) - 1]) {
                    System.out.println("No");
                    return;
                }
                System.out.println("Yes");
                return;
            }
        }
    }
}
