// https://www.hackerrank.com/challenges/java-string-tokens/problem

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().trim().split("[ !,?\\._'@]+", 0);
        
        if (arr.length == 1 && arr[0].equals("")) {
            System.out.println(0);
        } else {
            System.out.println(arr.length);
            
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("%s\n", arr[i]);
            }
        }
    }
}