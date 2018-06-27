// https://www.hackerrank.com/challenges/java-biginteger/problem

import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}