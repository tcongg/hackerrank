/*
 * 1. Nhap so phan tu va cac phan tu cho 1 mang so nguyen array.
 * 2. Tinh tong cac phan tu cua mang.
 * 3. Tinh tich cua cac so nguyen chan.
 * 4. Dem so luong so nguyen to.
 * 5. Hien thi danh sach cac so khong phai so nguyen to
 */

import java.util.Scanner;

public class ws1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        int sum = 0;
        int x = 1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter element at index " + i + ": ");
            array[i] = scanner.nextInt();
            sum += array[i];

            if (array[i] % 2 == 0) {
                x *= array[i];
            }

            if (isPrime(array[i])) {
                count++;
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Product of even number(s): " + x);
        System.out.println(count + " prime number(s)");
        System.out.printf("Non prime number(s): ");
        listNonPrime(array);
        System.out.println("\n");
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

    public static void listNonPrime(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (!isPrime(array[i])) {
                System.out.printf(array[i] + ", ");
            }
        }
    }

}
