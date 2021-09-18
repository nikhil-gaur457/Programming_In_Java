/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 18-09-2021
 *   Time: 10:48
 *   File: PriorityQueue.java
 */

package collection.framework.queue;

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(12);
        priorityQueue.add(16);
        priorityQueue.add(20);
        priorityQueue.add(25);
        priorityQueue.add(27);
        System.out.println(priorityQueue.peek()); // Print top element of queue.
        System.out.println(priorityQueue.poll()); // Print top element of queue and remove it.
        System.out.println(priorityQueue.peek()); // print top element of queue.
    }
}