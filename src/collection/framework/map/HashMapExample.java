/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 18-09-2021
 *   Time: 11:44
 *   File: HashMapExample.java
 */

package collection.framework.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    // HashMap provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs. To access a value in a HashMap, we must know its key.
    public static void main(String[] args) {
        // HashMap<k, v> hashMap = new HashMap<k, v>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Nikhil");
        hashMap.put(2, "Gaur");
        hashMap.put(3, "B.tech");
        hashMap.put(4, "Computer Science");

        System.out.println("value of 1 is " + hashMap.get(1));

        for (Map.Entry<Integer, String> e: hashMap.entrySet()
             ) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}