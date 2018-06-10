/* 
 * Viet chuong trình giai phuong trình bac nhat ax + b = 0. 
 * Trong dó a,b là 2 sp thuc nhap tu bàn phím.
 */

import java.util.Scanner;

public class ws1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x;
        System.out.printf("Enter a: ");
        double a = scanner.nextDouble();
        System.out.printf("Enter b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co nghiem: " + (-b / a));
        }

    }

}