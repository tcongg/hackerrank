// https://www.hackerrank.com/challenges/tag-content-extractor/problem

import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String string = in.nextLine();

            boolean isFound = false;

            Pattern pattern = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher match = pattern.matcher(string);

            while (match.find()) {
                System.out.println(match.group(2));
                isFound = true;
            }
            if (isFound == false) {
                System.out.println("None");
            }

            testCases--;
        }
    }
}
