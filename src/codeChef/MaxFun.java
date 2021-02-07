package codeChef;

import java.util.Scanner;

public class MaxFun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int N = scanner.nextInt();
            long[] arr = new long[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            long min = arr[0];
            long max = arr[0];
            for (int i = 0; i < N; i++) {
                min = Math.min(arr[i], min);
                max = Math.max(arr[i], max);
            }
            long maxValue = 2 * (max - min);
            System.out.println(maxValue);
        }
    }
}
