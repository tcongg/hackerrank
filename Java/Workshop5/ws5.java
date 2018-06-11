/*
 * Viet ham nhap 1 so nguyen va tinh tong:
 * S(n) = 1 + ? + ? + 1/7 + … + 1/(2n + 1)

 * double fun5(int n);
 */

import java.util.Scanner;

public class ws5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter an integer n: ");
        int n = scanner.nextInt();

        System.out.println(fun5(n));
    }

    public static double fun5(int n) {
        double s = 0;

        for (int i = 0; i <= n; i++) {
            s += (1 / (double) (2 * i + 1));
        }

        return s;
    }
}
