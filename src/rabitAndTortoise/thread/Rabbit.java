/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 29-07-2022
 *   Time: 22:09
 *   File: Rabbit.java
 */

package rabitAndTortoise.thread;

import javax.swing.*;

public class Rabbit implements Runnable {
    private static final int MILESTONES = 5;

    private final Thread rabbit;

    public Rabbit() {
        this.rabbit = new Thread(this, "Rabbit");
    }

    public Thread getRabbit() {
        return rabbit;
    }

    @Override
    public void run() {
        for (int index = 0; index < MILESTONES; index++) {
            switch (index) {
                case 0 -> System.out.println("The Rabbit has started from the start line!");
                case 1 -> System.out.println("The Rabbit has reached the Cool River!");
                case 2 -> System.out.println("The Rabbit has reached the Mountain Hill!");
                case 3 -> {
                    System.out.println("The Rabbit has reached the Big Oak Tree!");
                    System.out.println("The Rabbit is leading and hence is going to sleep!");
                    try {
                        Thread.sleep(18000L);
                    } catch (InterruptedException e) {
                        System.err.println("The Rabbit's sleep got interrupted!");
                    }
                }
                case 4 -> System.out.println("The Rabbit has reached the finish line!");
            }
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                System.err.println("The rabbit has lost the path!");
            }
        }
        JOptionPane.showConfirmDialog(
                null,
                "The Rabbit has completed the race!",
                "Rabbit",
                JOptionPane.OK_CANCEL_OPTION
        );
    }
}