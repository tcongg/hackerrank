// https://www.hackerrank.com/challenges/java-output-formatting/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
            System.out.println("================================");
        
            for (int i = 0; i < 3; i++) {
                String string = scanner.next();
                int number = scanner.nextInt();
                System.out.printf("%-15s%03d\n", string, number);
            }
        
            System.out.println("================================");

    }
}