/*
 * Viet chuong trình giai phuong trình bac hai ax2 + bx + c.
 * Trong dó a,b,c là 3 so thuc nhap tu bàn phím.
 */

import java.util.Scanner;

public class ws3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("Phuong trinh co 1 nghiem x: " + (-c / b));
            }
            return;
        }

        double delta = b * b - 4 * a * c;
        double x1;
        double x2;

        if (delta > 0) {
            x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phuong trinh co 2 nghiem: " + "x1 = " + x1 + " va x2 = " + x2);
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-b / (2 * a)));
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }

}
