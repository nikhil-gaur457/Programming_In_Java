package codeChef;

import java.util.Scanner;

public class EvenDiff {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int lengthOfArray = scanner.nextInt();
            int[] arr = new int[lengthOfArray];
            int count = 0;
            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < lengthOfArray - 1; i++) {
                if ((arr[i] - arr[i]) % 2 == 0 && (arr[i] - arr[i + 1]) % 2 == 0 && (arr[i + 1] - arr[i]) % 2 == 0 && (arr[i + 1] - arr[i + 1]) % 2 == 0) {
                    System.out.println("0");
                } else if ((arr[i] - arr[i + 1]) % 2 != 0 && (arr[i + 1] - arr[i]) % 2 != 0) {
                    count++;
                    if (count % 2 != 0) {
                        System.out.println(count);
                    }
                }
            }
        }
    }
}
