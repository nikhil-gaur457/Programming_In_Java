package codeChef;

import java.util.Arrays;
import java.util.Scanner;

public class ChefAndMeet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            String P = scanner.next();
            scanner.next();
            int N = scanner.nextInt();
            String[] time = new String[N];
            for (int i = 0; i < N; i++) {
                time[i] = scanner.nextLine();
            }
            System.out.println(Arrays.toString(time));
        }
    }
}
