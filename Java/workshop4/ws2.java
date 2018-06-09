/*
 * Viet chuong tr�nh nhap do d�i 3 canh cua tam gi�c 
 * x�c dinh v� th�ng b�o xem loai cua tam gi�c d� thuoc nhung loai n�o sau d�y: 
 * kh�ng phai l� tam gi�c, tam gi�c vu�ng, tam gi�c thuong, tam gi�c c�n, tam gi�c deu.
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
            System.out.println("?�y kh�ng ph?i tam gi�c");
        }
    }
}
