/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 18-09-2021
 *   Time: 10:23
 *   File: LinkedListSetExample.java
 */

package collection.framework.set;

import java.util.LinkedList;

public class LinkedListSetExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Nikhil");
        linkedList.add("Gaur");
        linkedList.add("Nikhil");
        linkedList.add("b.tech");
        linkedList.add("Computer Science");

        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}