/*
 * Viet ham nhan 2 so nguyen n, m va tinh n^m + m^n
 * Khong su dung bat ki thu vien nao ngoai scanner
 * int fun2(int n, int m);
 */

import java.util.Scanner;

public class ws2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer n: ");
        int n = scanner.nextInt();
        System.out.println("Enter integer m: ");
        int m = scanner.nextInt();

        System.out.println(fun2(n, m));
    }

    public static int fun2(int n, int m) {
        int powN = 1;
        int powM = 1;

        for (int i = 1; i <= m; i++) {
            powN = n * i;
        }

        for (int i = 1; i <= n; i++) {
            powM = m * i;
        }
        
        return powN + powM;
    }

}
