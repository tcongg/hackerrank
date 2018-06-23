// https://www.hackerrank.com/challenges/valid-username-checker/problem

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
        while(n-- != 0) {
            String username = scanner.next();
            if(checkUsername(username)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        
    }
    
    public static boolean checkLength(String string) {
        return 8 <= string.length() && string.length() <= 30;
    }
    
    public static boolean checkContain(String string) {   
        for (int i = 0; i < string.length(); i++) {
            if(!Character.isLetterOrDigit(string.charAt(i)) && string.charAt(i) != '_') {
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean checkFirstCharacter(String string) {
        return Character.isLetter(string.charAt(0));
    }
    
    public static boolean checkUsername(String string) {
        return checkLength(string) && checkContain(string) && checkFirstCharacter(string);
    }
}

