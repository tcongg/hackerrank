/*
 * Nhap 2 chuoi str1 va str2
 * Hien thi cac ky tu
 * 1. Xuat hien trong ca 2 chuoi
 * 2. Xuat hien trong str1 hoac str2
 * 3. Chi xuat hien trong str1
 */

import java.util.Scanner;

public class ws4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string1;
        String string2;

        System.out.printf("Enter string 1: ");
        string1 = scanner.nextLine();

        System.out.printf("Enter string 2: ");
        string2 = scanner.nextLine();

        char[] ch1 = string1.toCharArray();
        char[] ch2 = string2.toCharArray();

        displayAllCharacter(ch1, ch2);

        displayDuplicape(ch1, ch2);

        displayOnlyBelongTo(ch1, ch2);

        System.out.println();
    }

    public static void displayDuplicape(char ch1[], char ch2[]) {
        System.out.printf("\nCharacter appear in string1 or string2: ");

        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch2.length; j++) {
                if (ch1[i] == ch2[j]) {
                    System.out.printf("%s ", ch1[i]);
                    break;
                }
            }
        }
    }

    public static void deleteDuplicape(char ch[]) {
        int n = ch.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ch[i] == ch[j]) {             
                    for (int k = j; k < n - 1; k++) {
                        ch[k] = ch[k + 1];
                        
                    }
                    n--;
                    ch[n] = 0;
                }
            }
        }
    }

    public static void displayAllCharacter(char ch1[], char ch2[]) {
        char[] ch3 = new char[ch1.length + ch2.length];

        for (int i = 0; i < ch1.length; i++) {
            ch3[i] = ch1[i];
        }

        for (int i = ch1.length; i < ch1.length + ch2.length; i++) {
            ch3[i] = ch2[i - ch1.length];
        }
        

        deleteDuplicape(ch3);
        System.out.printf("\nAll character appear both string1 and 2: ");
        for (int i = 0; i < ch3.length; i++) {
            System.out.printf("%s", ch3[i]);
        }
    }

    public static boolean isNotExist(char c, char ch[]) {
        for (int i = 0; i < ch.length; i++) {
            if (c == ch[i]) {
                return false;
            }
        }

        return true;
    }

    public static void displayOnlyBelongTo(char ch1[], char ch2[]) {
        System.out.printf("\nCharacter only appear in string1: ");

        for (int i = 0; i < ch1.length; i++) {
            if (isNotExist(ch1[i], ch2)) {
                System.out.printf("%s ", ch1[i]);
            }
        }

    }
}
