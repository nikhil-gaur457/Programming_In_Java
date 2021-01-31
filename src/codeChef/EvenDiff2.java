package codeChef;

import java.util.Scanner;

public class EvenDiff2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int lengthOfArray = scanner.nextInt();
            int[] arr = new int[lengthOfArray];
            int countOdd = 0;
            int sumOfArr = 0;
            for (int i = 0; i < lengthOfArray; i++) {
                arr[i] = scanner.nextInt();
                sumOfArr = sumOfArr + arr[i];
            }
            if (sumOfArr % 2 == 0) {
                System.out.println("0");
            }
            else if (sumOfArr % 2 != 0) {
                sumOfArr = sumOfArr + 1;
                countOdd++;
                System.out.println(countOdd);
            }
        }
    }
}
