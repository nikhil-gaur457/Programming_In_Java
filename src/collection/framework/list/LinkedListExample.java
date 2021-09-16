/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 16-09-2021
 *   Time: 14:50
 *   File: LinkedListExample.java
 */

package collection.framework.list;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of linkedList");
        int n = scanner.nextInt();

        // Declaring the LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Appending elements in LinkedList
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }

        System.out.println(linkedList);

        linkedList.remove(2);

        System.out.println(linkedList);

        for (Integer integer : linkedList) {
            System.out.print(linkedList.get(integer) + " ");
        }

    }
}