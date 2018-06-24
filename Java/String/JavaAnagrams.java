// https://www.hackerrank.com/challenges/java-anagrams/problem

import java.util.*;

public class Solution {
    static boolean isAnagram(String a, String b) { 
        char array1[] = a.toLowerCase().toCharArray();
        char array2[] = b.toLowerCase().toCharArray();
        
        sortArray(array1);
        sortArray(array2);

        if (array1.length != array2.length) {
            return false;
        } else {
            int check = 0;

            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    check++;
                }
            }
            
            if (check != 0) {
                return false;
            } else {
                return true;
            }  
        } 
    }

    public static void sortArray(char[] array) {
        char tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if ((int)array[j] > (int)array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j +1] = tmp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}