/*
 1. Nhap 1 chuoi str.
 2. Nhap 1 ky tu c.
 3. Xoa vi tri xuat hien cuoi cung cua c trong chuoi.
 4. Chen c vao truoc ki tu nguyen am cuoi cua chuoi. Neu str khong co ki tu nguyen am thi chen vao cuoi chuoi.
 5. Xoa tat ca ky tu giong nhau cua chuoi. Ki tu nao lap lai nhieu lan thi giu gia tri dau tien.
 */

import java.util.Scanner;

public class ws3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string;
        char c;

        System.out.printf("Enter a string: ");
        string = scanner.nextLine();

        char[] ch = string.toCharArray();

        System.out.printf("Enter a character: ");
        c = scanner.next().charAt(0);

        deleteLastPosition(ch, c);

        insertBeforeVowel(ch, c);

        deleteDuplicape(ch);

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

    public static void removeElement(char ch[], char c) {
        int pos = -1;

        for (int i = 0; i < ch.length; i++) {
            if (c == ch[i]) {
                pos = i;
            }
        }

        if (pos == -1) {
            displayString(ch);
        } else {

            for (int i = pos; i < ch.length - 1; i++) {
                ch[i] = ch[i + 1];
            }

            ch[ch.length - 1] = 0;
            displayString(ch);
        }
    }

    public static void deleteLastPosition(char ch[], char c) {
        System.out.printf("\nAfter delete: ");

        removeElement(ch, c);
    }

    public static void insertBeforeVowel(char ch[], char c) {
        char[] ch2 = new char[ch.length + 1];
        System.arraycopy(ch, 0, ch2, 0, ch.length);
        
        for (int i = 0; i < ch2.length; i++) {
            if (isVowel(ch2[i])) {
                for (int j = ch2.length - 1; j > i; j--) {
                    ch2[j] = ch2[j - 1];
                }

                ch2[i] = c;
                break;
            }
            
            ch2[ch2.length - 1] = c;
        }

        System.out.printf("\nAfter insert: ");
        displayString(ch2);
    }

    public static void deleteDuplicape(char ch[]) {
        int n = ch.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ch[i] == ch[j]) {
                    n--;
                    for (int k = j; k < n; k++) {
                        ch[k] = ch[k + 1];
                        ch[n - 1] = 0;
                    }

                    j--;
                }
            }
            
        }

        System.out.printf("\nAfter delete duplicape: ");
        displayString(ch);
    }

}
