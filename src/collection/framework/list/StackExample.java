/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 16-09-2021
 *   Time: 15:13
 *   File: StackExample.java
 */

package collection.framework.list;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Nikhil");
        stack.push("Gaur");
        stack.push("B.tech");
        stack.push("Computer Science");

        Iterator<String> iterator = stack.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        stack.pop();
        iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}