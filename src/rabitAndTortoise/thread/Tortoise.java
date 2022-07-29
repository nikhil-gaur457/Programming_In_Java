/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 29-07-2022
 *   Time: 22:09
 *   File: Tortoise.java
 */

package rabitAndTortoise.thread;

import javax.swing.*;

public class Tortoise extends Thread {
    public static final int MILESTONES = 5;
    private final Thread tortoise;

    public Tortoise() {
        this.tortoise = new Thread(this, "Tortoise");
    }

    public Thread getTortoise() {
        return tortoise;
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0 -> System.out.println("The Tortoise has started from the start line!");
                case 1 -> System.out.println("The Tortoise has reached the Cool River!");
                case 2 -> System.out.println("The Tortoise has reached the Mountain Hill!");
                case 3 -> System.out.println("The Tortoise has reached the Big Oak Tree!");
                case 4 -> System.out.println("The Tortoise has reached the finish line!");
            }
            try {
                Thread.sleep(6000L);
            } catch (InterruptedException e) {
                System.out.println("The Tortoise has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Tortoise has completed the race!",
                "Tortoise",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}