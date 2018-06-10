/*
 * Vi?t ch??ng trình ki?m tra c?ng, tr?, nhân chia c?a ng??i dùng. 
 * Các b??c th?c hi?n ch??ng trình hi?n th? trên màn hình nh? ví d? sau:
 * Ban hay nhap vao phep toan: *
 * Ban hay nhap 2 so A va B
 * Nhap A: 2
 * Nhap B: 4
 * Nhap ket qua cua A*B: 6
 * !!! Ban da tinh sai, ket qua A*B = 8
 */

import java.util.Scanner;

public class ws4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = "";
        double a;
        double b;
        double result;

        while (!"+".equals(s) && !"-".equals(s) && !"*".equals(s) && !"/".equals(s)) {
            System.out.printf("Enter your operation: ");
            s = scanner.nextLine();
        }

        System.out.println("Enter 2 number a and b");
        System.out.printf("Enter a: ");
        a = scanner.nextDouble();
        System.out.printf("Enter b: ");
        b = scanner.nextDouble();
        System.out.printf("Enter result: ");
        result = scanner.nextDouble();
        
        double correctResult = 0;
        
        if ("*".equals(s)) {
            correctResult = a * b;
        }
        if ("+".equals(s)) {
            correctResult = a + b;
        }
        if ("-".equals(s)) {
            correctResult = a - b;
        }
        if ("/".equals(s)) {
            correctResult = a / b;
        }
        
        if (result != correctResult) {
            System.out.println("You wrong, correct result of a " + s + " b = " + correctResult);
        } else {
            System.out.println("CORRECT ANSWER");
        }
    }
}
