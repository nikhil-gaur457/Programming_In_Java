/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 16-09-2021
 *   Time: 13:48
 *   File: CollectionDemo.java
 */

package collection.framework;

import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {
    public static void main(String[] args) {
        // Create instances of the array, vector, hashtable
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Vector<Integer> vector = new Vector<>();
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Adding elements into the vector
        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);

        // Adding elements into the hashtable
        hashtable.put(1, "Nikhil");
        hashtable.put(2, "Gaur");
        hashtable.put(3, "B.tech");

        System.out.println(arr[0]);
        System.out.println(vector.elementAt(0));
        System.out.println(hashtable.get(1));

    }
}