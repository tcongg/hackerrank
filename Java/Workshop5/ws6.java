/*
 * Viet ham nhap 1 so nguyen n va tinh tong:
 * S(n) = 1 + 1/(1+2) + 1/(1+2+3)+...+1/(1+2+3+...+n)

 * double fun6(int n);
 */

import java.util.Scanner;

public class ws6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter integer n: ");
        int n = scanner.nextInt();

        System.out.println(fun6(n));
    }

    public static double fun6(int n) {
        double s = 0;
        int temp = 0;

        for (int i = 1; i <= n; i++) {
            s += 1 / (double)(temp += i);
        }

        return s;
    }

}
