// https://www.hackerrank.com/challenges/java-loops/problem

import java.util.Scanner;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int q = scanner.nextInt();
        
        for (int k = 0; k < q; k++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            
            for ( int i = 1; i <= n; i++) {
                int s = a;
                
                for (int j = 0; j < i; j++){
                    s = s + (int)Math.pow(2, j) * b;
                }
                
                System.out.printf("%d ", s);
            }
            
            System.out.println();
        }
    }
}