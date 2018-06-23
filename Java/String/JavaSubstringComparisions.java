// https://www.hackerrank.com/challenges/java-string-compare/problem

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int n = scanner.nextInt();

        String smallest = string;
        String largest = "";

        for (int i = 0; i < string.length() - (n - 1); i++) {
            String subString = string.substring(i, i + n);

            if (subString.compareTo(smallest) < 0) {
                smallest = subString;
            }

            if (subString.compareTo(largest) > 0) {
                largest = subString;
            }
        }

        System.out.println(smallest);
        System.out.println(largest);
    }

}
