/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 17-09-2021
 *   Time: 18:57
 *   File: HashSetExample.java
 */

package collection.framework.set;

import java.util.HashSet;

public class HashSetExample {
    // The HashSet class is an inherent implementation of the hash table data structure. The objects that we insert into the HashSet do not guarantee to be inserted in the same order. The objects are inserted based on their hashcode. This class also allows the insertion of NULL elements.
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Nikhil");
        hashSet.add("Gaur");
        hashSet.add("B.tech");
        hashSet.add("Computer Science");
        hashSet.add("Third Semester");

        for (String s : hashSet) System.out.println(s);
    }
}