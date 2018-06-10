/*
 * Nh?p s? ti?n khách hàng mu?n g?i P, s? tháng g?i N và lãi xu?t hàng tháng R.
 * Tính t?ng ti?n g?c và lãi c?a khách hàng.
 * Ví d?: P = 1.000.000.000, R = 0.7 Sau N = 3 tháng s? ti?n ng??i ?ó có trong tài kho?n là 1.021.147.343
 */

import java.util.Scanner;

public class ws5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter your credit: ");
        double ownMoney = scanner.nextDouble();
        System.out.printf("Enter number of month: ");
        int month = scanner.nextInt();
        System.out.printf("Enter monthly interest rate: ");
        double monthlyInterestRate = scanner.nextDouble();

        for (int i = 0; i < month; i++) {
            ownMoney += ownMoney * (monthlyInterestRate / 100);
        }

        System.out.printf("Your money after %d month(s) is %.0f\n", month, ownMoney);
    }

}
