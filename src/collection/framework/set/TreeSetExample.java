/*   Created by IntelliJ IDEA.
 *   Author: Nikhil gaur (nikhil-gaur457)
 *   Date: 17-09-2021
 *   Time: 19:10
 *   File: TreeSetExample.java
 */

package collection.framework.set;

import java.util.TreeSet;

public class TreeSetExample {
    // The TreeSet class uses a Tree for storage. The ordering of the elements is maintained by a set using their natural ordering whether or not an explicit comparator is provided.
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Nikhil");
        treeSet.add("Gaur");
        treeSet.add("B.tech");
        treeSet.add("Computer Science");
        treeSet.add("Fifth Semester");


        /*
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        */
        for (String s : treeSet) System.out.println(s);
    }
}