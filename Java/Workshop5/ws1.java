/*
 * Viet ham nhap 1 so nguyen n va tinh giai thua cua n
 */

import java.util.Scanner;

public class ws1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter an integer n: ");
        int n = scanner.nextInt();

        System.out.println(n + "! = " + fun1(n));
    }

    public static int fun1(int n) {
        int s = 1;
        
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        
        return s;
    }
}
