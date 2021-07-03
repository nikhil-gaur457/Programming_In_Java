/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 16-05-2021
 *   Time: 01:03
 *   File: ChoriKaMaal.java
 */

package selfPractice;

import java.util.Scanner;

public class ChoriKaMaal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int countX = 0;
            int countO = 0;
            int countUnderscore = 0;
            char[][] arr = new char[3][3];
            for (int i = 0; i < 3; i++) {
                String data = "";
                if (scan.hasNext()) { // input from user
                    data = scan.next();
                } else {
                    break;
                }
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = data.charAt(j);
                    if (arr[i][j] == 'X') {
                        countX++;
                    } else if (arr[i][j] == 'O') {
                        countO++;
                    } else {
                        countUnderscore++;
                    }
                }
            }
            int winX = 0;
            int winO = 0;
            if (arr[0][0] == 'X' && arr[0][1] == 'X' && arr[0][2] == 'X') {
                winX = 1;
            }
            if (arr[1][0] == 'X' && arr[1][1] == 'X' && arr[1][2] == 'X') {
                winX = 1;
            }
            if (arr[2][0] == 'X' && arr[2][1] == 'X' && arr[2][2] == 'X') {
                winX = 1;
            }
            if (arr[0][0] == 'X' && arr[1][0] == 'X' && arr[2][0] == 'X') {
                winX = 1;
            }
            if (arr[0][1] == 'X' && arr[1][1] == 'X' && arr[2][1] == 'X') {
                winX = 1;
            }
            if (arr[0][2] == 'X' && arr[1][2] == 'X' && arr[2][2] == 'X') {
                winX = 1;
            }
            if (arr[0][0] == 'X' && arr[1][1] == 'X' && arr[2][2] == 'X') {
                winX = 1;
            }
            if (arr[0][2] == 'X' && arr[1][1] == 'X' && arr[2][0] == 'X') {
                winX = 1;
            }
            if (arr[0][0] == 'O' && arr[0][1] == 'O' && arr[0][2] == 'O') {
                winO = 1;
            }
            if (arr[1][0] == 'O' && arr[1][1] == 'O' && arr[1][2] == 'O') {
                winO = 1;
            }
            if (arr[2][0] == 'O' && arr[2][1] == 'O' && arr[2][2] == 'O') {
                winO = 1;
            }
            if (arr[0][0] == 'O' && arr[1][0] == 'O' && arr[2][0] == 'O') {
                winO = 1;
            }
            if (arr[0][1] == 'O' && arr[1][1] == 'O' && arr[2][1] == 'O') {
                winO = 1;
            }
            if (arr[0][2] == 'O' && arr[1][2] == 'O' && arr[2][2] == 'O') {
                winO = 1;
            }
            if (arr[0][0] == 'O' && arr[1][1] == 'O' && arr[2][2] == 'O') {
                winO = 1;
            }
            if (arr[0][2] == 'O' && arr[1][1] == 'O' && arr[2][0] == 'O') {
                winO = 1;
            }
            if (((winX == 1) && (winO == 1)) || (countX - countO) < 0 || (countX - countO) > 1) {
                System.out.println("3");
            } else if (countX == 0 && countO == 0 && countUnderscore == 9) {
                System.out.println("2");
            } else if (winX == 1 && winO == 0 && countX > countO) {
                System.out.println("1");
            } else if (winX == 0 && winO == 1 && countX == countO) {
                System.out.println("1");
            } else if (winX == 0 && winO == 0 && countUnderscore == 0) {
                System.out.println("1");
            } else if (winX == 0 && winO == 0 && countUnderscore > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
    }
}