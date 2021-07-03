/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 15-05-2021
 *   Time: 00:13
 *   File: TTT.java
 */

package codeChef;

import java.util.Scanner;

class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int countCross = 0;
            int countZero = 0;
            int countUnderscore = 0;
            char[][] A = new char[3][3];
            for (int i = 0; i < 3; i++) {
                String str = "";
                if (scanner.hasNext()) {
                    str = scanner.next();
                } else {
                    break;
                }
                for (int j = 0; j < 3; j++) {
                    A[i][j] = str.charAt(j);
                    if (A[i][j] == 'X') {
                        countCross++;
                    } else if (A[i][j] == 'O') {
                        countZero++;
                    } else {
                        countUnderscore++;
                    }
                }
            }

            int winX = 0;
            int winO = 0;

            if (A[0][0] == 'X' && A[0][1] == 'X' && A[0][2] == 'X') {
                winX = 1;
            }
            if (A[1][0] == 'X' && A[1][1] == 'X' && A[1][2] == 'X') {
                winX = 1;
            }
            if (A[2][0] == 'X' && A[2][1] == 'X' && A[2][2] == 'X') {
                winX = 1;
            }
            if (A[0][0] == 'X' && A[1][0] == 'X' && A[2][0] == 'X') {
                winX = 1;
            }
            if (A[0][1] == 'X' && A[1][1] == 'X' && A[2][1] == 'X') {
                winX = 1;
            }
            if (A[0][2] == 'X' && A[1][2] == 'X' && A[2][2] == 'X') {
                winX = 1;
            }
            if (A[0][0] == 'X' && A[1][1] == 'X' && A[2][2] == 'X') {
                winX = 1;
            }
            if (A[0][2] == 'X' && A[1][1] == 'X' && A[2][0] == 'X') {
                winX = 1;
            }
            if (A[0][0] == 'O' && A[0][1] == 'O' && A[0][2] == 'O') {
                winO = 1;
            }
            if (A[1][0] == 'O' && A[1][1] == 'O' && A[1][2] == 'O') {
                winO = 1;
            }
            if (A[2][0] == 'O' && A[2][1] == 'O' && A[2][2] == 'O') {
                winO = 1;
            }
            if (A[0][0] == 'O' && A[1][0] == 'O' && A[2][0] == 'O') {
                winO = 1;
            }
            if (A[0][1] == 'O' && A[1][1] == 'O' && A[2][1] == 'O') {
                winO = 1;
            }
            if (A[0][2] == 'O' && A[1][2] == 'O' && A[2][2] == 'O') {
                winO = 1;
            }
            if (A[0][0] == 'O' && A[1][1] == 'O' && A[2][2] == 'O') {
                winO = 1;
            }
            if (A[0][2] == 'O' && A[1][1] == 'O' && A[2][0] == 'O') {
                winO = 1;
            }

            if (((winX == 1) && (winO == 1) || (countCross - countZero) > 1 || (countCross - countZero) < 0)) {
                System.out.println("3");
            } else if (countZero == 0 && countCross == 0 && countUnderscore == 9) {
                System.out.println("2");
            } else if (countCross > countZero && winX == 1 && winO == 0) {
                System.out.println("1");
            } else if (countCross == countZero && winX == 0 && winO == 1) {
                System.out.println("1");
            } else if (countUnderscore == 0 && winX == 0 && winO == 0) {
                System.out.println("1");
            } else if (countUnderscore > 0 && winX == 0 && winO == 0 ) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}