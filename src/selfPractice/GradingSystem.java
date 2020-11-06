/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 06-11-2020
 *   Time: 21:13
 *   File: GradingSystem.java
 */

package selfPractice;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marks of five subjects ->");
        int marksOfFirstSubject = scanner.nextInt();
        int marksOfSecondSubject = scanner.nextInt();
        int marksOfThirdSubject = scanner.nextInt();
        int marksOfFourthSubject = scanner.nextInt();
        int marksOfFifthSubject = scanner.nextInt();
        float average = (marksOfFirstSubject + marksOfSecondSubject +
                marksOfThirdSubject + marksOfFourthSubject + marksOfFifthSubject) / 5;

        System.out.println("Your average is " + average);
        if (average >= 70) {
            System.out.println("Your grade is A");
        } else if (average >= 60 && average < 70) {
            System.out.println("Your grade is B");
        } else if (average >= 50 && average < 60) {
            System.out.println("Your grade is C");
        } else if (average >= 40 && average < 50) {
            System.out.println("Your grade is B");
        } else {
            System.out.println("Fail");
        }
    }
}