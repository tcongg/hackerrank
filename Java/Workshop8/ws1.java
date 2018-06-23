/*
 1. Nhap 1 chuoi string tu ban phim.
 2. Dem so luong ky tu in hoa va in thuong.
 3. Dem trong string co bao nhieu ky tu in hoa.
 4. Hien thi cac ky tu in thuong.
 5. Bien tat ca ky tu in thuong thanh in hoa.
 */

import java.util.Scanner;

public class ws1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string;
        char ch;

        System.out.printf("Enter a string: ");
        string = scanner.nextLine();

        System.out.printf("Your String: ");
        for (int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            System.out.printf("%s", ch);

        }
        // dem so nguyen am
        int countVowel = 0;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'e' || string.charAt(i) == 'a' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u' || string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I' || string.charAt(i) == 'O' || string.charAt(i) == 'U') {
                countVowel++;
            }
        }

        System.out.printf("\nNumber of vowel: " + countVowel);

        // dem so ky tu in hoa va in thuong
        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                countUpper++;
            } else if (Character.isLowerCase(string.charAt(i))) {
                countLower++;
            }
        }

        System.out.printf("\nNumber of uppercase character: " + countUpper);
        System.out.printf("\nNumber of lowercase character: " + countLower);

        // hien thi cac ky tu in thuong
        System.out.printf("\nLower character: ");
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                System.out.printf("%s ", string.charAt(i));
            }
        }

        // Bien tat ca ky tu thuong thanh in hoa
        System.out.printf("\nAfter to upper: ");
        System.out.printf(string.toUpperCase());
        System.out.printf("\n");
    }

}
