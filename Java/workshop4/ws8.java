/*
 * Viet chuong trinh nhap lien tiep cac so nguyen trong khoang [1,10]
 * neu nguoi dung nhap ngoai khoang thi hien thi thong bao "Incorrect input, try again" 
 * Khi nhap 0 thi dung viec nhap. Dem so luong cac so chan va tong cac so le da nhap vao thanh cong
 * Output:
 * Enter an integer in [1-10](Press 0 to quit): -5
 * Incorect input, try again!
 * Enter an integer in [1-10](Press 0 to quit): 4

 * Enter an integer in [1-10](Press 0 to quit): 3
 * Enter an integer in [1-10](Press 0 to quit): 6
 * Enter an integer in [1-10](Press 0 to quit): 2
 * Enter an integer in [1-10](Press 0 to quit): 5
 * Enter an integer in [1-10](Press 0 to quit): 0
 * Number of even integers: 3
 * Sum of odd integers: 8
 */

import java.util.Scanner;

public class ws8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sumOdd = 0;

        while (true) {
            System.out.printf("Enter an integer in [1-10](Press 0 to quit): ");
            int n = scanner.nextInt();

            if (n == 0) {
                break;
            }
            if (n < 1 || n > 10) {
                System.out.println("Incorrect, try again");
            }
            if (n > 0 && n < 11) {
                if (n % 2 == 0) {
                    count++;
                } else {
                    sumOdd += n;
                }
            }
        }

        System.out.printf("Number of even integer: %d\n", count);
        System.out.printf("Sum of odd integer = %d\n", sumOdd);
    }
}
