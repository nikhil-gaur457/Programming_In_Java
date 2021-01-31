package codeChef;

import java.util.Scanner;

public class SumPos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T --> 0) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            int Z = scanner.nextInt();
            Boolean results = false;
            if (X + Y == Z) {
                System.out.println("YES");
            }
            else if (X + Z == Y) {
                System.out.println("YES");
            }
            else if (Y + Z == X) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
