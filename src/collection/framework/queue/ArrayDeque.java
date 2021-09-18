/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 18-09-2021
 *   Time: 11:19
 *   File: ArrayDeque.java
 */

package collection.framework.queue;

public class ArrayDeque {
    public static void main(String[] args) {
        java.util.ArrayDeque<Integer> arrayDeque = new java.util.ArrayDeque<>();
        arrayDeque.add(12);
        arrayDeque.add(15);
        arrayDeque.add(17);
        arrayDeque.add(21);
        arrayDeque.add(25);
        System.out.println(arrayDeque); // Print array deque.
        System.out.println("------------------------------");

        arrayDeque.clear(); // Method to clear the array deque.
        System.out.println(arrayDeque);
        System.out.println("------------------------------");

        // Adding elements at the first.
        arrayDeque.addFirst(51);
        arrayDeque.add(50);
        System.out.println(arrayDeque);
        System.out.println("------------------------------");

        // Adding elements at the last
        arrayDeque.addLast(10);
        arrayDeque.addLast(5);
        System.out.println(arrayDeque);
    }
}