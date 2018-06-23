/*
 * 1. Nhap cac so nguyen cho 1 mang aray
 * 2. Nhap 1 so nguyen n
 * 3. Xoa vi tri xuat hien dau tien cua n trong mang
 * 4. Them n vao sau phan tu chan dau tien cua mang, neu mang khong co so chan thi khong lam gi ca
 * 5. Xoa tat ca phan tu trung nhau cua mang, neu phan tu nao xuat hien nhieu t hi giu lai phan tu dau tien
 */

import java.util.Scanner;

public class ws3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[] = new int[100];

        System.out.printf("Enter number of element: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.printf("\nYour original array is: ");
        displayArray(array, n);

        System.out.printf("\nEnter a number: ");
        int value = scanner.nextInt();

        // Delete the first appearancee of inputted number
        for (int i = 0; i < n; i++) {
            if (array[i] == value) {
                for (int j = i; j < n; j++) {
                    array[j] = array[j + 1];
                }

                n--;
                break;
            }
        }

        System.out.printf("After delete %d: ", value);
        displayArray(array, n);

        // Add an integer n after the first even element of array, if the array has no even element, do nothing.
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                for (int j = n; j > i + 1; j--) {
                    array[j] = array[j - 1];
                }
                
                array[i + 1] = value;
                n++;
                break;
            }
        }

        System.out.printf("After add %d: ", value);
        displayArray(array, n);

        // Delete duplicape element
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    for (int k = j; k < n; k++) {
                        array[k] = array[k + 1];
                    }

                    n--;
                }
            }

        }

        System.out.printf("After delete duplicape: ");
        displayArray(array, n);

    }

    public static void displayArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf(array[i] + " ");
        }

        System.out.println();
    }
}
