/*
 * Viet ham nhap 1 chuoi va xoa tat ca ca ky tu in hoa cua chuoi.
 */

import java.util.Scanner;

public class ws6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string;

        System.out.printf("Enter a string: ");
        string = scanner.nextLine();

        char[] ch = string.toCharArray();

        deleteUpperCase(ch);

        System.out.println();

    }

    public static void deleteUpperCase(char ch[]) {
        System.out.printf("\nAfter delete uppercase character: ");
        int n = ch.length;
        
        for (int i = 0; i < n; i++) {
            if (!Character.isUpperCase(ch[i])) {                
                System.out.printf("%s", ch[i]);
            }
        }
        
    }
}
