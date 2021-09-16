/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 16-09-2021
 *   Time: 14:41
 *   File: ArrayListExample.java
 */

package collection.framework.list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Declaring the arrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Appending elements in ArrayList
        for (int i = 0; i < 5; i++) {
            arrayList.add(i);
        }

        // Printing elements
        System.out.println(arrayList);

        // removing elements from ArrayList
        arrayList.remove(2);

        System.out.println(arrayList);
        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }
    }
}