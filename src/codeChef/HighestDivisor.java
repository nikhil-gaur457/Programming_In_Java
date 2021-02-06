package codeChef;

import java.util.Scanner;

public class HighestDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int divisor = 0;
        for (int i = 1; i <= 10 ; i++) {
            if (N % i == 0) {
                divisor = i;
            }
        }
        System.out.println(divisor);
    }
}
