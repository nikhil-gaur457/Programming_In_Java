/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 04-11-2020
 *   Time: 20:15
 *   File: NumberOfNotes.java
 */

package selfPractice;

import java.util.Scanner;

public class NumberOfNotes {
    public static void main(String[] args) {
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        int amount = scanner.nextInt();
        int copyOfAmount = amount;
        int noteCounter = 0;
        int count = 0;
        for (int i = 0; i < 9; i++) {
            count = amount / notes[i];
            if (count != 0) {
                System.out.println(notes[i] + "\tx\t" + count + "\t=\t" + notes[i] * count);
            }
            noteCounter = noteCounter + count;
            amount = amount % notes[i];
        }
        System.out.println("-------------------------------");
        System.out.println("Total                   = " + copyOfAmount);
        System.out.println("-------------------------------");
        System.out.println("Total number of notes\t= " + noteCounter);
    }
}