/*
 * Viet ham nhan 1 mang so nguyen va 1 so nguyen n
 * Chen n vao truoc tat ca so le cua mang.
 * Neu mang khong co so le thi khong lam gi ca.
 */

import java.util.Scanner;

public class ws5 {

    public static void main(String[] args) {
        int a[] = requestInput();

        insertNumber(a);
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

    public static void insertNumber(int[] array) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter number: ");
        int m = scanner.nextInt();

        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                temp++;
            }
        }

        int[] array2 = new int[array.length + temp];

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array2[i + count] = m;
                count++;
            }
            array2[i + count] = array[i];
        }

        System.out.printf("After insert: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("%d ", array2[i]);
        }
        
    }

}
