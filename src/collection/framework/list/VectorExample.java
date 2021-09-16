/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 16-09-2021
 *   Time: 14:58
 *   File: VectorExample.java
 */

package collection.framework.list;

import java.util.Scanner;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of List");
        int n = scanner.nextInt();

        // Declaring the Vector
        Vector<Integer> vector = new Vector<>();

        //
        for (int i = 0; i <= n; i++) {
            vector.addElement(i);
        }
        System.out.println(vector);

        vector.remove(2);

        System.out.println(vector);

        for (Integer integer: vector
             ) {
            System.out.print(integer + " ");
        }
    }
}