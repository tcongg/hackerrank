/*
 * Viet tro choi 3 cay cua 2 nguoi choi
 * Nhap ten nguoi choi 1: Nguyen A
 * La bai 1: x (so ngau nhien 1 - 9)
 * La bai 2: y
 * La bai 3: z
 * Diem: xxx
 * Nhap ten nguoi choi 2: Nguyen B
 * La bai 1: x
 * La bai 2: y
 * La bai 3: z
 * Diem: xxx
 * Nguoi thang cuoc: xxxxx
 */

import java.util.Random;
import java.util.Scanner;

public class ws6 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter player 1 name: ");
        String player1 = scanner.nextLine();

        int card1 = random.nextInt(9) + 1;
        System.out.println("Card 1: " + card1);
        int card2 = random.nextInt(9) + 1;
        System.out.println("Card 2: " + card2);
        int card3 = random.nextInt(9) + 1;
        System.out.println("Card 3: " + card3);

        int point1 = card1 + card2 + card3;

        System.out.printf("Enter player 2 name: ");
        String player2 = scanner.nextLine();

        int card4 = random.nextInt(9) + 1;
        System.out.println("Card 4: " + card4);
        int card5 = random.nextInt(9) + 1;
        System.out.println("Card 5: " + card5);
        int card6 = random.nextInt(9) + 1;
        System.out.println("Card 6: " + card6);

        int point2 = card4 + card5 + card6;

        if (point1 > point2) {
            System.out.println("Winner is: " + player1);
        } else if (point1 < point2) {
            System.out.println("Winner is: " + player2);
        } else {
            System.out.println("Draw");
        }
    }

}
