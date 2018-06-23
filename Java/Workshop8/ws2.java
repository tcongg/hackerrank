/*
 * 1. Nhap 1 chuoi string
 * 2. Nhap 1 ki tu ch
 * 3. Hien thi ch co xuat hien trong string hay khong
 * 4. Hien thi vi tri xuat hien dau la cuoi cua ch trong string
 * 5. Hien thi danh sach vi tri xuat hien cua ch trong string
 */

import java.util.Scanner;

public class ws2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string;
        char ch;

        System.out.printf("Enter a string: ");
        string = scanner.nextLine();

        System.out.printf("Enter a character: ");
        ch = scanner.next().charAt(0);

        checkExist(string, ch);

        findPosition(string, ch);

        listPosition(string, ch);

    }

    public static void checkExist(String string, char ch) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                System.out.println("Found " + ch + " in the array");
                return;
            }
        }

        System.out.println("Can not found " + ch + " in the array");
    }

    public static void findPosition(String string, char ch) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                first = i;
                break;
            }
        }

        System.out.println("The first position of " + ch + ": " + first);

        for (int i = string.length() - 1; i >= 0; i--) {
            if (string.charAt(i) == ch) {
                last = i;
                break;
            }
        }

        System.out.println("The last position of " + ch + ": " + last);
    }

    public static void listPosition(String string, char ch) {
        System.out.printf("List of position: ");

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                System.out.printf(i + ", ");
            }
        }
    }
}
