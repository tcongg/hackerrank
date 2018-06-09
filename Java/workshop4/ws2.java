/*
 * Viet chuong trình nhap do dài 3 canh cua tam giác 
 * xác dinh và thông báo xem loai cua tam giác dó thuoc nhung loai nào sau dây: 
 * không phai là tam giác, tam giác vuông, tam giác thuong, tam giác cân, tam giác deu.
 */

import java.util.Scanner;

public class ws2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter edge a: ");
        double a = scanner.nextDouble();
        System.out.printf("Enter edge b: ");
        double b = scanner.nextDouble();
        System.out.printf("Ebter edge c: ");
        double c = scanner.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if ((a == b) && (b == c)) {
                System.out.println("Tam giac deu");
            } else if ((a == b) || (b == c) || (c == a)) {
                System.out.println("Tam giac can");
            } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
                System.out.println("Tam giac vuong");
            } else {
                System.out.println("Tam giac thuong");
            }
        } else {
            System.out.println("?ây không ph?i tam giác");
        }
    }
}
