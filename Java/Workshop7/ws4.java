/*
 * Nhap lan luot tung phan tu cua 2 mang so nguyen A va B.
 * Hien thi cac so nguyen la ket qua cua:
 * 1. A giao B.
 * 2. A hop B
 * 3. A tru B (co trong A ma khong co trong B)
 */

import java.util.Scanner;

public class ws4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter size of array 1: ");
        int n = scanner.nextInt();
        int a[] = requestInput(n);

        System.out.printf("Enter size of array 2: ");
        int m = scanner.nextInt();
        int b[] = requestInput(m);

        intersectArray(a, b);

        mergeArray(a, b);

        minusAray(a, b);
    }

    public static int[] requestInput(int n) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void deleteDuplicape(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                     n--;
                    for (int k = j; k < n; k++) {
                        array[k] = array[k + 1];
                    }

                }
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", array[i]);
        }

    }

    public static void intersectArray(int[] a, int[] b) {
        System.out.printf("A ? B: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.printf(a[i] + " ");
                }
            }
        }
    }

    public static void mergeArray(int[] a, int[] b) {
        System.out.printf("\nA ? B: ");

        int[] c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            c[i] += a[i];
        }

        for (int i = a.length; i < a.length + b.length; i++) {
            c[i] += b[i - a.length];
        }

        deleteDuplicape(c);
    }

    public static void minusAray(int[] a, int[] b) {
        System.out.printf("\nA - B: ");

        for (int i = 0; i < a.length; i++) {
            int temp = 0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    temp++;
                }
            }

            if (temp == 0) {
                System.out.printf("%d ", a[i]);
            } else {
                System.out.println("Empty");
                break;
            }
        }

    }
}
