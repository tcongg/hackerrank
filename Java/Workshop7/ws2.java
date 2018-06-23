/*
 * 1. Nhap cac so nguyen cho 1 mang array
 * 2. Nhap 1 so nguyen n.
 * 3. HHien thi xem n co xuat hien trong mang array khong.
 * 4. Hien thi vi tri xuat hien dau tien va cuoi cung cua n trong mang. (Bat dau tu vi tri 0).
 * 5. Hien thi danh sach vi tri xuat hien cua n trong mang. (Bat dau tu vi tri 0).
 */

import java.util.Scanner;

public class ws2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a[] = requestInput();

        System.out.printf("Enter a number: ");
        int n = scanner.nextInt();

        if(isExist(a, n)) {
            System.out.println("Found " + n + " in array");
        } else {
            System.out.println("Can not found " + n + " in array");
        }

        findPosition(a, n);

        listPosition(a, n);
    }

    public static int[] requestInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter number of element: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static boolean isExist(int[] array, int m) {

        for (int i = 0; i < array.length; i++) {
            if (m == array[i]) {
                return true;
            }
        }

        return false;
    }

    public static void findPosition(int[] array, int p) {
        if (isExist(array, p)) {
            int first = -1;
            int last = -1;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == p) {
                    first = i;
                    break;
                }

            }

            System.out.println("The first position of " + p + ": " + first);

            for (int i = array.length - 1; i >= 0; i--) {
                if (array[i] == p) {
                    last = i;
                    break;
                }
            }

            System.out.println("The last position of " + p + ": " + last);
        }
    }

    public static void listPosition(int[] array, int q) {
        if (isExist(array, q)) {
            System.out.printf("List of position of " + q + ": ");

            for (int i = 0; i < array.length; i++) {
                if (array[i] == q) {
                    System.out.printf(i + " ");
                }
            }
            
            System.out.println();
        }
    }
}
