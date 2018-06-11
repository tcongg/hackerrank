/*
 * Viet ham nhap 1 so nguyen c va tim so nguyen n lon nhat sao cho S(n) <=c
 * Khong su dung thu vien nao khac ngoai scanner
 * Trong do S(n) = 1+2+3+4+...+n
 * int fun3(int c);
 * Vi du: fun3(9) = 3, fun3(10) = 4
 */

import java.util.Scanner;

public class ws3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter a number c: ");
        int c = scanner.nextInt();

        int n = fun3(c);
        System.out.println("The largest integer n is: " + n);
    }

    public static int fun3(int c) {
        int n = 0;
        int sum = 0;

        while (sum <= c) {
            n++;
            sum += n;
        }
        n -= 1;

        return n;
    }
}
