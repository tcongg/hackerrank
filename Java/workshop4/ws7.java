/*
 * nhap 1 so nguyen n tu ban phim va tinh cac tong sau:
 * S1 = 1 + 3 +5 + … + (2n+1)
 * S2 = 1 + ½ + ¼ + ? ...+ 1/2n
 * S3 = 1 + (1+2) + (1+2+3) + … + (1+2+3..+n)
 */

import java.util.Scanner;

public class ws7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter an integer n: ");
        int n = scanner.nextInt();

        int S1 = 1;
        double S2 = 1;
        int S3 = 0;

        for (int i = 1; i <= n; i++) {
            S1 += ((2 * i) + 1);
            S2 += (1 / (double) (2 * i));
            S3 += i;
        }

        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
    }

}
