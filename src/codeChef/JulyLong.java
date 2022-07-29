/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 09-07-2022
 *   Time: 11:25
 *   File: JulyLong.java
 */

package codeChef;

import java.util.Scanner;

public class JulyLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            int count = 0;
            int sum = 0;
            int even = 0;
            int odd = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 1) {
                    count++;
                }
                sum = sum + arr[i];
                if (arr[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            if(count > 1) {
                System.out.println("Chefina");
            } else  if (even == 0) {
                System.out.println("Chefina");
            } else if (odd == 0) {
                System.out.println("Chef");
            } else if (sum % 2 == 0) {
                System.out.println("Chefina");
            } else {
                System.out.println("Chef");
            }
        }
    }
}


/*
int maxT = scanner.nextInt();
            int maxN = scanner.nextInt();
            int sumN = scanner.nextInt();
            int n = sumN / maxN;
            int remainder = sumN % maxN;
            int ans = 0;
            if ((maxT * maxN) <= sumN) {
                System.out.println(maxT*maxN*maxN);
            } else {
                if (sumN % maxN == 0) {
                    ans = n * (maxN * maxN);
                    System.out.println(ans);
                } else {
                    ans = n * (maxN * maxN);
                    System.out.println(ans + (remainder*remainder));
                }
            }
 */



/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();
            int ans = bfs(x1 - 1, y1 - 1, x2 - 1, y2 - 1);
            if (ans % 2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static int bfs(int sr, int sc, int dr, int dc) {
        boolean[][] check = new boolean[8][8];
        LinkedList<Integer> ls = new LinkedList<>();
        int[][] moves = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};
        ls.add(sr * 8 + sc);
        int point = 1;
        while (!ls.isEmpty()) {
            int size = ls.size();
            while (size-- > 0) {
                int start = ls.removeFirst();
                int rightRow = start / 8;
                int rightColumn = start % 8;
                for (int[] move : moves) {
                    int row = rightRow + move[0];
                    int column = rightColumn + move[1];
                    if (row >= 0 && column >= 0 && row < 8 && column < 8 && !check[row][column]) {
                        check[row][column] = true;
                        if (row == dr && column == dc) {
                            return point;
                        }
                        ls.addLast(row * 8 + column);
                    }
                }
            }
            point++;
        }
        return -1;
    }
 */

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            int oddCount = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                int odd = arr[i] & 1;
                if (odd % 2 != 0) {
                    oddCount++;
                }
                if (min >= arr[i]) {
                    min = arr[i];
                }
            }
            if (min == 1) {
                System.out.println("CHEF");
            } else if (oddCount % 2 == 0) {
                System.out.println("CHEFINA");
            } else {
                System.out.println("CHEF");
            }
        }
    }
 */