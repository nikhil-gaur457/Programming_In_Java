/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 29-07-2022
 *   Time: 22:08
 *   File: Main.java
 */

package rabitAndTortoise;

import rabitAndTortoise.thread.Rabbit;
import rabitAndTortoise.thread.Tortoise;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.getRabbit().start();
        Tortoise tortoise = new Tortoise();
        tortoise.getTortoise().start();
    }
}