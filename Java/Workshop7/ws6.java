/*
 * Viet ham nhan mang so nguyen va xoa tat ca so nguyen to cua mang
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a[] = requestInput();

        deletePrime(a);
        
        System.out.println();
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

    public static void deletePrime(int array[]) {
        int n = array.length;

        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                for (int j = i; j < n - 1; j++) {
                    array[j] = array[j + 1];
                }

                n--;
                i--;
            }

        }

        System.out.printf("After delete: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", array[i]);
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }
}
