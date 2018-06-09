/*
 * So Amstrong la so co 3 ky so va tong lap phuong cua cac ky so bang chinh so do.
 * VD: 153 = 1*1*1 + 5*5*5 + 3*3*3
 * Viet chuong trinh hien thi cac so Armstrong.
 */

public class ws6 {

    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrongNumber(int n) {
        if (n < 100 || n > 999) {
            return false;
        }

        int temp;
        int sum = 0;
        int a = n;

        while (n > 0) {
            temp = n % 10;
            sum += temp * temp * temp;
            n /= 10;
        }

        return sum == a;
    }

}
