/*
 * Viet ham nhap 1 so nguyen n va xac dinh n co phai so nguyen to hay khong
 * boolean isPrime(int n);
 * Su dung ham isPrime(n), viet ham nhan 1 so nguyen to n va in ra tat ca cac so nguyen to nho hon n
 * void listPrime(int n);
 */

import java.util.Scanner;

public class ws4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter an integer n: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number\n");

        } else {
            System.out.println(n + " is not a prime number\n");
        }

        System.out.println("All prime number smaller than " + n + " is: ");
        listPrime(n);
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

    public static void listPrime(int n) {
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
