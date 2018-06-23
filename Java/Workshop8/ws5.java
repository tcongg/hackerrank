/*
 * Viet ham nhan 1 chuoi va 1 ky tu ch
 * Chen ch vao sau tat ca ky tu nguyen am cua chuoi.
 * Neu chuoi khong co ky tu nguyen am thi khong lam gi ca.
 */

import java.util.Scanner;

public class ws5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string;
        char c;

        System.out.printf("Enter a string: ");
        string = scanner.nextLine();

        char[] ch = string.toCharArray();

        System.out.printf("Enter a character: ");
        c = scanner.next().charAt(0);

        insertAfterVowel(ch, c);
    }

    public static void insertAfterVowel(char ch[], char c) {
        int temp = 0;

        System.out.printf("\nAfter insert: ");

        for (int i = 0; i < ch.length; i++) {
            if (isVowel(ch[i])) {
                temp++;
            }
        }

        char[] ch2 = new char[ch.length + temp];
        System.arraycopy(ch, 0, ch2, 0, ch.length);

        for (int i = 0; i < ch2.length; i++) {
            if (isVowel(ch2[i])) {
                for (int j = ch2.length - 1; j > i; j--) {
                    ch2[j] = ch2[j - 1];
                }

                ch2[i + 1] = c;
            }
        }

        displayString(ch2);
    }

    public static void displayString(char ch[]) {
        for (int i = 0; i < ch.length; i++) {
            System.out.printf("%s", ch[i]);
        }

        System.out.println();
    }

    public static boolean isVowel(char c) {
        return c == 'e' || c == 'a' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

}
