/*   Created by IntelliJ IDEA.
 *   Author: Nikhil Gaur (n-g457)
 *   Date: 31-07-2020
 *   Time: 23:45
 *   File: WhileExample.java
 */

package selfPractice;

// TODO Do not forget to import the Scanner class from the java.util package.
import java.util.Scanner;


public class WhileExample {
    // This is the total number of participants allowed in the conference.
    // DO NOT CHANGE/REMOVE THIS CODE.
    private static final byte TOTAL_PARTICIPANTS = 100;

    // This method will sell the ticket to the participant.
    // DO NOT CHANGE/REMOVE THIS CODE.
    private static void sellTicket(String participantName) {
        String message = "Congratulations, " + participantName + "." + "See you at the conference!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        // TODO 1 Create a `byte` variable to store the number of tickets sold and set it to zero.
        byte numberOfTicketsSold = 0;

        // TODO 2 Create a while loop, and check if the number of tickets sold is less than or equal to the total
        //  participants.
        while (numberOfTicketsSold <= TOTAL_PARTICIPANTS) {

            // TODO 3 Print out the "Total Tickets Left: ".
            System.out.println("Total tickets left : " + (TOTAL_PARTICIPANTS - numberOfTicketsSold));

            // TODO 4 Print out a message to the participant and ask them to input their name.
            System.out.print("Please enter your name : ");

            // TODO 5 Create an object of the Scanner class.
            Scanner scanner = new Scanner(System.in);

            // TODO 6 Create a String variable to store the participant's name and input the value with the scanner
            //  class' method.
            String participantName = scanner.nextLine();

            // TODO 7 Call the sellTicket method and pass the participant's name to the method.
            WhileExample.sellTicket(participantName);

            // TODO 8 Increase the number of tickets sold.
            numberOfTicketsSold += 1;

            // TODO 9 Check if the number of tickets sold is equal to the total number of participants allowed.
            if (numberOfTicketsSold == TOTAL_PARTICIPANTS) {

                // TODO 10 If yes, then print a message to the console, saying "Sorry, The tickets are sold-out!"
                System.out.println("Sorry, The tickets are sold-out! ");

                // TODO 11 Break out of the while loop.
                break;

            }
        }
        // TODO 12 Remove ALL the TODO comments.
    }
}
